package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salario: ");
		emp.salaryGross = sc.nextDouble();
		System.out.print("Taxa: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp);
		
		System.out.print("Which percentage to increase salary: ");
		double perc = sc.nextDouble();
		emp.increaseSalary(perc);
		
		System.out.println("\nUpdate" + emp);
		
		sc.close();
	}

}
