package ui;

import java.util.ArrayList;

import employee.Employee;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
import utilities.GenderType;
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

		totalSalary = calculateAverageSalary(Employee.employeeList);		

		// Print out the result to the console.
		Utility.echo("Average salary overall: " + Utility.divide(totalSalary, Employee.employeeList.size()));
	}

	// Get average salary per profession.
	static public void calculateAverageSalaryPerProfession() {

		double totalSalary = 0.0;

		totalSalary = calculateAverageSalary(SalesPerson.salesPersonList);		
		Utility.echo("Average salary for Salesperson: " + Utility.divide(totalSalary, SalesPerson.salesPersonList.size()));

		totalSalary = calculateAverageSalary(Secretary.secretaryList);
		Utility.echo("Average salary for Secretary: " + Utility.divide(totalSalary, Secretary.secretaryList.size()));

		totalSalary = calculateAverageSalary(Technician.technicianList);
		Utility.echo("Average salary for Technician: " + Utility.divide(totalSalary, Technician.technicianList.size()));

	}

	static public double calculateAverageSalary(ArrayList<? extends Employee> arrayList) {
		
		double totalSalary = 0.0;

		for (Employee employee : arrayList) {
			totalSalary += employee.getSalary();
			// Utility.echo("Testing: " + "totalSalary: " + totalSalary);
		}

		return totalSalary;
		
	}

	// Get gender distribution in percentage for ALL employees.
	public static void averageGenderOverall() {

		int nMale = 0;
		int nFemale = 0;
		int nUnknown = 0;
		int percent = 0;

		for (Employee employee : Employee.employeeList) {

			// Utility.echo("Testing: " + "Gender: " + employee.getGender());
			if (employee.getGender().equals(GenderType.MALE)) {
				nMale++;
				// Utility.echo("Testing: " + "nMale: " + nMale);
			} else if (employee.getGender().equals(GenderType.FEMALE)) {
				nFemale++;
			} else if (employee.getGender().equals(GenderType.UNKNOWN)) {
				nUnknown++;
			}

		}

		// Calculate the percentage, and Print out the result to the console.
		Utility.echo("Gender distribution: ");
		percent = Utility.getPercentageDistribution(nMale, Employee.employeeList.size());
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemale, Employee.employeeList.size());
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknown, Employee.employeeList.size());
		Utility.echo("Unknown in percent: " + percent);

	}

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

			// Utility.echo("Testing: " + "Gender: " + employee.getGender());

			if (employee.getGender().equals(GenderType.MALE)) { // TODO MH Use
																// GenderType
																// enum?

				if (employee instanceof SalesPerson) {
					nMaleSalesPersons++;
				} else if (employee instanceof Secretary) {
					nMaleSecretary++;
				} else if (employee instanceof Technician) {
					nMaleTechnician++;
				}
			} else if (employee.getGender().equals(GenderType.FEMALE)) {
				if (employee instanceof SalesPerson) {
					nFemaleSalesPersons++;
				} else if (employee instanceof Secretary) {
					nFemaleSecretary++;
				} else if (employee instanceof Technician) {
					nFemaleTechnician++;
				}
			} else if (employee.getGender().equals(GenderType.UNKNOWN)) {
				if (employee instanceof SalesPerson) {
					nUnknownSalesPersons++;
				} else if (employee instanceof Secretary) {
					nUnknownSecretary++;
				} else if (employee instanceof Technician) {
					nUnknownTechnician++;
				}
			}
		}

		// Calculate the percentage, and Print out to the console. For
		// Salespersons.
		Utility.echo("");
		Utility.echo("Gender distribution for Salespersons: ");
		int totalNumberOfSalespersons = nMaleSalesPersons + nFemaleSalesPersons + nUnknownSalesPersons;
		percent = Utility.getPercentageDistribution(nMaleSalesPersons, totalNumberOfSalespersons);
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemaleSalesPersons, totalNumberOfSalespersons);
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknownSalesPersons, totalNumberOfSalespersons);
		Utility.echo("Unknown in percent: " + percent);

		// Calculate the percentage, and Print out to the console. For
		// Secretaries.
		Utility.echo("");
		Utility.echo("Gender distribution for Secretaries: ");
		int totalNumberOfSecretaries = nMaleSecretary + nFemaleSecretary + nUnknownSecretary;
		percent = Utility.getPercentageDistribution(nMaleSecretary, totalNumberOfSecretaries);
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemaleSecretary, totalNumberOfSecretaries);
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknownSecretary, totalNumberOfSecretaries);
		Utility.echo("Unknown in percent: " + percent);

		// Calculate the percentage, and Print out to the console. For
		// Technicians.
		Utility.echo("");
		Utility.echo("Gender distribution for Technicians: ");
		int totalNumberOfTechnicians = nMaleTechnician + nFemaleTechnician + nUnknownTechnician;
		percent = Utility.getPercentageDistribution(nMaleTechnician, totalNumberOfTechnicians);
		Utility.echo("Male in percent: " + percent);
		percent = Utility.getPercentageDistribution(nFemaleTechnician, totalNumberOfTechnicians);
		Utility.echo("Female in percent: " + percent);
		percent = Utility.getPercentageDistribution(nUnknownTechnician, totalNumberOfTechnicians);
		Utility.echo("Unknown in percent: " + percent);

	}

	// Get TOTAL bonus for all employees.
	public static void totalBonus() {

		double totalBonus = 0.0;

		for (Employee employee : Employee.employeeList) {
			// Utility.echo("Testing: " + "employee.getBonus(): " +
			// employee.getBonus());
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

	// TODO much later: Use the Collections.max(). 	
	// Get highest salary of all employees.
	public static void getHighestSalaryOverall() {
		
		double highestSalary = 0.0;
		
		for (Employee employee : Employee.employeeList) {
			highestSalary = (employee.getSalary() > highestSalary) ? employee.getSalary() : highestSalary;			
		}

		// Print out the result to the console.
		Utility.echo("");
		Utility.echo("Highest salary overall is: " + highestSalary);

	}	

	// TODO much later: Use the Collections.min(). 	
	// Get TOTAL bonus per profession.
	public static void getLowestSalaryOverall() {

		double lowestSalary = 0.0;
				
		for (Employee employee : Employee.employeeList) {
			
			// Give start value. 
			if (lowestSalary == 0.0) {
				lowestSalary = employee.getSalary();			
			}			
			
			lowestSalary = (employee.getSalary() < lowestSalary) ? employee.getSalary() : lowestSalary;			
		}

		// Print out the result to the console.
		Utility.echo("");
		Utility.echo("Lowest salary overall is: " + lowestSalary);

	}

}
