class Solution {
	public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
		int dist[] = new int[V];
		Arrays.fill(dist, 100000000);
		dist[src] = 0;
		for (int i = 0; i<V - 1; i++) {
			for (int[]edge:edges) {
				int u = edge[0];
				int v = edge[1];
				int w = edge[2];
				if (dist[u] != 100000000 && dist[u]+w<dist[v]) {
					dist[v] = dist[u]+w;
				}
			}
		}
		for (int[]edge:edges) {
			int u = edge[0];
			int v = edge[1];
			int w = edge[2];
			if (dist[u] != 100000000 && dist[u]+w<dist[v]) {
				ArrayList<Integer> ans = new ArrayList<>();
				ans.add(-1);
				return ans;
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int num:dist) {
			ans.add(num);
		}
		return ans;
		
	}
}
