class Solution {
    boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean isVis[], boolean pathVis[], Stack<Integer> rec, int Node) {
        isVis[Node] = true;
        pathVis[Node] = true;
        for (int i = 0; i < adj.get(Node).size(); i++) {
            int neigh = adj.get(Node).get(i);
            if (!isVis[neigh]) {
                if(dfs(adj, isVis,pathVis, rec, neigh)) return true;
            }
           else if (pathVis[neigh]) {
                return true; // cycle found
            }
        }
        pathVis[Node] = false;
        rec.push(Node);

        return false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int pre[] : prerequisites) {
            int u = pre[0];
            int v = pre[1];
            adj.get(v).add(u);
        }
        Stack<Integer> rec = new Stack<>();
        boolean isVis[] = new boolean[numCourses];
        boolean pathVis[] = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!isVis[i]) {
                if (dfs(adj, isVis, pathVis, rec, i)) {
                    return new int[0];
                }
            }
        }
        int ans[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            int num = rec.pop();
            ans[i] = num;
        }
        return ans;

    }
}