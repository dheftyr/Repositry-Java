package entities;

public class Studant {
	
	public String name;
	public double n1, n2, n3;
	
	public double measureStudant(double n1, double n2, double n3) {
		double finalNote;
		
		finalNote = n1 + n2 + n3;
		
		return finalNote;
	}
}
