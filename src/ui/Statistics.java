package ui;

import java.util.ArrayList;
import employee.Employee;
import utilities.Utility;

public class Statistics {

	// Member variables. 

	// Constructor. 
	
	// Methods. 
	
	// Get average salary for ALL employees. 
	static public double averageSalary() {
		
		double totalSalary = 0.00;
		for (Employee employee : Employee.employeeList) {
			Utility.echo("totalSalary: " + totalSalary);
			totalSalary += employee.getSalary();
		}
		return Utility.divide(totalSalary, Employee.employeeList.size());
	}

	static public String averageSalaryPerProfession() {
		
		String maria = "";
		for (Employee employee : Employee.employeeList) {
			// maria = employee.mariaTest(employee);
			maria = "" + employee.calculateBonus(employee);
			Utility.echo(maria);
		}
		return maria;
	}

	static public String calculateBonusWithPolymorphism() {
		
		String maria = "";
		for (Employee employee : Employee.employeeList) {
			// maria = employee.mariaTest(employee);
			maria = "" + employee.calculateBonus(employee);
			Utility.echo(maria);
		}
		return maria;
	}

	
	//	
//	public double averageGenderOverall() {
//		
//	}
//	public double averageGenderPerProfession() {
//		
//	}
//	
//	public double averageBonusOverall() {
//		
//	}
//	public double averageBonusPerProfession() {
//		
//	}
	
	
	
}
