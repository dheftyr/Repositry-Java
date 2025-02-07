package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, p, triX, triY;
		
		System.out.println("Enter the measure of triangle X:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		p = (a + b + c)/ 2.0;
		
		triX = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		
		System.out.println("Enter the measure of triangle Y:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		p = (a + b + c)/ 2.0;
		
		triY = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		
		System.out.printf("Triangle X area: %.4f\n", triX);
		System.out.printf("Triangle X area: %.4f\n", triY);
		
		if(triX > triY) {
			System.out.println("Larger area X");
		}else {
			System.out.println("Larger area Y");
		}
		
	}
}
