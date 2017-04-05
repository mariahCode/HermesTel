package controllers;

import ui.Main;
import ui.Statistics;
import utilities.Utility;

//import static employeeManagementSystemMain.EmployeeManagementSystem.sc;

public class Methods {


	public static void printMainMenu() {
	
		
		System.out.println("\n");

		System.out.println("************ Main Menu  **************\n");

		System.out.println(" 1. Load staff managment menu. ");
		System.out.println(" 2. Load statistics menu.");
		System.out.println(" 3. Return to main menu \n");
		System.out.println("**************************************");
		System.out.print(" Make a choice: ");
		
		int respond = Main.sc.nextInt();

		
		if (respond == 1) {
			loadStaffManagementMenu();
			
			
		} else if (respond == 2) {
			loadStaffStatisticsMenu();
			
			
		} else {
			printMainMenu();
		}
	}

	
	private static void loadStaffStatisticsMenu() {
		System.out.println("\n");
		System.out.println("********* Statistics Menu  ***********\n");
		
		System.out.println("1. Get average salary overall");
		System.out.println("2. Get average salary per profession");
		System.out.println("3. Get gender distribution overall");
		System.out.println("4. Get gender distribution per profession");
		System.out.println("5. Get bonus overall");
		System.out.println("6. Get bonus per profession");
		System.out.println("7. List highest salary overall");
		System.out.println("8. List lowest salary overall \n");
		System.out.println("**************************************");
		System.out.print(" Make a choice: ");
		int respond = Main.sc.nextInt();

		switch (respond) {
			case 1: 
				Statistics.averageSalaryOverall();
				loadStaffStatisticsMenu();
				break;
			case 2: 
				Statistics.calculateAverageSalaryPerProfession();
				loadStaffStatisticsMenu();
				break;
			case 3: 
				Statistics.averageGenderOverall(); 
				loadStaffStatisticsMenu();
				break;
			case 4: 
				Statistics.averageGenderPerProfession(); 
				loadStaffStatisticsMenu();
				break;
			case 5: 
				Statistics.totalBonus(); 
				loadStaffStatisticsMenu();
				break;
			case 6: 
				Statistics.totalBonusPerProfession(); 
				loadStaffStatisticsMenu();
				break;
			case 7: 
				Statistics.getHighestSalaryOverall(); 
				loadStaffStatisticsMenu();
				break;
			case 8: 
				Statistics.getLowestSalaryOverall(); 
				loadStaffStatisticsMenu();
				break;
			default : 
				Utility.echo("Select a valid menu choise!"); 
				loadStaffStatisticsMenu();
				break;
		}
	}

	private static void loadStaffManagementMenu() {
		System.out.println("\n");
		System.out.println("********* Staff Managment  ***********\n");
		System.out.println("1. Add an employee");
		System.out.println("2. Remove an employee");
		System.out.println("3. Update an employee");
		System.out.println("4. List information about an employee\n");
		System.out.println("**************************************");
		System.out.print("Make a choice: \n");
		int respond = Main.sc.nextInt();

		switch (respond) {
		case 1: {
			System.out.println("\n********* Add an Employee  *********** \n");
			System.out.println("What kind of employee do you want to add? \n ");
			System.out.println("1. Technician ");
			System.out.println("2. Salesperson");
			System.out.println("3. Secretary \n");
			System.out.println("**************************************");
			System.out.print(" Make a choice: \n");
			respond = Main.sc.nextInt();
			
			
		}
			break;

		case 2: {
			System.out.println("\n********* Remove an Employee  *********** \n");
			System.out.println("What kind of employee do you want to remove? \n ");
			System.out.println("1. Technician ");
			System.out.println("2. Salesperson");
			System.out.println("3. Secretary \n ");
			System.out.println("**************************************");
			System.out.print(" Make a choice: \n");
			
		}
			break;

		case 3: {
			System.out.println("\n********* Update an Employee  *********** \n");
			System.out.println("What kind of employee do you want to update? \n ");
			System.out.println("1. Technician ");
			System.out.println("2. Salesperson");
			System.out.println("3. Secretary \n");
			System.out.println("**************************************");
			System.out.print(" Make a choice: \n");
			
		}
			break;

		case 4: {
		}
			break;
		}

	}
}
