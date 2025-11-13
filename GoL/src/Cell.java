import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	private final int x;
	private final int y;//these wont change at all
	private final int size;
	private int state;//this will change
	public static final Color[] COLORS = {Color.WHITE, Color.BLACK};//you use the {} because it is an "array of" whatever is inside the brackets
	
	public Cell(int x, int y, int size) {
		super();
		this.x = x;
		this.y = y;
		this.size = size;
		this.state = 0;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(COLORS[state]);// setting the 1 or 0 from the game to a color
		g.fillRect(x+1, y+1, size - 1, size - 1);
		g.setColor(Color.lightGray);
		g.drawRect(x, y, size, size);
	}
	public boolean ifOff()
	{
		return state == 0;
	}
	public boolean ifOn()
	{
		return state == 1;
	}
	public void turnOff()
	{
		state = 0;
	}
	public void turnOn()
	{
		state = 1;
	}

}
