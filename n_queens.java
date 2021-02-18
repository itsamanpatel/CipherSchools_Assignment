import java.io.*;
public class NQueens { 
	final int N = 4; 

	
	

	boolean isSafe(int board[][], int row, int col) 
	{ 
		int i, j; 

		
		for (i = 0; i < col; i++) 
			if (board[row][i] == 1) 
				return false; 
			
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
			if (board[i][j] == 1) 
				return false; 

		for (i = row, j = col; j >= 0 && i < N; i++, j--) 
			if (board[i][j] == 1) 
				return false; 

		return true; 
	} 


	boolean solveNQUtil(int board[][], int col) 
	{ 

		if (col >= N) 
			return true; 

	
		for (int i = 0; i < N; i++) { 
			if (isSafe(board, i, col)) { 
				
				board[i][col] = 1; 

				
				if (solveNQUtil(board, col + 1) == true) 
					return true; 

			
				board[i][col] = 0; 
			} 
		} 

		return false; 
	} 

	boolean NQueensProcess() 
	{ 
		int board[][] = { { 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 } }; 

		if (solveNQUtil(board, 0) == false) { 
			System.out.print("Solution of this does not exist"); 
			return false; 
		} 

		printBoard(board); 
		return true; 
	} 
	
	void printBoard(int board[][]) 
	{ 
		for (int i = 0; i < N; i++) { 
			for (int j = 0; j < N; j++) 
				System.out.print(" " + board[i][j] 
								+ " "); 
			System.out.println(); 
		} 
	} 



	public static void main(String args[]) 
	{ 
		NQueens Queen = new NQueens(); 
		Queen.NQueensProcess(); 
	} 
} 

