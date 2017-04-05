package ui;

import employee.Employee;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
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

	// ugly version
//	static public void averageSalaryPerProfession() {
//		for (Employee employee : Employee.employeeList) {
//			employee.calculateTotalSalaryPerProfession(employee);
//		}
//		Sales.calculateAverageSalaryPerProfession();
//		Secretary.calculateAverageSalaryPerProfession();
//		Technician.calculateAverageSalaryPerProfession(); 
//	}

	// bita: use instanceof in this case!
	static public void averageSalaryPerProfession() {
		for (Employee employee : Employee.employeeList) {
			employee.calculateTotalSalaryPerProfession(employee);
		}
		SalesPerson.calculateAverageSalaryPerProfession();
		Secretary.calculateAverageSalaryPerProfession();
		Technician.calculateAverageSalaryPerProfession(); 
	}
	
	// Polymorphism example. 
	static public String calculateBonusWithPolymorphism() {
		
		String maria = "";
		for (Employee employee : Employee.employeeList) {
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
