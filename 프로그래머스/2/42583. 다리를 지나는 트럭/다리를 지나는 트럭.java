import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int total = 0;
        int n=0;
        Deque<Integer> bridge = new ArrayDeque<>();
        
        for(int i=0; i<bridge_length; i++){
            bridge.offer(0);
          }
        
        while(!bridge.isEmpty()){
            answer++;
            
            total -= bridge.poll();
            
            if(n < truck_weights.length) { 

        if(truck_weights[n] + total <= weight) {
            bridge.offer(truck_weights[n]);
            total += truck_weights[n];
            n++;
        } else {
            bridge.offer(0);
        }

    }
            
         
        }   
        return answer;
    }
}
