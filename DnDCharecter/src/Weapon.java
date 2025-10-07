
public class Weapon {
	private int damage;
	private String name;
	
	public Weapon() {
		super();
		this.damage = 0;
		this.name = "";
	}
	
	public Weapon(int damage, String name) {
		super();
		this.damage = damage;
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Weapon [damage=" + damage + ", name=" + name + "]";
	}
	
	
}
