class Solution {
    public void setZeroes(int[][] matrix) {
       Stack<int[]> st = new Stack<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0) st.push(new int[]{i,j});
            }
        }
        while(!st.isEmpty()){
            int[] curr = st.pop();
        //logic
            findUp(curr[0],curr[1],matrix);
             findDown(curr[0],curr[1],matrix);
             findRight(curr[0],curr[1],matrix);
             findLeft(curr[0],curr[1],matrix);
        }
    }
    void findUp(int i,int j, int[][] matrix){
        if(i < 0) return;
        matrix[i][j]=0;
        findUp(i-1,j,matrix);
    }
     void findDown(int i,int j, int[][] matrix){
        if( matrix[0].length <= j ) return;
        matrix[i][j]=0;
        findDown(i,j+1,matrix);
    }
     void findRight(int i,int j, int[][] matrix){
        if(  matrix.length  <= i) return;
        matrix[i][j]=0;
        findRight(i+1,j,matrix);
    }
     void findLeft(int i,int j, int[][] matrix){
        if(j < 0) return;
        matrix[i][j]=0;
        findLeft(i,j-1,matrix);
    }
}