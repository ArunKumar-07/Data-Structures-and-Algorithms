
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        class Pair{
    int row ;
    int col;
    Pair(int row ,int col){
        this.row=row;
        this.col=col;
    }
}
        Queue<Pair> qu = new LinkedList<>();
        int n= mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        for( int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                if(mat[i][j]==0){
                    qu.offer(new Pair(i,j));
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=-1;
                    }
                }
        }
        
        while(!qu.isEmpty()){
        Pair temp = qu.poll();
        int row = temp.row;
        int col = temp.col;
            
        if(isValid(row,col+1,n,m) && ans[row][col+1]==-1){
            qu.offer(new Pair(row,col+1));
            ans[row][col+1]=ans[row][col]+1;    
        }
            
            if(isValid(row,col-1,n,m) && ans[row][col-1]==-1){
            qu.offer(new Pair(row,col-1));
            ans[row][col-1]=ans[row][col]+1;    
        }
            
            if(isValid(row+1,col,n,m) && ans[row+1][col]==-1){
            qu.offer(new Pair(row+1,col));
            ans[row+1][col]=ans[row][col]+1;    
        
        }
            if(isValid(row-1,col,n,m) && ans[row-1][col]==-1){
            qu.offer(new Pair(row-1,col));
            ans[row-1][col]=ans[row][col]+1;   
        }
        }
        return ans;
        
    }
                
       private boolean isValid(int row, int col,int n , int m){
        if(row < 0 || row >=n || col <0 || col>=m){
       return false;
        }
        return true;
    }
}  
    