package ui;

import employee.Sales;
import employee.Secretary;
import employee.Technician;

public class Main {

	public static void main(String[] args) {

		// TODO ask for the values. 
		Technician e1 = new Technician("Tech1", "LastName", "Male", "REP", 1, 1000.00, 5.00);
		Technician e2 = new Technician("Tech2", "LastName", "Female", "HOD", 1, 2000.00, 50000.00);
		Sales e3 = new Sales("Sale1", "LastName", "Male", "HOD", 1, 2000.00, 1000.00);
		Secretary e4 = new Secretary("Sec1", "LastName", "Male", "HOD", 1, 1000.00, 50000.00);
	
		System.out.println(e1.getEmpID() + " " + e1.getFirstName());
		System.out.println(e2.getEmpID());
		System.out.println(e3.getEmpID());
		System.out.println(e4.getEmpID());

//		e1.updateEmployee(e1.getEmpID());
//		System.out.println(e1.getEmpID() + " " + e1.getFirstName());
//
//		e3.updateEmployee(e3.getEmpID());
//		System.out.println(e3.getEmpID() + " " + e3.getFirstName());
//
//		e4.updateEmployee(e4.getEmpID());
//		System.out.println(e4.getEmpID() + " " + e4.getFirstName());
		
		// TODO Ask for what employee to remove. U want an ID
//		e1.removeEmployee(e1.getEmpID());
//		System.out.println(e1.getEmployeeByID(e1.getEmpID()) + " " + e1.getFirstName());
		
		// TODO move to Statistics class
		System.out.println(e1.averageSalary() + "");
		
	}

}
