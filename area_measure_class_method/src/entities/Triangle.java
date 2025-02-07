package entities;

public class Triangle {
	
	public double a, b, c;
	
	public double measureArea(double a, double b, double c) {
		
		double p = (a + b + c) / 2;
		
		double area = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		
		return area;
	}
}
