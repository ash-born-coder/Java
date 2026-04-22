package Task4;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    private char[][] board;
    private static final char EMPTY = ' ';
    private static final char PLAYER = 'X';
    private static final char COMPUTER = 'O';

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public TicTacToe() {
        board = new char[3][3];
        resetBoard();
    }

    // Initialize / reset board
    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // Print board
    public void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
        System.out.println();
    }

    // Player move with validation
    public void playerMove() {
        int row, col;
        while (true) {
            System.out.print("Enter row (0-2): ");
            row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
                board[row][col] = PLAYER;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Computer AI move
    public void computerMove() {

        if (tryMove(COMPUTER)) return;

        if (tryMove(PLAYER)) return;

        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board[row][col] != EMPTY);

        board[row][col] = COMPUTER;
    }

    // Try winning or blocking move
    private boolean tryMove(char symbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    board[i][j] = symbol;
                    if (checkWin(symbol)) {
                        if (symbol == PLAYER) {
                            board[i][j] = COMPUTER; // block
                        }
                        return true;
                    }
                    board[i][j] = EMPTY;
                }
            }
        }
        return false;
    }

    // Win detection
    public boolean checkWin(char player) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        // Diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    // Draw detection
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY)
                    return false;
            }
        }
        return true;
    }

    // Game loop
    public void play() {
        boolean playing = true;

        while (playing) {
            resetBoard();
            System.out.println("Tic-Tac-Toe started!");

            while (true) {
                printBoard();
                playerMove();

                if (checkWin(PLAYER)) {
                    printBoard();
                    System.out.println("🎉 You win!");
                    break;
                }

                if (isDraw()) {
                    printBoard();
                    System.out.println("🤝 It's a draw!");
                    break;
                }

                computerMove();

                if (checkWin(COMPUTER)) {
                    printBoard();
                    System.out.println("💻 Computer wins!");
                    break;
                }

                if (isDraw()) {
                    printBoard();
                    System.out.println("🤝 It's a draw!");
                    break;
                }
            }

            System.out.print("Play again? (y/n): ");
            playing = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing!");
    }

    // Main
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}

