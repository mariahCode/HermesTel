package ui;

import employee.Employee;
import employee.Sales;
import employee.Secretary;
import employee.Technician;
import utilities.Utility;

public class Main {

	public static void main(String[] args) {
		
		// (String firstName, String lastName, String gender, String title, int
		// grade,
		// double salary, double bonus)
		// TODO ask for the values.
		Technician e1 = new Technician("Bardia", "Fathi", "Male", "HOD", 3, 10000.00, 1500.00);
		Technician e2 = new Technician("Maria", "LastName", "Female", "HOS", 2, 20000.00, 1000.00);
		Sales e3 = new Sales("Mothana", "Aboush", "Male", "HOD", 3, 10000.00, 10000.00);
		Secretary e4 = new Secretary("Mera", "Alxander", "Female", "REP", 1, 20000.00, 1000.00);
		Sales e5 = new Sales("Mothana", "Aboush", "Male", "HOD", 3, 20000.00, 10000.00);

//		System.out.println(e1.getEmpID() + "/ " + e1.getFirstName() + e1.getLastName() + "/ " + e1.getGender() + " /"
//				+ e1.getTitle() + e1.getGrade() + "/ " + e1.getSalary() + "/ " + e1.getBonus());
//		System.out.println(e2.getEmpID() + " " + e2.getFirstName() + e2.getLastName() + " " + e2.getGender() + " "
//				+ e2.getTitle() + e2.getGrade() + " " + e2.getSalary() + " " + e2.getBonus());
//		System.out.println(e3.getEmpID() + " " + e3.getFirstName() + e3.getLastName() + " " + e3.getGender() + " "
//				+ e3.getTitle() + e3.getGrade() + " " + e3.getSalary() + " " + e3.getBonus());
//		System.out.println(e4.getEmpID() + " " + e4.getFirstName() + e4.getLastName() + " " + e4.getGender() + " "
//				+ e4.getTitle() + e4.getGrade() + " " + e4.getSalary() + " " + e4.getBonus());

//		e1.updateEmployee(e1.getEmpID());
//		System.out.println(e1.getEmpID() + " " + e1.getFirstName());
//
//		e3.updateEmployee(e3.getEmpID());
//		System.out.println(e3.getEmpID() + " " + e3.getFirstName());
//
		// e4.updateEmployee(e4.getEmpID());
		// System.out.println(e4.getEmpID() + " " + e4.getFirstName());

		// TODO Ask for what employee to remove. U want an ID
//		Employee.removeEmployee(e2.getEmpID());
//		System.out.println(e2.getEmployeeByID(e2.getEmpID()) + " " + e2.getFirstName());

//		Utility.echo(Statistics.averageSalary() + "");

		// Polymorphism example. 
//		Statistics.calculateBonusWithPolymorphism();

		Statistics.averageSalaryPerProfession(); 
				
	}

}
