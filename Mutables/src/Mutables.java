import java.awt.Point;
import java.awt.Rectangle;

public class Mutables {

	public static void main(String[] args) {
		Point blank = new Point(3,4);//3 is the x-value and 4 is the y-value
		
		printPoint(blank);
		//System.out.println(blank.x);//calls the x-value of the point we created
		
		blank.x=6;//replaces the location of x in memory with a 6
		
		printPoint(blank);
		Rectangle box = new Rectangle(0, 0, 100 ,200);
		
		Point center = findCenter(box);
		System.out.println(center);//point has a built in toString that makes it look a certian way when printed out
		box.x = box.x + 50;
		
	}

	private static Point findCenter(Rectangle box) {
		int xPoint = box.x+box.width / 2;
		int yPoint = box.y+box.height /2;
		return new Point(xPoint, yPoint);
	}

	private static void printPoint(Point blank) {
		System.out.printf("(%d, %d)\n", blank.x,blank.y);
		
	}

}
