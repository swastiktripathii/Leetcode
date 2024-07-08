class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        pascalTriangle.add(new ArrayList<>());
        pascalTriangle.get(0).add(1);

        for (int currentRow = 1; currentRow < numRows; currentRow++) {
            pascalTriangle.add(new ArrayList<>());

            List<Integer> currentRowList = pascalTriangle.get(currentRow);
            List<Integer> previousRowList = pascalTriangle.get(currentRow - 1);

            currentRowList.add(1);

            for (int j = 1; j < previousRowList.size(); j++) {
                int sum = previousRowList.get(j) + previousRowList.get(j - 1);
                currentRowList.add(sum);
            }

            currentRowList.add(1);
        }

        return pascalTriangle;
    }
}