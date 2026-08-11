class Pair {
    int vertex;
    int weight;

    Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];
            adj.get(u).add(new Pair(v, w));
        }
        int dist[] = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(k, 0));
        while (!pq.isEmpty()) {
            Pair obj = pq.poll();
            int currNode = obj.vertex;
            int currTime = obj.weight;
            if (currTime > dist[currNode])
                continue;
            for (Pair neighbour : adj.get(currNode)) {
                int nextNode = neighbour.vertex;
                int nextTime = neighbour.weight;
                if (currTime + nextTime < dist[nextNode]) {
                    dist[nextNode] = currTime + nextTime;
                    pq.add(new Pair(nextNode, dist[nextNode]));
                }

            }
        }
        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            ans = Math.max(ans, dist[i]);
        }

        return ans;

    }
}