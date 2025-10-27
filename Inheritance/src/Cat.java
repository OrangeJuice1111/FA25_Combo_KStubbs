
public class Cat extends Animal {
	private boolean longhair;
	private boolean bobtail;
	
	
	
	public Cat() {
		super();
		longhair = false;
		bobtail = false;
	}
	public Cat(int height, double weight, String name, boolean longhair, boolean bobtail) {
		super(height, weight, name);
		this.bobtail = bobtail;
		this.longhair = longhair;
	}
	public Boolean getLonghair() {
		return longhair;
	}
	public void setLonghair(Boolean longhair) {
		this.longhair = longhair;
	}
	public Boolean getBobtail() {
		return bobtail;
	}
	public void setBobtail(Boolean bobtail) {
		this.bobtail = bobtail;
	}
	@Override
	public String toString() {
		return "Cat :" + super.getName() + "\nHeight:" + super.getHeight() + "\nWeight: " + super.getWeight() + "\nLonghaired:" + longhair + "\nBobtail: " + bobtail;
	}
	
	
		
	
}
