// multi dimensional array  

import java.util.Arrays;

public class Multi {

	public static void main(String[] args) {

		int [][] numbers = new int [2][3];
		numbers [0][0] = 3;
		System.out.println(Arrays.deepToString(numbers));

		// array 2  

		int[][] num = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(num));
	}
}