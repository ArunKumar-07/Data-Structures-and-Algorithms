class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer= new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        outer.add(prev);
        for(int i=2;i<=numRows;i++){
            List<Integer> next=new ArrayList<>();
           next.add(1);
            for( int j=1;j<i-1;j++){
                next.add(prev.get(j-1)+prev.get(j));
            }
            next.add(1);
            outer.add(next);
            prev=next;
        }
        return outer;
    }
}