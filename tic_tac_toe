import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play a game");
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };
        
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Turn X");
                int[] spot = play(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Turn O");
                int[] spot = play(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);
            
            
        }
        int result = checkWin(board);
            if (result == 1) {
                System.out.println("X wins");
                
            } else if (result == 2) {
                System.out.println("O wins");
                
            }
        if (checkWin(board) == 0) {
            System.out.println("It's a draw!");
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] play(char[][] board) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a row and column number");
        int row = sc.nextInt();
        int col = sc.nextInt();
        while (board[row][col] == 'X' || board[row][col] == 'O') {
            System.out.println("Spot taken, pick another spot");
            row = sc.nextInt();
            col = sc.nextInt();
        }
        return new int[]{row, col};
    }

    public static int checkWin(char[][] board) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] == 'X') return 1;
                if (board[i][0] == 'O') return 2;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] == 'X') return 1;
                if (board[0][i] == 'O') return 2;
            }
        }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 'X') return 1;
            if (board[0][0] == 'O') return 2;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 'X') return 1;
            if (board[0][2] == 'O') return 2;
        }
        
        //No winner
        return 0;
    }
}
