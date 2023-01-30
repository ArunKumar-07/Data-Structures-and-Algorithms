class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> sets=new HashSet<>();
        for( int i=0;i<row;i++){
            for( int j=0;j<col;j++){
                if(matrix[i][j]==0) {
                    set.add(i);
                    sets.add(j);
                }
            }
        }
        for( int i=0;i<row;i++){
            for( int j=0;j<col;j++){
                if(set.contains(i) || sets.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}