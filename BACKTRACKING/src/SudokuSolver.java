public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {9, 5, 7, 0, 1, 3, 0, 8, 4},
                {4, 8, 3, 0, 5, 7, 1, 0, 6},
                {0, 1, 2, 0, 4, 9, 5, 3, 7},
                {1, 7, 0, 3, 0, 4, 9, 0, 2},
                {5, 0, 4, 9, 7, 0, 3, 6, 0},
                {3, 0, 9, 5, 0, 8, 7, 0, 1},
                {8, 4, 5, 7, 9, 0, 6, 1, 3},
                {0, 9, 1, 0, 3, 6, 0, 7, 5},
                {7, 0, 6, 1, 8, 5, 4, 0, 9}
        };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // Find an empty space
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }
        if (emptyLeft) {
            return true; // Solved
        }

        // Backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true; // Found the solution
                } else {
                    // Backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false; // Trigger backtracking
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false; // Number already in row
            }
        }
        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false; // Number already in column
            }
        }
        // Check subgrid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false; // Number already in subgrid
                }
            }
        }
        return true; // Safe to place the number
    }
}