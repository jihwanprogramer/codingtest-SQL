import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length];
        
        Map<String,Integer> maps =new HashMap<String,Integer>;
        for(int i=0;i<=s.length;i++){
            char a = s.charAt[i];
            
            if(maps.containsKey(a) == true){
                int index = maps.get(result[i]) - i;
                result[i] = index;
            }
            
            maps.put(result[i],i);
            
            
        }
        
        
        
        
        
}
