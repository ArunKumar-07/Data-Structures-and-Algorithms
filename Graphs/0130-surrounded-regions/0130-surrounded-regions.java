class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m=board[0].length; 
        
        //traverse 1row and last row
        for( int i=0;i<m;i++){
            if(board[0][i]=='O')
            dfs(board,0,i);
            if(board[n-1][i]=='O')
            dfs(board,n-1,i);
        }
        //traverse 1 col and last col
        for( int j=0;j<n;j++){
            if(board[j][0]=='O')
            dfs(board,j,0);
            if(board[j][m-1]=='O')
            dfs(board,j,m-1);
        }
        for( int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                
               else if(board[i][j]=='*')
                    board[i][j]='O'; 
            }
        }
    }
    private void dfs(char[][] board, int i , int j){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='X' || board[i][j]=='*') return ;
        
        board[i][j]='*';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
        
    }
}