package ui;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.allMethods;
import employee.Employee;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
import utilities.Utility;
import ui.*;

public class Main {


	public static ArrayList<Employee> employeeList=new ArrayList<>();
	
	public static String name;
	
	
	public static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {

		
//		if (employeeList.size()==0)
//			allMethods.loadDatabase();
//		System.out.println(" Employee ID,     First  Name,   Last  Name,   Gender,  Tittle,   Grade,   Salary,  Bonus" );
//		for (Employee e:employeeList){
//			System.out.println(e);
//		}

		controllers.Methods.printMainMenu();
		
		
	}

}



// System.out.println(e1.getEmpID() + "/ " + e1.getFirstName() +
// e1.getLastName() + "/ " + e1.getGender() + " /"
// + e1.getTitle() + e1.getGrade() + "/ " + e1.getSalary() + "/ " +
// e1.getBonus());
// System.out.println(e2.getEmpID() + " " + e2.getFirstName() +
// e2.getLastName() + " " + e2.getGender() + " "
// + e2.getTitle() + e2.getGrade() + " " + e2.getSalary() + " " +
// e2.getBonus());
// System.out.println(e3.getEmpID() + " " + e3.getFirstName() +
// e3.getLastName() + " " + e3.getGender() + " "
// + e3.getTitle() + e3.getGrade() + " " + e3.getSalary() + " " +
// e3.getBonus());
// System.out.println(e4.getEmpID() + " " + e4.getFirstName() +
// e4.getLastName() + " " + e4.getGender() + " "
// + e4.getTitle() + e4.getGrade() + " " + e4.getSalary() + " " +
// e4.getBonus());
//
// e1.updateEmployee(e1.getEmpID());
// System.out.println(e1.getEmpID() + "/ " + e1.getFirstName() +
// e1.getLastName() + "/ " + e1.getGender() + " /"
// + e1.getTitle() + e1.getGrade() + "/ " + e1.getSalary() + "/ " +
// e1.getBonus());
//
// e3.updateEmployee(e3.getEmpID());
// System.out.println(e3.getEmpID() + " " + e3.getFirstName() +
// e3.getLastName() + " " + e3.getGender() + " "
// + e3.getTitle() + e3.getGrade() + " " + e3.getSalary() + " " +
// e3.getBonus());
//
// e4.updateEmployee(e4.getEmpID());
// System.out.println();
//e5.updateEmployee(e5.getEmpID());
//System.out.println();
//
// System.out.println("----------------------");
// System.out.println();

// // TODO Ask for what employee to remove. U want an ID
// Employee.removeEmployee(e2.getEmpID());
// System.out.println();
// Employee.removeEmployee(e1.getEmpID());
// System.out.println();

// Utility.echo(Statistics.averageSalary() + "");

// Polymorphism example.
// Statistics.calculateBonusWithPolymorphism();

// TODO (MH) Improve this!
//Statistics.calculateAverageSalaryPerProfession();
