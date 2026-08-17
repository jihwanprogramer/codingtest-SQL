import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> que = new ArrayDeque<>();
        
        for(int i = 0; i < priorities.length ; i++){
            que.add(new int[]{i,priorities[i]});
        }
        
        while(!que.isEmpty()){
            boolean high = false;
            int[] curr = que.poll();
            
            for(int[] i:que){
                if(curr[1] <i[1]){
                    high = true;
                    break;
                }
            }
            
            if(high){            
               que.add(new int[]{curr[0],curr[1]});
            }else{
                answer++;
                if(curr[0] == location){
                break;
            }
            }
        }
        return answer;
    }
}