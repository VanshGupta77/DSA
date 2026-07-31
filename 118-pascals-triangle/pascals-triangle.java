class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<= i; j++){
                if(j == 0 || j == i){ //when index becomes 0 or 1 for new row
                    row.add(1);
                }
                else{
                    int var = result.get(i - 1).get(j - 1) +result.get(i - 1).get(j); //To add 1 on previous row(i - 1) and add 1 on both sides of previous row (j - 1 ) , (j)
                    row.add(var);
                }
            }
            result.add(row);
        }
        return result;
    }
}