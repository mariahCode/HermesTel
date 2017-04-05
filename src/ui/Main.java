package ui;

import employee.Employee;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
import utilities.*;


public class Main {

	// TODO: (JC) Print out a menu to the console. With application name Maybe company name. 
	// What will the user be able to do? Every menu should have a number that the user can select. Than there can be a sub menu.    
	
	// TODO: (AA) Fix Cancel button for all dialogs when applicable. 
	
	// TODO: (MH) Continue to implement Statistics methods. Calculate methods. Similar to: averageSalaryPerProfession method.   
	
	public static void main(String[] args) {
		
		// (String firstName, String lastName, String gender, String title, int
		// grade,
		// double salary, double bonus)
		// TODO ask for the values.

		Technician e1 = new Technician("Bardia", "Fathi", GenderType.MALE, "HOD",GradeType.HOD, 30000.00, 1500.00);
		Technician e2 = new Technician("Maria", "LastName", GenderType.UNKNOWN, "HOS", GradeType.HOS, 25000.00, 1000.00);
		SalesPerson e3 = new SalesPerson("Almothana", "Aboush", GenderType.MALE, "HOD", GradeType.HOD, 10000.00, 10000.00);
		Secretary e4 = new Secretary("Mera", "Alxander", GenderType.FEMALE, "REP", GradeType.REP, 20000.00, 1000.00);
		SalesPerson e5 = new SalesPerson("Mothana", "Aboush", GenderType.FEMALE, "HOD", GradeType.HOD, 20000.00, 10000.00);


//		System.out.println(e1.getEmpID() + "/ " + e1.getFirstName() + e1.getLastName() + "/ " + e1.getGender() + " /"
//				+ e1.getTitle() + e1.getGrade() + "/ " + e1.getSalary() + "/ " + e1.getBonus());
//		System.out.println(e2.getEmpID() + " " + e2.getFirstName() + e2.getLastName() + " " + e2.getGender() + " "
//				+ e2.getTitle() + e2.getGrade() + " " + e2.getSalary() + " " + e2.getBonus());
//		System.out.println(e3.getEmpID() + " " + e3.getFirstName() + e3.getLastName() + " " + e3.getGender() + " "
//				+ e3.getTitle() + e3.getGrade() + " " + e3.getSalary() + " " + e3.getBonus());
//		System.out.println(e4.getEmpID() + " " + e4.getFirstName() + e4.getLastName() + " " + e4.getGender() + " "
//				+ e4.getTitle() + e4.getGrade() + " " + e4.getSalary() + " " + e4.getBonus());
//
//		e1.updateEmployee(e1.getEmpID());
//		System.out.println(e1.getEmpID() + "/ " + e1.getFirstName() + e1.getLastName() + "/ " + e1.getGender() + " /"
//				+ e1.getTitle() + e1.getGrade() + "/ " + e1.getSalary() + "/ " + e1.getBonus());
//
//		e3.updateEmployee(e3.getEmpID());
//		System.out.println(e3.getEmpID() + " " + e3.getFirstName() + e3.getLastName() + " " + e3.getGender() + " "
//				+ e3.getTitle() + e3.getGrade() + " " + e3.getSalary() + " " + e3.getBonus());
//
//		 e4.updateEmployee(e4.getEmpID());
//		 System.out.println();
//		 e5.updateEmployee(e5.getEmpID());
//		 System.out.println();

//		 		 
//		 System.out.println("----------------------");
//		 System.out.println();

//		// TODO Ask for what employee to remove. U want an ID
//		Employee.removeEmployee(e2.getEmpID());
//		System.out.println();
//		Employee.removeEmployee(e1.getEmpID());
//		System.out.println();

		// Polymorphism example. 
//		Statistics.calculateBonusWithPolymorphism();

//		Statistics.averageSalaryOverall();
//		Statistics.calculateAverageSalaryPerProfession(); 
//		Statistics.calculateAverageSalaryPerProfession();
//		Statistics.averageGenderOverall(); 
//		Statistics.averageGenderPerProfession();
//		Statistics.totalBonus(); 
//		Statistics.totalBonusPerProfession();
//		Statistics.getHighestSalaryOverall(); 
//		Statistics.getLowestSalaryOverall(); 
				
	}

}
