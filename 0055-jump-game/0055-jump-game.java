class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length ==1 ) return true;
        int n = nums.length-1;
        System.out.println(n);
        boolean[] check = new boolean[nums.length];
        check[0]= true;
        for(int i=0;i<n;i++){
            if(check[i] == true){
                if(i + nums[i]  >= n){
                    return true;
                }else{
                    int j = i;
                    int number  = i + nums[i];
                    while(j <=  number){
                        check[j] = true;
                        j++;
                    }
                }
            }else{
                return false;
            }
        }
        return false;
    }
}