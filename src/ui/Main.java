package ui;

import controllers.Menues;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
import utilities.GenderType;
import utilities.GradeType;


public class Main {

	public static void main(String[] args) {

		// TODO Remove before release. 
		// Testing: Add some employees. 
		Technician e1 = new Technician("Bardia", "Fathi", GenderType.MALE, "HOD",GradeType.HOD, 30000.00, 1500.00);
		Technician e2 = new Technician("Maria", "LastName", GenderType.UNKNOWN, "HOS", GradeType.HOS, 25000.00, 1000.00);
		SalesPerson e3 = new SalesPerson("Almothana", "Aboush", GenderType.MALE, "HOD", GradeType.HOD, 10000.00, 10000.00);
		Secretary e4 = new Secretary("Mera", "Alxander", GenderType.FEMALE, "REP", GradeType.REP, 20000.00, 1000.00);
		SalesPerson e5 = new SalesPerson("Mothana", "Aboush", GenderType.FEMALE, "HOD", GradeType.HOD, 20000.00, 10000.00);

		// Display menues. 
		Menues.printMainMenu();
				
	}

}


