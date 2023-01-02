class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
    int rowMax = grid.length;
    int colMax = grid[0].length;
    if(grid[0][0]==1 || grid[rowMax-1][colMax-1]==1)return -1;
     Queue<int[]> qu = new LinkedList<>();
    qu.add(new int[]{0,0,1});
    int[][] direction={ {0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1} };
    while(!qu.isEmpty()){
        int[] location = qu.poll();
        int row = location[0];
        int col = location[1];
        int distance =  location[2];
        if(row==rowMax-1 && col==colMax-1) return distance;
        for( int[] dir : direction){
            int row2=row + dir[0];
            int col2=col + dir[1]; 
            if( row2>=0 && col2>=0 && row2 <rowMax && col2 <colMax && grid[row2][col2]==0 ){
                qu.add(new int[]{row2,col2,distance+1});
                grid[row2][col2]=1;
            }
        }
    }
        return -1;
    }
}