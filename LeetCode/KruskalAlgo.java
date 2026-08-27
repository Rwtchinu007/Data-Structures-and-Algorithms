import java.util.*;

class DisjointSet {
    int[] parent;
    int[] rank;

    DisjointSet(int v) {
        parent = new int[v];
        rank = new int[v];

        for (int i = 0; i < v; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int findByParent(int u) {
        if (parent[u] == u)
            return u;

        parent[u] = findByParent(parent[u]);
        return parent[u];
    }

    void union(int u, int v) {
        int ul_u = findByParent(u);
        int ul_v = findByParent(v);

        if (ul_u == ul_v)
            return;

        // Union by rank
        if (rank[ul_u] > rank[ul_v]) {
            parent[ul_v] = ul_u;
        }
        else if (rank[ul_v] > rank[ul_u]) {
            parent[ul_u] = ul_v;
        }
        else {
            parent[ul_u] = ul_v;
            rank[ul_v]++;
        }
    }
}

class Solution {
    static int kruskalsMST(int V, int[][] edges) {

        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        DisjointSet ds = new DisjointSet(V);

        int sum = 0;
        int edgesTaken = 0;

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (ds.findByParent(u) != ds.findByParent(v)) {

                ds.union(u, v);

                sum += weight;
                edgesTaken++;

                if (edgesTaken == V - 1)
                    break;
            }
        }

        return sum;
    }
}