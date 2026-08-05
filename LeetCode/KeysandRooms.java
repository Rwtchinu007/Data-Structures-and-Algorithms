class Solution {
    void solve(List<List<Integer>> rooms,int currRoom,boolean isVis[]){
        isVis[currRoom] = true;
        for(int i=0;i<rooms.get(currRoom).size();i++){
            int nextRoom = rooms.get(currRoom).get(i);
            if(!isVis[nextRoom]) solve(rooms,nextRoom,isVis);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean isVis[] = new boolean[rooms.size()];
        solve(rooms,0,isVis);
        for(int i=0;i<isVis.length;i++){
            if(!isVis[i]) return false;
        }
        return  true;
    }
}