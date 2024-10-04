class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if(n==2) return skill[0]*skill[1];
        Arrays.sort(skill);
        int added = skill[0] + skill[n-1];
        int sum =0;
        long ans =0;
        for(int i=0;i<n/2;i++){
            int it = skill[i] + skill[n-i-1];
            if(added == it){
                //
                int value = skill[i] * skill[n-i-1];
                ans +=value;
            }else{
                return -1;
            }
        }
        return ans;
    }
}