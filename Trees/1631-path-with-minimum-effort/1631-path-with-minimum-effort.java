class Tuple{
        int distance ;
        int first;
        int second;
       public Tuple(int distance, int first ,int second){
            this.distance=distance;
            this.first=first;
            this.second=second;
        }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        
        int[][] dist = new int[n][m];
        for( int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                dist[i][j]=(int)1e9;
            }
        }
        PriorityQueue<Tuple> qu = new PriorityQueue<Tuple>((x,y)->  x.distance - y.distance);
        dist[0][0]=0;
        qu.add(new Tuple(0,0,0));
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        
        while(!qu.isEmpty()){
            
            int length =qu.peek().distance;
            int row = qu.peek().first;
            int col=qu.peek().second;
            qu.remove();
           
            if(row==n-1 && col==m-1) return length;
             for(int i=0;i<4;i++){
                 int newRow=row+dr[i];
                 int newCol=col+dc[i];
                 if( newRow >=0 && newCol>=0 && newRow <n && newCol < m){
                     int effort = Math.max(Math.abs(heights[row][col] - heights[newRow][newCol]),length);
                     if(effort < dist[newRow][newCol]){
                         dist[newRow][newCol]=effort;
                         qu.add(new Tuple(effort,newRow,newCol));

                     }
                     
                 }
             }
           
        }
        return 0;
    }
}
