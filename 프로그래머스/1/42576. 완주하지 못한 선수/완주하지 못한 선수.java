import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> mapp = new HashMap<>();
        for(String name : participant){
            mapp.put(name,mapp.getOrDefault(name,0)+1);
        }
        
       for(String name : completion){
           mapp.put(name,mapp.get(name)-1);
       }
        
        for(String name:mapp.keySet()){
            if(mapp.get(name)>0){
                return name;
            }
        }
        
        return "";
    }
}