class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        
        for (int a : asteroids) {
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int sum = a + st.peek();
                if (sum < 0) {
                    st.pop();
                } else if (sum > 0) {
                    a = 0;
                } else {
                    st.pop();
                    a = 0;
                }
            }
            if (a != 0) {
                st.push(a);
            }
        }

        int[] res = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            res[i] = st.peek();
            st.pop();
            i--;
        }
        return res;
    }
}