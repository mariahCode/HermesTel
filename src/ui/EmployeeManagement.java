package ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import employee.Employee;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
import utilities.Utility;


public class EmployeeManagement {
	
	// TODO IMPORTANT: Change this to (calling) applicable employee management methods. 

	public static void addAnEmployee() {
					
		String employeeType = JOptionPane.showInputDialog("Enter the employee type (SalesPerson/Secretary/Technician)");
		String firstName = JOptionPane.showInputDialog("Enter first name for the new employee");
		String lastName = JOptionPane.showInputDialog("Enter last name for the new employee");
		String gender = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN)");		
		String title = JOptionPane.showInputDialog("Enter title  for the new employee");
		String grade = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) ");
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter new Salary for the employee"));
		
		// TODO Convert to GenderType and GradeType. 
		// Add the new employee. 
		Utility.echo("The newly created employee: ");
		if (employeeType.equals("SalesPerson")) {
			SalesPerson newEmployee = new SalesPerson(firstName, lastName, gender, title, grade, salary);
			Utility.echo(newEmployee.toString());
		}
		if (employeeType.equals("Secretary")) {
			Secretary newEmployee = new Secretary(firstName, lastName, gender, title, grade, salary);
			Utility.echo(newEmployee.toString());
		}
		if (employeeType.equals("Technician")) {
			Technician newEmployee = new Technician(firstName, lastName, gender, title, grade, salary);
			Utility.echo(newEmployee.toString());
		}
		
	}
	
	public static void updateAnEmployee() {

		Utility.echo("Update an employee: ");
		
		String empID = JOptionPane.showInputDialog("Enter the employee ID for the employee that you want to update information about");
		Employee employee = Employee.getEmployeeByID(empID);		
		employee.updateEmployee();
		Utility.echo(employee.toString());
	
	}

	public static void listInfoForAnEmployee() {
		
		Utility.echo("Displaying info for a certain employee: ");
		
		String empID = JOptionPane.showInputDialog("Enter the employee ID for the employee that you want to display information about");
		Employee employee = Employee.getEmployeeByID(empID);

		Utility.echo(employee.toString());
	}

	public static void removeAnEmployee() {

		Utility.echo("Remove an employee: ");
		
		String empID = JOptionPane.showInputDialog("Enter the employee ID for the employee that you want to remove");
//		Employee employee = Employee.removeEmployee(empID);		
//		employee.removeEmployee();
		Employee.removeEmployee(empID);
		Utility.echo("Testing: " + Employee.employeeList.size() + Technician.technicianList.size());
		
		Utility.echo("Employee " + empID + " was removed");
		
	}

}
