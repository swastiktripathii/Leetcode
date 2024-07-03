class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int c = 0;
        for(int i =0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void dfs(char[][] grid, int row, int col){
    if(row<0 || col<0 || row>=grid.length || col>=grid[row].length || grid[row][col] != '1'){
        return;
    }
    grid[row][col] = '0';
    dfs(grid, row, col-1); // go left
    dfs(grid, row-1, col); // go up
    dfs(grid, row, col+1); // go right
    dfs(grid, row+1, col); // go down
}
}