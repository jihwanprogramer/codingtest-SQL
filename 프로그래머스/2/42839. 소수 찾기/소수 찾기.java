import java.util.*;
class Solution {
    public int answer = 0;
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0 ; i< numbers.length() ; i++){
            nums.add(numbers.charAt(i)-'0');
        }
        boolean[] visited = new boolean[numbers.length()];
        dfs(nums,visited,0,0);
        return answer;
    }
    public void dfs(List<Integer> nums,boolean[] visited,int start,int number){
        if(start>0){
            boolean prime =true;
            
            if(number < 2){
                prime = false;
            }
           
             for(int i = 2; i < number; i++){
                if(number % i == 0){
                    prime = false;
                    break;
                }
            }
            
            if(prime){
               if(set.add(number)){
                    answer++;
                }
            }
        }
        for(int i= 0 ; i<nums.size() ; i++){
            if(visited[i]){
                continue;
            }
            
            visited[i] = true;
            dfs(nums,visited,start+1,number*10 + nums.get(i));
            visited[i] = false;
            
        }
    }
}