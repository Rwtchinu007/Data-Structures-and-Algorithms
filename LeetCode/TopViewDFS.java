/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Pair {
    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {

    public static void solve(Node root, int hd, int level, Map<Integer, Pair> map) {

        if (root == null)
            return;

        
        if (!map.containsKey(hd) || level < map.get(hd).level) {
            map.put(hd, new Pair(root, level));
        }

        solve(root.left, hd - 1, level + 1, map);
        solve(root.right, hd + 1, level + 1, map);
    }

    public ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        TreeMap<Integer, Pair> map = new TreeMap<>();

        solve(root, 0, 0, map);

        for (Pair p : map.values()) {
            ans.add(p.node.data);
        }

        return ans;
    }
}