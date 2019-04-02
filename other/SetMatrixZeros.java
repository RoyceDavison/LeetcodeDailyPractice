public class SetMatrixZeros {
	public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        //使用第一行第一列的boolean来记录之后会出现的0
        boolean firstRow = false;
        boolean firstCol = false;
        
        //mark possible 0 in the first row
        for(int col = 0; col < n; col++){
            if(matrix[0][col] == 0){
                firstRow = true;
                break;
            }
        }
        
        //mark possible 0 in the first column
        for(int row = 0; row < m; row++){
            if(matrix[row][0] == 0){
                firstCol = true;
                break;
            }
        }
        
        //开始搜索0，如果发现某个位置有0，把它对应的first row, first col mark as 0
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int j = 1; j < n; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < m; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(firstRow){
            for(int col = 0; col < n; col++) matrix[0][col] = 0;
        }
        
        if(firstCol){
            for(int row = 0; row < m; row++) matrix[row][0] = 0;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
