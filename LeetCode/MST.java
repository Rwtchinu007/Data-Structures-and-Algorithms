class Pair{
    int vertex;
    int weight;
    Pair(int vertex,int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}
class Solution {
    public int spanningTree(int V, int[][] edges) {
     ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
     for(int i=0;i<V;i++){
         adj.add(new ArrayList<>());
     }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        int sum = 0;
        boolean[] isVis = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.offer(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair obj = pq.poll();
            int v = obj.vertex;
            int w = obj.weight;
            if(isVis[v]) continue;
            isVis[v] = true;
            sum+=w;
            for(int i=0;i<adj.get(v).size();i++){
                Pair neigh = adj.get(v).get(i);
                if(!isVis[neigh.vertex]){
                    pq.offer(new Pair(neigh.vertex,neigh.weight));
                }
            }
        }
        return sum;
    }
}
