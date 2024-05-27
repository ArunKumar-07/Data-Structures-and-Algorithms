class Solution {
    public void sortColors(int[] nums) {
      int zero = 0;
        int first = 0;
        int second = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) zero++;
            else if(nums[i] == 1) first++;
            else if(nums[i]==2) second++;
        }
        int i=0;
        while( zero!=0){
            nums[i++]=0;
            zero--;
        }
        while(first!=0){
            nums[i++]=1;
            first--;
        }
        while(second!=0){
            nums[i++]=2;
            second--;
        }
        
        
    }
}