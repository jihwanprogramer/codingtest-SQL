class Solution {
    public int answer =0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ;i<n;i++){
            if(!visited[i]){
                answer++;
                dfs(n,computers,visited,i);
            }
        }
        
        
        return answer;
    }
    public void dfs(int n, int[][] computers,boolean[] visited,int curr){
        visited[curr] = true;
        
        for(int i = 0 ; i<n;i++){
            if(computers[curr][i] == 1 && !visited[i]){
                
                dfs(n,computers,visited,i);
            }
        }
    }
}