import java.util.Random;

public class Die {
	public int numSides;
	public int value;
	
	public Die() {
		this.numSides = 6;
		this.value = -1;
	}

	public Die(int numSides) {
		this.numSides = numSides;
		this.value = 1;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void Roll() 
	{
		Random random = new Random();
		value = random.nextInt(numSides)+1;
	}
	
	
	
	
	
}
