//Aug 31 2018
public class MaxAreaofIsland {
	public static int DFS(int i, int j, int r, int c, int area,int[][]grid) {
		if(i<0 || i>=r || j<0 || j>=c || grid[i][j] == 0) return area;
        grid[i][j] = 0;
		area ++;
		area = DFS(i-1,j,r,c,area,grid);
		area = DFS(i,j-1,r,c,area,grid);
		area = DFS(i+1,j,r,c,area,grid);
		area = DFS(i,j+1,r,c,area,grid);
		return area;
	}
	public static int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
		int row = grid.length;
		int col = grid[0].length;
        int max = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				if(grid[i][j] == 1) {
					int area = DFS(i,j,row,col,0,grid);
					max = Math.max(area,max);
				}
			}
		}
		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
