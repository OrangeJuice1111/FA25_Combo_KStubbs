
public class Farm {

	public static void main(String[] args) {
		Animal[] farm = new Animal[3];
		
		
		farm[0] = new Animal(66, 24, "Jasper");
		farm[1] = new Dog(71, 69, "Fido", "German Shepard", "Tan-Black");
		farm[2] = new Cat(20, 27, "Apollo", false, false);
		
		for(Animal ani : farm)//call through the array
		{
			System.out.println(ani);
			System.out.println(ani.makeNoise());
			System.out.println();
		}
		
//		System.out.println(ani);
//		System.out.println();
//		System.out.println(dog);
//		
//		System.out.println(dog.makeNoise());
//		
//		System.out.println();
//		System.out.println(cat);
	}

}
