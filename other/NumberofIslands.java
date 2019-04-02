public class NumberofIslands {
	
	public static int dfs(char[][] grid, int i, int j, int count) {
		if(i < 0 || i >= grid.length || j < 0 || j>= grid[0].length || grid[i][j] == '0') return count;
        grid[i][j] = '0';
        dfs(grid,i+1,j,count);
        dfs(grid,i-1,j,count);
        dfs(grid,i,j+1,count);
        dfs(grid,i,j-1,count);
        count = count + 1;
		return count;
	}
    
    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int nums = 0;
		for(int i = 0; i<grid.length; i++) {
			for(int j = 0; j< grid[0].length; j++) {
				if(grid[i][j] == '1') {
					 nums += dfs(grid,i,j,0);
				}
			}
		}
		return nums;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
