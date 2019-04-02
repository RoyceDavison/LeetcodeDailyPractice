public class gameOfLife {
	//这道题的难点在于你需要一次性全部转换state也就是说你需要对于每一个cell都要存它的next state 最后的时候两个for loop
    //遍历完整个matrix并更新值。四个rules可以压缩到只考虑两种可能： 1. 活着的时候活着 2.死的变活了
    //那我们可以考虑用bit 比如当前是1 之后死了我们可以不管它 因为最后会统一left shift by 1
    //那如果当前是1 之后还是1 我们可以设置当前的值为3 --> 0011 left shift by 1之后得到 0001 --> 1活着
    //那如果当前是0 之后又活了 我们可以设置为2 0010 left shift --> 0001 1活着
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){
                int lives = getAliveCell(board,i,j,m,n);
                // In the beginning, every 2nd bit is 0;
                // So we only need to care about when will the 2nd bit become 1.
                if(board[i][j] == 1 && lives >= 2 && lives <=3) board[i][j] = 3; 
                // Make the 2nd bit 1: 01 ---> 11
                if(board[i][j] == 0 && lives ==3) board[i][j] = 2;
                //// Make the 2nd bit 1: 00 ---> 10
            }
        }
            
        // Get the 2nd state.
         for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] >>= 1;
            }
         }
    }
    /*这里的max和min都用的非常的巧妙。因为可以保证当前的cell所有neighbor都会被搜索到
        1 0 1 1     比如i，j = 0 则会包括了(0,0)位置的左右两边和斜边，随着i,j的移动会框住的neighbors越来越多
        0 0 1 0     走到(1,2)位置的时候会框住它的八个neighbors
        1 1 0 1
    */
    public int getAliveCell(int[][]board,int i, int j, int m, int n){
        int lives = 0;
        for(int x = Math.max(i-1,0); x <= Math.min(i+1,m-1);x++){
            for(int y = Math.max(j-1,0); y <= Math.min(j+1,n-1); y++){
                lives += (board[x][y] & 1);
            }
        }
        //在这里是因为要减去当前的cell，我们只考虑它的邻居不考虑它的本身
        lives -= (board[i][j] & 1);
        return lives;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
