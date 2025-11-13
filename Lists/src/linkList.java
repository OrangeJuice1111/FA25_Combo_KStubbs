import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkList {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
			
		cars.add("Ford");//adds to array
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Lexus");
		cars.add("Chevy");
		//stack last in first out || queue last in last out
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(0, "Opel");
		//System.out.println(cars);
		//cars.removeLast();//removes only the last one
		System.out.println(cars);
		//cars.clear();//removes all in array
		System.out.println(cars);
		
		System.out.println(nums);
		
		Collections.sort(cars);
		System.out.println(cars);
		
		/****************************************************************/
		 //LinkedList
		LinkedList<String>animals = new LinkedList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Hamster");
		animals.add("Parrot");
		animals.add("GoldFish");
		animals.add("Python");
		
		System.out.println(animals);
		Collections.sort(animals, Collections.reverseOrder());
		System.out.println(animals);
	}
}
