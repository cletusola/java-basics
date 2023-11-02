// getting user input from  terminal in java  
import java.util.Scanner; 


public class Input {

	public static void main(String[] args) {
		// refrence the scanner module
		Scanner scanner = new Scanner(System.in);
		// get string data from user
		// we use 'print' so the system would not go to the next line after printing 
		System.out.print("Your name: "); 
		// we use scanner.naxtLine so the system will get every token(data) provided by the user
		// scanner.next will only grab the first data the user provide or we use scanner.nextLine
		// we use .trim() to remove empty/white spaces 
		String name = scanner.nextLine().trim();
		System.out.println("You are " + name);

		System.out.print("Your age: ");
		// we use nextByte because we want a byte value from the user
		// we can also use nextFloat, nextDouble etc.
		byte age = scanner.nextByte();
		System.out.println("You are " + age + " year(s) old ");
	}
}