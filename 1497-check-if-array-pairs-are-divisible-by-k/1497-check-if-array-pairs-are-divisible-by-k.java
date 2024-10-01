class Solution {
    public boolean canArrange(int[] arr, int k) {
     int[] rem = new int[k];
       for(int i=0;i<arr.length;i++){
           int val = arr[i] % k ;
           if(val < 0) {
               val = val + k;
           }
           rem[val]++;
       }
        if(rem[0] % 2 != 0) return false;
        for(int i=1;i<=k/2;i++){
            if(rem[i] != rem[k-i]) return false;
        }
        return true;
    }
}