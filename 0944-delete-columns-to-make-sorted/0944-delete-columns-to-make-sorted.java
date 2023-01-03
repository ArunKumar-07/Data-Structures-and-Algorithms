class Solution {
    public int minDeletionSize(String[] strs) {
        int n =strs.length;
        int m =strs[0].length();
        int count=0;
       for( int col=0;col<m;col++){
           for( int row =1;row<n;row++){
               if(strs[row-1].charAt(col) > strs[row].charAt(col)){
                   count++;
                   break;
               }
           }
       }
        return count;
        
    }
}
//lexicographically means alphabet order