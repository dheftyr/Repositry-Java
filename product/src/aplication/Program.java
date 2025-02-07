package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product pro = new Product();
		
		System.out.println("Enter product data:");
		pro.name = sc.nextLine();
		pro.price = sc.nextDouble();
		pro.quantity = sc.nextInt();
		
		
		System.out.println("\n" + pro);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int num = sc.nextInt();
		pro.addProduct(num);
		
		System.out.println("\n" + pro);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		num = sc.nextInt();
		pro.removeProduct(num);
		
		System.out.println("\n" + pro);
		
		sc.close();
	}
}
