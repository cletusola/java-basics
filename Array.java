import java.util.Arrays;

// Arrays in java
public class Array {

	public static void main(String[] args) {
	
		// array one 
		int[] numbers = new int[4];

		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;

		System.out.println(Arrays.toString(numbers));

		// array two 
		int[] num = {6,2,3,1,4,5};
		System.out.println(num.length);

		// array three 
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}
}