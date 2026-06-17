class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lost_map = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int loser = matches[i][1];
            lost_map.put(loser, lost_map.getOrDefault(loser, 0) + 1);
        }
        List<Integer> never_lost = new ArrayList<>();
        List<Integer> lost_once = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<matches.length;i++){
            int winner = matches[i][0];
            int loser = matches[i][1];
            if(!lost_map.containsKey(winner)){
                never_lost.add(winner);
                lost_map.put(winner,2);
            }
            if(lost_map.get(loser) == 1){
                lost_once.add(loser);
            }
        }
        Collections.sort(never_lost);
        Collections.sort(lost_once);
        result.add(never_lost);
        result.add(lost_once);

        return result;

    }
}