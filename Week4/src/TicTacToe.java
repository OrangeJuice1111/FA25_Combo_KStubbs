import java.util.Scanner;

// control a selcts everything and control shift f formats it all
public class TicTacToe {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String[] board = new String[9];// created our 3x3 board
		int player = 1;
		int winner = 0;
		int moves = 0;
		fillBoard(board);
		drawBoard(board);// (board) sends board to whatever action we are using it in but we dont send it
							// back because its a string
		while (winner == 0 && moves < 9) {
			moves ++; //this raises the number of moves counter by 1 everytime
			makeMove(board, player);
			drawBoard(board);
			winner = checkWinner(board, player);
			player = player % 2 + 1;// this is to switch from player 1 to player 2
		}
		if(winner == 0)
		{
			System.out.println("Tie!!");
		}else 
		{
			System.out.printf("player %d wins", winner);
		}
	}

	private static int checkWinner(String[] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++)// 8 is for the 8 win conditions
		{
			switch (i) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX") || line.equals("OOO")) {
				return player;// return stops the method even if there is more code after it
			}

		}
		return 0;
	}

	private static void makeMove(String[] board, int player) {
		String marker = "X";
		if (player == 2)
			marker = "O";
		System.out.printf("player %d Where would you like to go?", player);
		int move = input.nextInt();
		while (Character.isDigit(board[move].charAt(0))) {
			board[move] = marker;
		}

	}

	private static void drawBoard(String[] board) {
		for (int rows = 0; rows < 9; rows++) {

			System.out.print(board[rows]);// not println because its the first row
			if (rows % 3 < 2)
				System.out.print("|");
			if (rows % 3 == 2) {
				System.out.println();
				System.out.println("_____");
			}
		}
	}

	private static void fillBoard(String[] board) {// to fill a two dimentional array we will need 2 loops one for
													// columns and one for rows
		for (int rows = 0; rows < 9; rows++) {
			board[rows] = Integer.toString(rows);
		}

	}

}
