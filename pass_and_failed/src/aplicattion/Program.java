package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant st = new Studant();
		
		st.name = sc.nextLine();
		st.n1 = sc.nextDouble();
		st.n2 = sc.nextDouble();
		st.n3 = sc.nextDouble();
		
		double result = st.measureStudant(st.n1, st.n2,st.n3);
		
		if(result >= 60) {
			System.out.println("Final note: " + result + "\nPass");
		}else {
			System.out.println("Final note: " + result + "\nFailed");
			result -= 60;
			System.out.println("Missing " + String.format("%.2f", result) + " points");
		}
		
		sc.close();
	}

}
