class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer  = new ArrayList<>();
        List<Integer> prev =  new ArrayList<>();
        prev.add(1);
        outer.add(new ArrayList(prev));
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=0;j<prev.size()-1;j++){
                list.add(prev.get(j)+ prev.get(j+1));
            }
            list.add(1);
            outer.add(new ArrayList(list));
            prev=list;
        }
        return outer;
        
    }
}