package SudokuSolver;

public class SudokuSolver {
	    private static final int SIZE = 9;
	    private static final int EMPTY = 0;

	    public boolean solve(int[][] board) {
	        for (int row = 0; row < SIZE; row++) {
	            for (int col = 0; col < SIZE; col++) {
	                if (board[row][col] == EMPTY) {
	                    for (int num = 1; num <= SIZE; num++) {
	                        if (isSafe(board, row, col, num)) {
	                            board[row][col] = num;

	                            if (solve(board)) {
	                                return true;
	                            }

	                            board[row][col] = EMPTY;
	                        }
	                    }
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    private boolean isSafe(int[][] board, int row, int col, int num) {
	        // Check row
	        for (int i = 0; i < SIZE; i++) {
	            if (board[row][i] == num) {
	                return false;
	            }
	        }

	        // Check column
	        for (int i = 0; i < SIZE; i++) {
	            if (board[i][col] == num) {
	                return false;
	            }
	        }

	        // Check 3x3 box
	        int boxRowStart = row - row % 3;
	        int boxColStart = col - col % 3;

	        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
	            for (int j = boxColStart; j < boxColStart + 3; j++) {
	                if (board[i][j] == num) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }
}
