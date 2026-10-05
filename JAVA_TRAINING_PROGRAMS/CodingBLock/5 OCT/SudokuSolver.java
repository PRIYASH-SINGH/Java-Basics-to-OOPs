import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        
        solve(board, 0, 0);
    }
    
    private static void solve(int[][] board, int row, int col) {
        // Move to the next row when we reach past the last column
        if (col == 9) {
            col = 0;
            row = row + 1;
        }
        
        // If we reach row 9, the board is successfully solved
        if (row == 9) {
            for (int[] a : board) {
                System.out.println(Arrays.toString(a));
            }
            return;
        }
        
        // MISSING IF-STATEMENT FIXED: Skip cells that are already filled
        if (board[row][col] != 0) {
            solve(board, row, col + 1);
        } else {
            // Try placing digits 1-9
            for (int val = 1; val <= 9; val++) {
                if (canWePlace(board, row, col, val)) {
                    board[row][col] = val;
                    solve(board, row, col + 1);
                    board[row][col] = 0; // Backtrack
                }
            }
        }
    }
    
    private static boolean canWePlace(int[][] board, int row, int col, int val) {
        // 1. Check the row for duplicates
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }
        
        // 2. MISSING LOGIC ADDED: Check the column for duplicates
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == val) {
                return false;
            }
        }
        
        // 3. MISSING LOGIC ADDED: Check the 3x3 subgrid for duplicates
        int subGridRowStart = (row / 3) * 3;
        int subGridColStart = (col / 3) * 3;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[subGridRowStart + i][subGridColStart + j] == val) {
                    return false;
                }
            }
        }
        
        return true;
    }
}