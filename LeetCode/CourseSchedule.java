class Solution {
     boolean dfs( ArrayList<ArrayList<Integer>> adj, boolean recStack[],boolean isVis[],int Node){
        isVis[Node] = true;
        recStack[Node] = true;
        for(int neigh:adj.get(Node)){
            if(!isVis[neigh]){
                if(dfs(adj,recStack,isVis,neigh)) return  true;
            }
            else if(recStack[neigh]) return true;
        }
        recStack[Node] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int prereq[]: prerequisites){
            int u = prereq[0]; // then this....
            int v = prereq[1]; //first
            adj.get(v).add(u);
        }
        boolean isVis[] = new boolean[numCourses];
        boolean recStack[] = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!isVis[i]){
               if( dfs(adj,recStack,isVis,i)) return false;
               //return false isliye kyuki if there is a cycle the course can never be completed..
            }
        }
        return true;
        
    }
}