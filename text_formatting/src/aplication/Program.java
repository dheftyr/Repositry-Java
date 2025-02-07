package aplication;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product:");
		System.out.printf(product1 + ", which price is $ %.2f\n", price1);
		System.out.printf(product2 + ", which price is $ %.2f\n\n", price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n",
				age, code, gender);
		
		System.out.println("Measure with eight decimal places: " + measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		//Pode ser dessa forma também.
		//System.out.printf(Locale.US, "US decimal point: %.3f", measure);
		
		
	}

}
