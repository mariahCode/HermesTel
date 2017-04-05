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
	
	// TODO MH ADAPT TO ENUM GENDERTYPES. 
	// TODO MH Improve this version!
	// Get gender distribution in percentage for ALL employees. 
	public static void averageGenderPerProfession() {

		int nMaleSalesPersons = 0;
		int nFemaleSalesPersons = 0;
		int nUnknownSalesPersons = 0;
		int nMaleSecretary = 0;
		int nFemaleSecretary = 0;
		int nUnknownSecretary = 0;
		int nMaleTechnician = 0;
		int nFemaleTechnician = 0;
		int nUnknownTechnician = 0;
		int percent = 0; 
		
		for (Employee employee : Employee.employeeList) {

//			Utility.echo("Testing: " + "Gender: " + employee.getGender()); 		

			if (employee.getGender().equals("MALE")) { // TODO MH Use GenderType enum?
				
				if (employee instanceof SalesPerson) {
					nMaleSalesPersons++; 
				} else if (employee instanceof Secretary) {
					nMaleSecretary++; 				
				} else if (employee instanceof Technician) {
					nMaleTechnician++; 				
				}			
			} else if (employee.getGender().equals("FEMALE")) {
				if (employee instanceof SalesPerson) {
					nFemaleSalesPersons++; 
				} else if (employee instanceof Secretary) {
					nFemaleSecretary++; 				
				} else if (employee instanceof Technician) {
					nFemaleTechnician++; 				
				}			
			} else if (employee.getGender().equals("UNKNOWN")) {
				if (employee instanceof SalesPerson) {
					nUnknownSalesPersons++; 
				} else if (employee instanceof Secretary) {
					nUnknownSecretary++; 				
				} else if (employee instanceof Technician) {
					nUnknownTechnician++; 				
				}			
			}
		}
		
		// Calculate the percentage, and Print out to the console. For Salespersons.  
		Utility.echo("");
		Utility.echo("Gender distribution for Salespersons: ");
		percent = Utility.getPercentageDistribution(nMaleSalesPersons, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemaleSalesPersons, Employee.employeeList.size());
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknownSalesPersons, Employee.employeeList.size());
		Utility.echo("Unknown in percent: " + percent);

		// Calculate the percentage, and Print out to the console. For Secretaries.  
		Utility.echo("");
		Utility.echo("Gender distribution for Secretaries: ");
		percent = Utility.getPercentageDistribution(nMaleSecretary, Employee.employeeList.size());
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemaleSecretary, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknownSecretary, Employee.employeeList.size());
		Utility.echo("Unknown in percent: " + percent);

		// Calculate the percentage, and Print out to the console. For Technicians.  
		Utility.echo("");
		Utility.echo("Gender distribution for Technicians: ");
		percent = Utility.getPercentageDistribution(nMaleTechnician, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemaleTechnician, Employee.employeeList.size());
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknownTechnician, Employee.employeeList.size());
		Utility.echo("Unknown in percent: " + percent);

	}
	
	// Get TOTAL bonus for all employees. 
	public static void totalBonus() {
		
		double totalBonus = 0.0;
		
		for (Employee employee : Employee.employeeList) {

//			Utility.echo("Testing: " + "employee.getBonus(): " + employee.getBonus()); 		
			totalBonus += employee.getBonus(); 
			
		}
		
		// Print out the result to the console. 
		Utility.echo("");
		Utility.echo("Total bonus for all employees: " + totalBonus);
	}
	
	// Get TOTAL bonus per profession. 
	public static void totalBonusPerProfession() {
		
		double totalBonusSalesPerson = 0.0;
		double totalBonusSecretary = 0.0;
		double totalBonusTechnician = 0.0;
		
		for (Employee employee : Employee.employeeList) {

			if (employee instanceof SalesPerson) {
				totalBonusSalesPerson += employee.getBonus(); 
			} else if (employee instanceof Secretary) {
				totalBonusSecretary += employee.getBonus(); 
			} else if (employee instanceof Technician) {
				totalBonusTechnician += employee.getBonus(); 
			}			

		}
		
		// Print out the result to the console. 
		Utility.echo("");
		Utility.echo("Total bonus for all per profession: ");
		Utility.echo("Salespersons: " + totalBonusSalesPerson);
		Utility.echo("Secretaries: " + totalBonusSecretary);
		Utility.echo("Technicians: " + totalBonusTechnician);
	}
	
	
	
//	public double getHighestSalaryOverall() {
//	
//}
	
//public double getLowestSalaryOverall() {
//	
//}
	
	
}
