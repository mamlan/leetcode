//735. Asteroid Collision

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < as.length; i++) {
            if (as[i] > 0) {
                // Push positive asteroids directly
                st.push(as[i]);
            } else {
                // Process collisions
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(as[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(as[i])) {
                    st.pop(); // Both asteroids destroy each other
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(as[i]); // Only push if no collision occurs
                }
            }
        }

        // Construct the output array
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
