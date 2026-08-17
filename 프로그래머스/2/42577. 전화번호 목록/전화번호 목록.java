import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        
        for(String num:phone_book){
            set.add(num);
        }
        
        for(String phone:phone_book){
            for(int i = 1; i < phone.length(); i++) {
                String prefix = phone.substring(0, i);
                if(set.contains(prefix)){
                    answer = false;
                }
            }
        }
       return answer;
   }
}