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
	static public void calculateAverageSalaryPerProfession() {
		double totalSalaryForSales = 0.0; 
		double totalySalaryForSecretarys = 0.0; 
		double totalySalaryForTechnicians = 0.0; 
		for (Employee employee : Employee.employeeList) {
			if (employee instanceof SalesPerson) {
				totalSalaryForSales += employee.getSalary(); 
			} else if (employee instanceof Secretary) {
				totalySalaryForSecretarys += employee.getSalary(); 				
			} else if (employee instanceof Technician) {
				totalySalaryForTechnicians += employee.getSalary(); 				
			}			
		}

		// Print out the result to the console. 
		Utility.echo("Average salary for Salesperson: " + Utility.divide(totalSalaryForSales, SalesPerson.nSales));
		Utility.echo("Average salary for Secretary: " + Utility.divide(totalySalaryForSecretarys, Secretary.nSecretary));
		Utility.echo("Average salary for Technician: " + Utility.divide(totalySalaryForTechnicians, Technician.nTechnician)); 
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
