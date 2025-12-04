import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("How many dice will be rolled this turn?");
//		int numDice = input.nextInt();
//		
//		int total = 0;
//		
//		for(int i = 0; i < numDice; i++)
//		{
//			Die die = new Die();
//			die.Roll();
//			total += die.getValue();
//		}
//		System.out.println("Total of dice rolled "+ total);
//		
		
		System.out.println("How many sides do the dice you are using have?");
		int numSides = input.nextInt();
		
		System.out.println("How many players are there?");
		int numPlayers = input.nextInt();
		
		Player[] players = new Player[numPlayers];
		
		for(int i = 0; i < numPlayers; i++)
		{
			System.out.println("Enter the name of current player");
			String playerName = input.next();
			players[i] = new Player();
			players[i].name = playerName;
			players[i].totalDice = 0;
		}
		
		for(Player player : players)
		{
			Die die = new Die(numSides);
			die.Roll();
			player.totalDice = die.getValue();
			System.out.println(player.name + " Rolled a " + player.totalDice + " while using a " + numSides + " sided dice");
			
		}
		int[] winnerIndices = decideWinner(players);

        
        System.out.println("\nWinners of the game:");
        for (int winnerIndex : winnerIndices) {
            System.out.println(players[winnerIndex].name);
        }
	}
	public static int[] decideWinner(Player[] players)
		{
			int winScore = -1;
			int winCount = 0;
		
		for(Player player : players)
		{
			if(player.totalDice > winScore)
			{
				winScore = player.totalDice;
			}
		}
		for(Player player : players)
		{
			if(player.totalDice == winScore)
			{
				winCount ++;
			}
		}
		
		int win[] = new int[winCount];
		int winPlayer = 0;
		
		for(int i = 0; i < players.length; i++)
		{
			if(players[i].totalDice == winScore)
			{
				win[winPlayer++] = i;
			}
		}
		
		return win;
	}

}
