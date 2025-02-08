package entities;

public class Rectangle {
	
	public double width, height ;
	
	public double measureArea(double a, double b) {
		
		double area = a * b;
		
		return area;
	}
	
	public double measurePerimeter(double a, double b) {
		
		double perimeter =(a + b) * 2;
		
		return perimeter;
	}
	
	public double measureDiagonal(double a, double b) {
		
		double diagonal = Math.sqrt((a * a) + (b * b));
		
		return diagonal;
	}
	
	public String toString() {
		return 	"Area = "
				+ String.format("%.2f\n", measureArea(width, height))
				+ "Perimeter = "
				+ String.format("%.2f\n", measurePerimeter(width, height))
				+ "Diagonal = "
				+ String.format("%.2f\n", measureDiagonal(width, height));
	}
}
