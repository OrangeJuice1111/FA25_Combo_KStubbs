import java.util.Scanner;

// control a selcts everything and control shift f formats it all
public class TicTacToe {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String[] board = new String[9];// created our 3x3 board
		int player = 1;
		fillBoard(board);
		drawBoard(board);// (board) sends board to whatever action we are using it in but we dont send it
							// back because its a string
		makeMove(board, player);
		drawBoard(board);
		player = player %2 + 1;
		
	}

	private static void makeMove(String[] board, int player) {
		String marker = "X";
		if (player == 2)
			marker = "O";
		System.out.println("Where would you like to go");
		int move = input.nextInt();
		while (Character.isDigit(board[move].charAt(0))) 
		{
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
