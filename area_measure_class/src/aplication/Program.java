package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
	
		
		System.out.println("Enter the measure of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c)/ 2.0;
		
		double triX = Math.sqrt(p*(p - x.a)*(p - x.b)*(p - x.c));
		
		System.out.println("Enter the measure of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (y.a + y.b + y.c)/ 2.0;
		
		double triY = Math.sqrt(p*(p - y.a)*(p - y.b)*(p - y.c));
		
		System.out.printf("Triangle X area: %.4f\n", triX);
		System.out.printf("Triangle X area: %.4f\n", triY);
		
		if(triX > triY) {
			System.out.println("Larger area X");
		}else {
			System.out.println("Larger area Y");
		}
		
		sc.close();
	}
}
