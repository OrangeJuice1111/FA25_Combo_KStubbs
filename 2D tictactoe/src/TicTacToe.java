import java.util.Scanner;

// control a selects everything and control shift f formats it all
public class TicTacToe {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = 3;
		int cols = 3;
		String[][] board = new String[rows][cols];// created our 3x3 board
		int player = 1;
		int winner = 0;
		int moves = 0;
		fillBoard(board);
		drawBoard(board);// (board) sends board to whatever action we are using it in but we dont send it
							// back because its a string
		while (winner == 0 && moves < 9) {
			moves++; // this raises the number of moves counter by 1 everytime
			makeMove(board, player);
			drawBoard(board);
			winner = checkWinner(board, player);
			player = player % 2 + 1;// this is to switch from player 1 to player 2
		}
		if (winner == 0) {
			System.out.println("Tie!!");
		} else {
			System.out.printf("player %d Wins!!", winner);
		}
	}

	private static int checkWinner(String[][] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++)// 8 is for the 8 win conditions
		{
			switch (i) {
			case 0://top horizontal line
				line = board[0][0] + board[0][1] + board[0][2];
				break;
			case 1://mid horizontal line
				line = board[1][0] + board[1][1] + board[1][2];
				break;
			case 2://bottom horizontal line
				line = board[2][0] + board[2][1] + board[2][2];
				break;
			case 3://left vertical line
				line = board[0][0] + board[1][0] + board[2][0];
				break;
			case 4://middle vertical line
				line = board[0][1] + board[1][1] + board[2][1];
				break;
			case 5://right vertical line
				line = board[0][2] + board[1][2] + board[2][2];
				break;
			case 6://top left to bottom right diagonal line
				line = board[0][0] + board[1][1] + board[2][2];
				break;
			case 7://top right to bottom left diagonal line
				line = board[0][2] + board[1][1] + board[2][0];
				break;
			}
			if (line.equals("XXX") || line.equals("OOO")) {
				return player;// return stops the method even if there is more code after it
			}

		}
		return 0;
	}

	private static void makeMove(String[][] board, int player) {
		int row = -1;
		int col = -1;
		String marker = "X";
		if (player == 2)
			marker = "O";
		System.out.printf("player %d Where would you like to go?", player);
		int move = input.nextInt();
		
		switch (move)
		{
			case 1:
				row = 0;
				col = 0;
				break;
			case 2:
				row = 0;
				col = 1;
				break;
			case 3:
				row = 0;
				col = 2;
				break;
			case 4:
				row = 1;
				col = 0;
				break;
			case 5:
				row = 1;
				col = 1;
				break;
			case 6:
				row = 1;
				col = 2;
				break;
			case 7:
				row = 2;
				col = 0;
				break;
			case 8:
				row = 2;
				col = 1;
				break;
			case 9:
				row = 2;
				col = 2;
				break;
		}
		
		while (!Character.isDigit(board[row][col].charAt(0))) {
			System.out.printf("Player %d where would you like to go?", player);
			move = input.nextInt();
			switch (move)
			{
				case 1:
					row = 0;
					col = 0;
					break;
				case 2:
					row = 0;
					col = 1;
					break;
				case 3:
					row = 0;
					col = 2;
					break;
				case 4:
					row = 1;
					col = 0;
					break;
				case 5:
					row = 1;
					col = 1;
					break;
				case 6:
					row = 1;
					col = 2;
					break;
				case 7:
					row = 2;
					col = 0;
					break;
				case 8:
					row = 2;
					col = 1;
					break;
				case 9:
					row = 2;
					col = 2;
					break;
			}
		}
			board[row][col] = marker;

	}
	
	private static void drawBoard(String[][] board) {
		for (int rows = 0; rows < 3; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				System.out.print(board[rows][cols]);
				if (cols < 2)
					System.out.print("|");

			}
			System.out.println();
			if(rows < 2)System.out.print("_____\n");
			
		}
	}

	private static void fillBoard(String[][] board) {// to fill a two dimentional array we will need 2 loops one for
		int index = 1;												// columns and one for rows
		for (int rows = 0; rows < 3; rows++) {
			
			for (int cols = 0; cols < 3; cols++) {
				board[rows][cols] = Integer.toString(index);
				index++;
			}

		}

	}

}
