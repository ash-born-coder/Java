package Task1;

public class MazeSolver {

    private static char[][] maze = {
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', '#', ' ', ' ', '#'},
            {'#', ' ', '#', '#', ' ', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', '#', '#'},
            {'#', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
    };

    private static int startRow = 1, startCol = 1;
    private static int endRow = 5, endCol = 5;

    public static void main(String[] args) {
        System.out.println("Maze before solving:");
        printMaze();

        if (findPath(startRow, startCol)) {
            System.out.println("\nPath found! (marked with '.')");
        } else {
            System.out.println("\nNo path found.");
        }

        System.out.println("Maze after solving:");
        printMaze();
    }


    private static boolean findPath(int row, int col) {

        // Checking boundaries
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length) {
            return false;
        }

        // Checking if we reached the cheese
        if (row == endRow && col == endCol) {
            maze[row][col] = 'C';
            return true;
        }

        // Checking obstacles: if it's a wall or already visited
        // We mark visited cells to prevent infinite loops
        if (maze[row][col] == '#' || maze[row][col] == '.') {
            return false;
        }

        // Marking the path that the mouse has taken
        // This marks the cell as "visited" for the recursion
        maze[row][col] = '.';

        // Trying for every possible field (recursion in 4 directions)
        // Order: Down, Right, Up, Left
        if (findPath(row + 1, col) || // Down
                findPath(row, col + 1) || // Right
                findPath(row - 1, col) || // Up
                findPath(row, col - 1)) { // Left
            return true; // If any direction leads to the cheese, return true
        }

        // Backtracking: if we are here, this path was a dead end
        // We leave it marked as '.' (visited) to ensure we don't try it again
        return false;
    }

    // Helper method to display the labyrinth
    private static void printMaze() {
        for (char[] row : maze) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
