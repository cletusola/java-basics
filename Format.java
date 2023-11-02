// Number formatting in java 

import java.text.NumberFormat;


public class Format {

	public static void main(String[] args) {

		// get currency instance 
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String currency_result = currency.format(3478039.34);
		System.out.println(currency_result);

		// get percent instance
		NumberFormat percent = NumberFormat.getPercentInstance();
		String percent_result = percent.format(0.6);
		System.out.println(percent_result);
	}
}