import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class LevelUp {
	private int levels;
	private int min;
	private int max;
	private int guessesRemaining;
	private List<Perk> perks;
	private List<Integer> previousGuesses;
	private int randomNumber;
	private Random random;
	private Timer timer;
	private int timeLeft;

	public LevelUp() {
		this.levels = 1;
		this.perks = new ArrayList<>();
		this.previousGuesses = new ArrayList<>();
		this.random = new Random();
		setRange(levels);
		this.guessesRemaining = 5;
	}

	public void increaseLevel() {
		this.levels++;
		setRange(levels);
		this.guessesRemaining = 5 + this.levels;
		previousGuesses.clear();
		giftRandomPerk();
	}

	public void addPerk(String name, String command) {
		perks.add(new Perk(name, command));
	}

	public void displayPerks() {
		System.out.println("Perks for Level " + levels + ":");
		for (Perk perk : perks) {
			System.out.println("- " + perk.getName() + ": " + perk.getCommand());
		}
	}

	public int getLevels() {
		return levels;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getGuessesRemaining() {
		return guessesRemaining;
	}

	public void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your guess: ");
		int guess = scanner.nextInt();
		previousGuesses.add(guess);
		guessesRemaining--;
		System.out.println("Your guess: " + guess);

		if (guess < randomNumber) {
			System.out.println("Too low!");
		} else if (guess > randomNumber) {
			System.out.println("Too high!");
		} else {
			System.out.println("Correct!");
		}
		System.out.println("Your guess: " + guess);
	}

	public void setRange(int level) {
		switch (level) {
		case 1:
			min = 1;
			max = 10;
			break;
		case 2:
			min = 1;
			max = 50;
			break;
		case 3:
			min = 1;
			max = 100;
			break;
		case 4:
			min = 1;
			max = 500;
			break;
		case 5:
			min = 1;
			max = 1000;
			break;
		default:
			min = 1;
			max = 10;
		}
		randomNumber = random.nextInt(max - min + 1) + min;
		
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public void displayGameState() {
		System.out.println("\n--- Current Game State ---");
		System.out.println("Level: " + levels);
		System.out.println("Range: " + min + " through " + max);
		System.out.println("Guesses Remaining: " + guessesRemaining);
		System.out.println("Previous Guesses: " + previousGuesses);
		if (levels == 5) {
			System.out.println("Time Left: " + timeLeft + " seconds");
		}
		System.out.println("---------------------------");
	}

	private void giftRandomPerk() {
        if (random.nextBoolean()) { 
            if (!perks.isEmpty()) {
                Perk giftedPerk = perks.get(random.nextInt(perks.size()));
                System.out.println("Congratulations! You've been gifted a perk: " + giftedPerk.getName() + " - " + giftedPerk.getCommand());
                applyPerkEffect(giftedPerk); 
            } else {
                System.out.println("No perks available to gift.");
            }
        } else {
            System.out.println("No perk gifted this time.");
        }
    }
	
    private void applyPerkEffect(Perk perk) {
	                switch (perk.getName()) {
	                    case "Common Perk Unlocked":
	                        max /= 2; 
	                        System.out.println("Range has been halved to: " + min + " through " + max);
	                        break;
	                    case "UnCommon Perk Unlocked!":
	                        max /= 4; 
	                        System.out.println("Range has been quartered to: " + min + " through " + max);
	                        break;
	                    case "Rare Perk Unlocked!!":
	                        guessesRemaining += 3;
	                        System.out.println("You have gained 3 additional guesses! Total guesses remaining: " + guessesRemaining);
	                        break;
	                    case "Legendary Perk Unlocked!!!":
	                        timeLeft += 30; 
	                        System.out.println("You have gained an additional 30 seconds! Total time left: " + timeLeft + " seconds");
	                        break;
	                    default:
	                        System.out.println("No effect for this perk.");
	                }
	            }           

	public void startTimer(int seconds) {
		timeLeft = seconds;
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (timeLeft > 0) {
					timeLeft--;
				} else {
					System.out.println("Time's up! You ran out of time.");
					timer.cancel();
				}
			}
		}, 1000, 1000);
	}

	public void stopTimer() {
		if (timer != null) {
			timer.cancel();
		}
	}

	public static void main(String[] args) {
		LevelUp game = new LevelUp();
		game.addPerk("Common Perk Unlocked", "Divide Range in Half");
		game.addPerk("UnCommon Perk Unlocked!", "Divide Range by 4");
		game.addPerk("Rare Perk Unlocked!!", "+3 Guesses!");
		game.addPerk("Legendary Perk Unlocked!!!", "+20 seconds on timer!!!");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			game.displayGameState();

			if (game.getLevels() == 5) {
				game.startTimer(30);
			}

			game.getUserInput();

			if (game.getGuessesRemaining() == -1) {
				System.out.println("Out of guesses! The correct number was: " + game.getRandomNumber());
				break;
			}

			if (game.getRandomNumber() == game.previousGuesses.get(game.previousGuesses.size() - 1)) {
				System.out.println("Congratulations! You've guessed the number!");
				game.increaseLevel();
			}
		}
		game.stopTimer();
		scanner.close();
	}
}
