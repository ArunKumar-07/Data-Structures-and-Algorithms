class Solution {
    public void nextPermutation(int[] nums) {
        int point = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                point = i;
                break;
            }
        }
        if(point == -1 ){
            rev(nums,0,nums.length-1);
            return;
        }
      for(int i=nums.length-1;i>=point;i--){
          if(nums[point] < nums[i]){
              int temp = nums[i];
              nums[i] = nums[point];
              nums[point] = temp;
              break;
          }
      }
        System.out.println(Arrays.toString(nums));
        rev(nums,point+1,nums.length-1);
        
    }
    void rev(int[] nums,int first , int second){
        while(first < second){
            int temp = nums[first] ;
            nums[first] = nums[second];
            nums[second] = temp;
            first++;
            second--;
        }
    }
}