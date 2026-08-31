/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Queue<Node> q = new LinkedList<>();
        Map<Node,Node> map = new HashMap<>();
        q.offer(node);
        map.put(node,new Node(node.val));
        while(q.size()>0){
            Node temp = q.poll();
            for(Node neighbour:temp.neighbors){
                if(!map.containsKey(neighbour)){
                    map.put(neighbour,new Node(neighbour.val));
                    q.offer(neighbour);
                }
                map.get(temp).neighbors.add(map.get(neighbour));
            }
        }
        return map.get(node);
        
    }
}