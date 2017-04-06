package ui;

import controllers.Menues;
import employee.SalesPerson;
import employee.Secretary;
import employee.Technician;
import utilities.GenderType;
import utilities.GradeType;


public class Main {

	public static void main(String[] args) {

		prefillAnEmployeeDB();
		
		// Display menues. 
		Menues.printMainMenu();
				
	}

	// Testing: Add some employees. As if we already have some employees in our db.  
	public static void prefillAnEmployeeDB() {
		SalesPerson e1 = new SalesPerson("Mothana", "Aboush", "female", "Title 1", "HOD", 10000.00);
		SalesPerson e2 = new SalesPerson("Almothana", "Aboush", "male", "Title 2", "REP", 20000.00);
		Secretary e3 = new Secretary("Sven", "Svensson",  "male", "Title 3", "REP", 30000.00);;
		Secretary e4 = new Secretary("Mera", "Alxander", "female", "Title 4", "HOS", 40000.00);
		Technician e5 = new Technician("Bardia", "Fathi", "male", "Title 5","HOD", 30000.00);
		Technician e6 = new Technician("Maria", "Hansson", "unknown", "Title 6", "HOS", 40000.00);
	}
	
}


