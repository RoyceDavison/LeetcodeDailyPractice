public class UniquePath {
	
	public static boolean isValid(int[][]board, int i, int j) {
		if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
		else return true;
	}
	
	public static int countPath(int[][] board, int r, int c) {
		if(!isValid(board,r,c)) return 0;
		if(r == board.length && c == board[0].length) return 1;
		return countPath(board, r+1, c) + countPath(board, r, c+1);
	}
	
	public static int uniquePathshelper(int[][] board, int r, int c, int[][] paths) {
		if(!isValid(board,r,c)) return 0;
		if(r == board.length && c == board[0].length) return 1;
		if(paths[r][c] == 0) {
			paths[r][c] = countPath(board,r+1,c) + countPath(board,r,c+1);
		}
		return paths[r][c];
	}
	
	public static int uniquePaths(int m, int n) {
        int[][] board = new int[m][n];
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) 
                    board[i][j] = 1;
                else{
                    board[i][j] = board[i-1][j] + board[i][j-1];
                }
            }
		}
		return board[m-1][n-1];
    }
	// m = 3, n = 2 --> 3
	// m = 7, n = 3 --> 28
	/* 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(7,3));
	}

}
