package Task2;

public class Main {

    private boolean[][] grid;
    private int rows, cols;
    private int generation;

    // Constructor
    public Main(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.generation = 0;
        grid = new boolean[rows][cols];
    }

    // Print the grid
    public void printGrid() {
        System.out.println("Generation: " + generation);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] ? "■ " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Initialize with a glider
    public void initGlider(int startRow, int startCol) {
        grid[startRow][startCol + 1] = true;
        grid[startRow + 1][startCol + 2] = true;
        grid[startRow + 2][startCol] = true;
        grid[startRow + 2][startCol + 1] = true;
        grid[startRow + 2][startCol + 2] = true;
    }

    // Initialize with random cells
    public void initRandom() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Math.random() < 0.3;
            }
        }
    }

    // Count live neighbors
    private int countNeighbors(int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {

                if (i == 0 && j == 0) continue;

                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < rows &&
                        newCol >= 0 && newCol < cols &&
                        grid[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Compute next generation
    public void nextGeneration() {
        boolean[][] newGrid = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int neighbors = countNeighbors(i, j);

                if (grid[i][j]) {
                    // Live cell rules
                    newGrid[i][j] = (neighbors == 2 || neighbors == 3);
                } else {
                    // Dead cell rule
                    newGrid[i][j] = (neighbors == 3);
                }
            }
        }

        grid = newGrid;
        generation++;
    }

    // Run the simulation
    public static void main(String[] args) throws InterruptedException {
        Main game = new Main(20, 20);

        game.initGlider(1, 1);
        // game.initRandom();

        for (int i = 0; i < 30; i++) {
            game.printGrid();
            game.nextGeneration();
            Thread.sleep(500);
        }
    }
}
