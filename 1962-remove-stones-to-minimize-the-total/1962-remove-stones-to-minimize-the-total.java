class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> qu = new PriorityQueue<Integer>((x,y)->y-x);
        for( int num : piles){
            qu.add(num);
        }
        for( int i=0;i<k;i++){
             int number =qu.remove();
            int curr=number/2;
            qu.add(number-curr);
        }
        int sum=0;
         while(!qu.isEmpty()){
             sum+=qu.remove();
         }
        return sum;
    }
}