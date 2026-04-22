package Task6;

public class SudokuSolver {

    private static final int SIZE = 9;
    private static final int EMPTY = 0;

    private static int[][] grid = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public static void main(String[] args) {
        System.out.println("Original Sudoku:");
        printGrid();

        if (solveSudoku(grid)) {
            System.out.println("\nSolved Sudoku:");
            printGrid();
        } else {
            System.out.println("No solution exists.");
        }
    }

    // Recursive backtracking solver
    private static boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {

                // Find empty cell
                if (grid[row][col] == EMPTY) {

                    // Try numbers 1–9
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValid(grid, row, col, num)) {
                            grid[row][col] = num;

                            // Recursively solve rest
                            if (solveSudoku(grid)) {
                                return true;
                            }

                            // Backtrack
                            grid[row][col] = EMPTY;
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Solved
    }

    // Constraint checking
    private static boolean isValid(int[][] grid, int row, int col, int num) {

        // Check row
        for (int x = 0; x < SIZE; x++) {
            if (grid[row][x] == num) return false;
        }

        // Check column
        for (int x = 0; x < SIZE; x++) {
            if (grid[x][col] == num) return false;
        }

        // Check 3×3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == num) return false;
            }
        }

        return true;
    }

    // Display the grid
    private static void printGrid() {
        for (int row = 0; row < SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("------+-------+------");
            }
            for (int col = 0; col < SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}

