class Solution {
    public int answer = 0;
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(begin,target,words,visited,0);
        return answer;
    }
    
    void dfs(String begin, String target, String[] words,boolean[] visited,int count){
        
        if(target.equals(begin)){
            answer = count;
            return;
        }
        
        for(int i=0;i<words.length;i++){
            int diff = 0;
            if(visited[i]){
                continue;
            }
            for(int j =0;j<begin.length();j++){
                if(begin.charAt(j) != words[i].charAt(j)){
                    diff++;
                }
            }
            if(diff == 1){
                 visited[i] = true;
                 dfs(words[i],target,words,visited,count+1);
                visited[i] = false;
                
            }  
        }
   }
}