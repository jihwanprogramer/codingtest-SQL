import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int num:scoville){
            queue.add(num);
        }
        
        while(queue.peek()<K){
            if(queue.size() < 2){
                return -1;
            }
            int curr = queue.poll();
            int second = queue.poll();
            int sum = curr + second*2;
            queue.add(sum);
            answer++;
        
        }
        return answer;
    }
}