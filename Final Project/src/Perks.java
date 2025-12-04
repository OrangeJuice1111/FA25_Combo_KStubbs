import java.util.ArrayList;
import java.util.List;
//make an array list 
class Perk {
    private String name;
    private String command;

    public Perk(String name, String command) {
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public String getCommand() {
        return command;
    }

	public static void add(Perk perk) {
		// TODO Auto-generated method stub
		
	}
}


//for random number generator set it up as randint(high - low) + low + 1