class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ice=0;
        for( int i=0;i<costs.length;i++){
            if(coins==0) break;
            if(costs[i]<=coins){
                ice++;
                coins-=costs[i];
            }
        }
        return ice;
    }
}