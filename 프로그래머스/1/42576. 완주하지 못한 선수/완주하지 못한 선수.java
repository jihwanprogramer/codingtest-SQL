import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> map = new HashMap<>();
        for(String s:participant){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        
        for(String name:completion){
            map.put(name,map.get(name)-1);
        }
       
        for(String ans:map.keySet()){
            if(map.get(ans)>0){
                answer=ans;
            }
        }
        return answer;
    }
}