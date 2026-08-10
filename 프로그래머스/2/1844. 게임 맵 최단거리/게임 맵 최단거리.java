import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] check = new boolean[n][m];
        return bfs(0,0,maps,check);
    }
    
    public int bfs(int x,int y,int[][] maps,boolean[][] check){
        int n = maps.length;
        int m = maps[0].length;
        
        int answer =0;
        int[] dc = {1,0,-1,0};
        int[] dr = {0,1,0,-1};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x,y,1});
        check[x][y] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int a = cur[0];
            int b = cur[1];
            int time = cur[2];
            
            if(a == n-1 && b ==m -1){
                return time;
            }
        
            for(int i=0;i<4;i++){
                int nx = a + dc[i];
                int ny = b + dr[i]; 
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(maps[nx][ny] == 1 && !check[nx][ny]){
                        
                        check[nx][ny] = true;
                        queue.add(new int[]{nx,ny,time+1});
                        
                        
                    }
                    
                    
                    
                }
                
            }
            
        }
        
        return -1;
    }
}