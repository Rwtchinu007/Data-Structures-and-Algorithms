class Node{
    int vertex;
    int weight;
    Node(int vertex,int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}
class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
    ArrayList<ArrayList<Node>> adj = new ArrayList<>();
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
    }
    for(int []edge:edges){
        int u = edge[0];
        int v = edge[1];
        int w = edge[2];
        adj.get(u).add(new Node(v,w));
        adj.get(v).add(new Node(u,w));
    }
    int dist[] = new int[V];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[src] = 0;
    PriorityQueue<Node> pq = new PriorityQueue<>(
        (a,b)->a.weight-b.weight);
        pq.add(new Node(src,0));
        while(!pq.isEmpty()){
            Node obj = pq.poll();
            int lV = obj.vertex;
            int lW = obj.weight;
            if(lW>dist[lV]) continue;
            for(Node neighbour:adj.get(lV)){
                int nV = neighbour.vertex;
                int nW = neighbour.weight;
                if(dist[lV]+nW<dist[nV]){
                    dist[nV] = dist[lV]+nW;
                    pq.add(new Node(nV,dist[nV]));
                }
            }
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num:dist){
            ans.add(num);
        }
        return ans;
    
    
    }
}