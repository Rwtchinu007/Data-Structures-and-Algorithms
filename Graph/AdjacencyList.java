
import java.util.*;

class AdjList {

    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    AdjList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination, boolean isDirected) {
        if (isDirected) {
            adjList.get(source).add(destination);
        } else {
            adjList.get(source).add(destination);
            adjList.get(destination).add(source);
        }
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + "->");
            for (int v : adjList.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}

public class AdjacencyList {

    public static void main(String[] args) {
        AdjList g = new AdjList(4);
        g.addEdge(0, 1, false);
        g.addEdge(0, 2, false);
        g.addEdge(1, 2, false);
        g.addEdge(2, 3, false);
        g.addEdge(3, 0, false);
        g.addEdge(3, 1, false);

        g.printGraph();

    }
}
// this is more efficient than adjacency matrix representation as it takes O(V+E) space.
