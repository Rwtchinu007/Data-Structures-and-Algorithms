// class Solution {
//     private void dfs(int city, int[][] isConnected, boolean[] visited) {

//         visited[city] = true;

//         for (int j = 0; j < isConnected.length; j++) {

//             if (isConnected[city][j] == 1 && !visited[j]) {
//                 dfs(j, isConnected, visited);
//             }
//         }
//     }

//     public int findCircleNum(int[][] isConnected) {
//         int n = isConnected.length;
//         boolean[] visited = new boolean[n];

//         int provinces = 0;
//         for (int i = 0; i < n; i++) {

//             if (!visited[i]) {
//                 provinces++;

//                 dfs(i, isConnected, visited);
//             }
//         }

//         return provinces;
//     }
// }


// Better solution using Disjoint Set Union (DSU)
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

    void union(int u,int v){
        int ul_u = findByParent(u);
        int ul_v = findByParent(v);
        if(ul_u == ul_v) return ;
        if(rank[ul_u]>rank[ul_v]) parent[ul_v] = ul_u;
       else if(rank[ul_v]>rank[ul_u]) parent[ul_u] = ul_v;
       else{
        parent[ul_v] =ul_u;
        rank[ul_u]++;
       }
    }

    boolean isConnected(int u,int v){
        return findByParent(u) == findByParent(v);
    }

}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        DisjointSet ds = new DisjointSet(isConnected.length);
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && !ds.isConnected(i,j)){

                    ds.union(i,j);
                    provinces--;
                }
            }
        }
        return provinces;

    }
}