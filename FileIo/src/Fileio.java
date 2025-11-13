import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file you would like to work with?");
		String fileName = input.next();
		File myFile = createFile(fileName);
		input.nextLine();
		// System.out.println("But thats alright");
		System.out.println(" what do you want to write to the file?");
		String str = input.nextLine();
		writeFile(fileName , str);
		
		System.out.println(" what do you want to append to the file?");
		String str2 = input.nextLine();
		
		//appendTo(fileName, str2);

	readFile(myFile);
//		deleteFile(myFile);
		
	}

	private static void deleteFile(File myFile) {
		if(myFile.delete())
		{
			System.out.println(myFile.getName() + " was deleted successfully");
		}
		else
		{
			System.out.println("failed to delete successfully" + myFile.getName());
		}
		
	}

	private static void readFile(File myFile) {
		try (Scanner myReader = new Scanner(myFile)) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
	}

	private static void appendTo(String fileName, String str2) {
		try {
			FileWriter myWriter = new FileWriter(fileName, true);
			myWriter.write("\n");
			myWriter.write(str2);
			System.out.println("Appeneded successfully.");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("There was an error writting the file");
			e.printStackTrace();
		}

	}

	private static void writeFile(String name, String strToWrite) {
		try {
			FileWriter myWriter = new FileWriter(name);
			myWriter.write(strToWrite);
			System.out.println("Written successfully.");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("There was an error writting the file");
			e.printStackTrace();
		}

	}

	private static File createFile(String fileName) {
		try {
			File myFile = new File(fileName);
			if (myFile.createNewFile()) {
				System.out.println("File created sucessfully");
			} else {
				System.out.println("File " + myFile.getName() + " already exists");
			}
			return myFile;
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		return null;
	}

}
