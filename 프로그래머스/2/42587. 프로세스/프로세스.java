import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        int answer = 0;

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            boolean higher = false;

            for (int[] q : queue) {
                if (q[1] > cur[1]) {
                    higher = true;
                    break;
                }
            }

            if (higher) {
                queue.offer(cur);
            } else {
                answer++;

                if (cur[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}