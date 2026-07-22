import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = -1;
        int[] end_day= new int[100];
        
        for(int i=0;i<progresses.length;i++){
            while(progresses[i]+ day*speeds[i] <100){
                day++;
            }
            end_day[day]++;
        }
        
        return Arrays.stream(end_day).filter(i->i!=0).toArray();
    }
}