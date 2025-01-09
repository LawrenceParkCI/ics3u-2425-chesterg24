package culminating2025;
/*
 * Name: Gavin Chester
 * Date: 2025/01/08
 * Description:
 */
import java.awt.*;
import hsa_new.Console;

public class TicTacToe{
    static Console c = new Console(30, 60, 18, "Tic Tac Toe Game");

    public static void main(String[] args) {
        String[] board = initializeBoard();
        String currentPlayer = "X";
        boolean gameWon = false;

        // Welcome message
        c.setColor(Color.BLUE);
        c.setFont(new Font("SansSerif", Font.BOLD, 18));
        c.println("Welcome to Tic Tac Toe!");
        c.println("Press any key to start...");
        c.getChar();
        c.clear();

        // Main game loop
        while (!boardFull(board) && !gameWon) {
            displayBoard(board);
            c.setColor(Color.GREEN);
            c.print("Player " + currentPlayer + ", enter your move (1-9): ");
            String move = c.readString();

            if (validMove(board, move)) {
                makeMove(board, move, currentPlayer);
                gameWon = checkWin(board, currentPlayer);

                if (gameWon) {
                    displayBoard(board);
                    c.setColor(Color.ORANGE);
                    c.println("Congratulations, Player " + currentPlayer + "! You win!");
                } else {
                    currentPlayer = currentPlayer.equals("X") ? "O" : "X";
                }
            } else {
                c.setColor(Color.RED);
                c.println("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            displayBoard(board);
            c.setColor(Color.MAGENTA);
            c.println("It's a draw! Well played!");
        }
    }

    public static String[] initializeBoard() {
        String[] board = new String[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }
        return board;
    }

    public static void displayBoard(String[] board) {
        c.clear();
        c.setColor(Color.CYAN);
        c.setFont(new Font("Monospaced", Font.BOLD, 20));
        c.println("  " + board[0] + " | " + board[1] + " | " + board[2]);
        c.println(" ---+---+---");
        c.println("  " + board[3] + " | " + board[4] + " | " + board[5]);
        c.println(" ---+---+---");
        c.println("  " + board[6] + " | " + board[7] + " | " + board[8]);
        c.println();
    }

    public static boolean validMove(String[] board, String move) {
        try {
            int pos = Integer.parseInt(move) - 1;
            return pos >= 0 && pos < 9 && board[pos].matches("\\d");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void makeMove(String[] board, String move, String player) {
        int pos = Integer.parseInt(move) - 1;
        board[pos] = player;
    }

    public static boolean boardFull(String[] board) {
        for (String cell : board) {
            if (cell.matches("\\d")) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWin(String[] board, String player) {
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6}             // Diagonals
        };

        for (int[] condition : winConditions) {
            if (board[condition[0]].equals(player) &&
                    board[condition[1]].equals(player) &&
                    board[condition[2]].equals(player)) {
                return true;
            }
        }
        return false;
    }
}



