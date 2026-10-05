public class Nqueens {
    
    public static void main(String args[]) {
        int n = 4;
        char[][] board = new char[n][n];
        
        // Initialize the board with empty spaces ('.')
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        
        // Start solving from the first row (row 0)
        solveNQueens(board, 0);
    }
    
    // Recursive backtracking method
    private static void solveNQueens(char[][] board, int row) {
        // Base case: If we have reached beyond the last row, a solution is found
        if (row == board.length) {
            printBoard(board);
            return;
        }
        
        // Try placing a queen in every column of the current row
        for (int col = 0; col < board.length; col++) {
            if (canPlace(board, row, col)) {
                board[row][col] = 'Q';         // Place the queen
                solveNQueens(board, row + 1);  // Move to the next row
                board[row][col] = '.';         // Backtrack: remove the queen
            }
        }
    }

    // Checks if it is safe to place a queen at board[row][col]
    private static boolean canPlace(char[][] board, int row, int col) {
        // Check vertically upwards
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Check upper-left diagonal
        int r = row - 1;
        int c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        
        // Check upper-right diagonal
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }
        
        return true;
    }
    
    // Helper method to print the board
    private static void printBoard(char[][] board) {
        System.out.println("---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}