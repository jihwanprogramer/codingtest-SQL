class Solution {
    public int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0);
        return answer;
    }
    
    void dfs(int[] numbers,int target,int idx){
        if(idx == numbers.length){
          if(target == 0){
              answer++;
          }
            return;
        }
            dfs(numbers,target - numbers[idx],idx+1);
            dfs(numbers,target + numbers[idx],idx+1);
         } 
}