import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        
        Map<Character,Integer> maps =new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
            if(!maps.containsKey(s.charAt(i))==true){
                result[i] = -1;
                maps.put(s.charAt(i),i);
                continue;
            }
            result[i] = i - maps.get(s.charAt(i));
            maps.put(s.charAt(i),i);
            
        }
        return result;
  }
}