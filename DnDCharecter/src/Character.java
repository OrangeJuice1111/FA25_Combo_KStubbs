
public class Character {
	private int health;
	private String name;
	private int power;
	private int armor;
	private Weapon weapon;
	
	public Character() {//default constructor
		super();
		this.health = 0;
		this.name = "";
		this.power = 0;
		this.armor = 0;
	}
	
	public Character(int health, String name, int power, int armor) {//fields constructor
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
	}
	
	public Character(int health, String name, int power, int armor, int wDamage, String wName) {
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
		this.weapon = new Weapon(wDamage, wName);
	}

	public Weapon getWeapon()
	{
		return weapon;
	}
	public void setWeapon(int damage, String name)
	{
		this.weapon = new Weapon(damage, name);
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	@Override //tells computer to override the to.string parent function aka object
	public String toString() {
		return "Character " + name + "\nHP:" + health + "\npower: " + power + "\nAC:" + armor + "\n"+ weapon;
	}
	
	
	
}
