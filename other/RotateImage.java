public class RotateImage {
	//rotate the top and down, then swap the symmetry
	// 4 x 4 --> 1 reverse row1 with row4 then reverse row2 with row3
	
	public static void rotate(int[][] matrix) {
		int top = 0;
		int bottom = matrix.length - 1;
		
		while(top!=bottom) {
			for(int col = 0; col < matrix[0].length ; col++) {
				int temp = matrix[top][col];
				matrix[top][col] = matrix[bottom][col];
				matrix[bottom][col] = temp;
			}
			top++;
			bottom--;
			
			if(top == (bottom+1)) break;
		}
		
		for(int i = 0; i<matrix.length;i++) {
			for(int j = i + 1; j < matrix.length;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {
				  {5, 1, 9,11},
				  {2, 4, 8,10},
				  {13, 3, 6, 7},
				  {15,14,12,16}
		};
		int[][] matrix2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		rotate(matrix1);
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j< matrix1[0].length;j++) {
				System.out.print(matrix1[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
