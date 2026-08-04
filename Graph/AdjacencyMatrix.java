
class AdjMatrix {

    int vertices;
    int[][] matrix;

    AdjMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdge(int source, int destination, boolean isDirected) {
        if (isDirected) {
            matrix[source][destination] = 1;
        } else {
            matrix[source][destination] = 1;
            matrix[destination][source] = 1;
        }
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class AdjacencyMatrix {

    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(4);
        g.addEdge(0, 1, false);
        g.addEdge(0, 2, false);
        g.addEdge(1, 2, false);
        g.addEdge(2, 3, false);
        g.addEdge(3, 0, false);

        g.printGraph();

    }
}

// the problem with this approach is that it takes O(V^2) space even if the graph is sparse. So, we can use adjacency list representation to save space.
