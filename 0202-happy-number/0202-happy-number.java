class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
         while( n!=1){
             int sum =0;
             int current = n;
             while(current != 0){
                 sum+=  ( current % 10) * ( current  % 10);
                 current /=10;
             }
             if(set.contains(sum)) return false;
             set.add(sum);
             n=sum;
         }
        return true;
    }
}