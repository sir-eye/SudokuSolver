package sudoku;

public class SudokuSolver {
    private static final int GRID_SIZE = 9; // Standard Sudoku grid size

    public static void main(String[] args) {
        // Example Sudoku puzzle (0 represents empty cells)
        int[][] board = {
                {7, 0, 0, 0, 0, 0, 2, 0, 0},
                {0, 8, 0, 0, 0, 7, 0, 9, 0},
                {0, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 0, 0, 5, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 9, 0, 4, 0, 0, 0, 3, 0},
                {0, 0, 2, 0, 0, 0, 0, 0, 8}
        };

        System.out.println("\nOriginal Sudoku Board:");
        printBoard(board);

        if (solveBoard(board)) {
            System.out.println("\nSolved Sudoku Board:");
            printBoard(board);
        } else {
            System.out.println("\nThis Sudoku puzzle cannot be solved.");
        }
    }

    // Function to solve the Sudoku puzzle using backtracking
    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                // Check for empty cells
                if (board[row][col] == 0) {
                    // Try numbers 1-9
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidPlacement(board, num, row, col)) {
                            board[row][col] = num; // Place the number

                            if (solveBoard(board)) {
                                return true; // If solving succeeds, return true
                            }

                            board[row][col] = 0; // Reset the cell (backtrack)
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // All cells are filled
    }

    // Function to check if placing a number is valid
    private static boolean isValidPlacement(int[][] board, int number, int row, int col) {
        // Check the row
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxCol; j < localBoxCol + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true; // Placement is valid
    }

    // Function to print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col] == 0 ? " " : board[row][col]);
            }
            System.out.println();
        }
    }
}