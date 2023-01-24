class Solution {
    public int snakesAndLadders(int[][] board) {
        int n =board.length;
        int moves=0;
        boolean[][] visited=new boolean[n][n];
        Queue<Integer> qu=new LinkedList<>();
        qu.add(1);
        visited[n-1][0]=true;
        while(!qu.isEmpty()){
            int size=qu.size();
            for( int i=0;i<size;i++){
                int currBoardVal=qu.poll();
                if(currBoardVal==n*n) return moves;
                for( int discVal=1;discVal<=6;discVal++){
                    if(currBoardVal+discVal>n*n) break;
                    int[] pos=findCooridnate(currBoardVal+discVal,n);
                    int row=pos[0];
                    int col=pos[1];
                    if(visited[row][col]==false){
                        visited[row][col]=true;
                        if(board[row][col]==-1){
                            qu.add(currBoardVal+discVal);
                        }
                        else{
                            qu.add(board[row][col]);
                        }
                    }
                }
            }
            moves++;
        }
        return -1;
    }
    //find the coordinates of the point like(2,1)(5,1) 
    int[] findCooridnate(int curr,int n){
        int row=n-(curr-1)/n-1;
        int col=(curr-1)%n;
        if(row%2==n%2) {
            return new int[]{row,n-1-col};
        }
        else{
        return new int[]{row,col};
        }
    }
}