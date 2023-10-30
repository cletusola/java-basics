public class Casting {
	public static void main(String[] args) {
		// implicit casting  
		// data types can be automatically converted to another 
		short x = 1;
		int y = x + 2; 
		System.out.println(y);

		// explicit casting
		// manual coverting(casting of data)  
		double x = 1.1;
		int y = (int)x + 2;
		System.out.println(y);

		// explicit casting 2 
		String x = "1";
		int y = Interger.parseInt(x) + 2;
		System.out.println(y);
	}
}