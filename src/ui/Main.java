package ui;

import employee.Sales;
import employee.Secretary;
import employee.Technician;

public class Main {

	public static void main(String[] args) {

		Technician e1 = new Technician("Tech1", "LastName", "Male", "REP", 1, 24000.00, 5.00);
		Technician e2 = new Technician("Tech2", "LastName", "Female", "HOD", 1, 34000.00, 50000.00);
		Sales e3 = new Sales("Sale1", "LastName", "Male", "HOD", 1, 34000.00, 50000.00);
		Secretary e4 = new Secretary("Sec1", "LastName", "Male", "HOD", 1, 34000.00, 50000.00);
	
		System.out.println(e1.getEmpID());
		System.out.println(e2.getEmpID());
		System.out.println(e3.getEmpID());
		System.out.println(e4.getEmpID());

//		e1.updateEmployee(e1.getEmpID());

		
	}

}
