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

	// TODO MH Remove before delivery!
	// Polymorphism example. 
	static public String calculateBonusWithPolymorphism() {
		
		String maria = "";
		for (Employee employee : Employee.employeeList) {
			maria = "" + employee.calculateBonus(employee);
			Utility.echo(maria);
		}
		return maria;
	}

	// Get average salary for ALL employees. 
	static public void averageSalaryOverall() {		
		
		double totalSalary = 0.00;
		
		for (Employee employee : Employee.employeeList) {
			Utility.echo("Testing: " + "totalSalary: " + totalSalary);  
			totalSalary += employee.getSalary();
		}
		
		// Print out the result to the console. 
		Utility.echo("Average salary overall: " + Utility.divide(totalSalary, Employee.employeeList.size()));
	}

	// Get average salary per profession. 
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
	
	// Get gender distribution in percentage for ALL employees. 
	public static void averageGenderOverall() {
//		MALE,FEMALE,UNKNOWN;
		
		int nMale = 0;
		int nFemale = 0;
		int nUnknown = 0;
		int percent = 0; 
		
		for (Employee employee : Employee.employeeList) {

//			Utility.echo("Testing: " + "Gender: " + employee.getGender()); 		
			if (employee.getGender().equals("MALE")) { // TODO MH Use GenderType enum?
				nMale++;
//				Utility.echo("Testing: " + "nMale: " + nMale); 
			} else if (employee.getGender().equals("FEMALE")) {
            	nFemale++;				
			} else if (employee.getGender().equals("UNKNOWN")) {
            	nUnknown++;				
			}
			
		}
		
		// Calculate the percentage, and Print out the result to the console. 
		Utility.echo("Gender distribution: ");
		percent = Utility.getPercentageDistribution(nMale, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemale, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknown, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);

	}
	
	// in percent!
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
	
//	public double getHighestSalaryOverall() {
//	
//}
	
//public double getLowestSalaryOverall() {
//	
//}
	
	
}
