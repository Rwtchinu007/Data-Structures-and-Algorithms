
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
        // Path compression
        if (parent[u] == u) {
            return u;
        }
        parent[u] = findByParent(parent[u]);
        return parent[u];
    }

    void union(int u, int v) {
        int ul_u = findByParent(u);
        int ul_v = findByParent(v);
        if (ul_u == ul_v) {
            return;
        }
        // Union by rank
        if (rank[ul_u] > rank[ul_v]) {
            parent[ul_v] = ul_u;
        } else if (rank[ul_v] > rank[ul_u]) {
            parent[ul_u] = ul_v;
        } else {
            parent[ul_v] = ul_u;
            rank[ul_u]++;
        }

    }

    boolean isConnected(int u, int v) {
        return findByParent(u) == findByParent(v);
    }

}

public class Disjoint {

    public static void main(String[] args) {

        DisjointSet ds = new DisjointSet(6);

        ds.union(0, 1);
        ds.union(1, 2);

        ds.union(3, 4);

        System.out.println(ds.isConnected(0, 2)); // true
        System.out.println(ds.isConnected(0, 3)); // false

        ds.union(2, 3);

        System.out.println(ds.isConnected(0, 4)); // true
    }

}
