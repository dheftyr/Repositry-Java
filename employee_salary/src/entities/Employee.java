package entities;

public class Employee {
	
	public String name;
	public double salaryGross, tax;
	
	public double netSalary() {
		return salaryGross - tax;
	}
	
	
	public void increaseSalary(double perc) {
		
		salaryGross += salaryGross * perc / 100.0;
		 
	}
	
	public String toString() {
		return "\nEmployee: "
			 + name
			 + ", $"
			 + String.format("%.2f\n", netSalary());
	}
}
