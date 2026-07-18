import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Deque<Character> stack = new ArrayDeque<>();
        
        
        for(char a:s.toCharArray()){
            if(a == '('){
                stack.push(a);
            }
            else{
                if(stack.isEmpty()){
                    answer=false;
                    return answer;
                }
                stack.pop();
                
            }   
        }
        return !stack.isEmpty() ? answer =false : answer;
    }
}