class Solution {
    public void setZeroes(int[][] matrix) {
        boolean frow=false,fcol=false;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for( int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(i==0) frow=true;
                    if(j==0)fcol=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0) matrix[i][j]=0;
            }
        }
        if(frow){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(fcol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        
    }
}