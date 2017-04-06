package controllers;

import java.util.Scanner;

import ui.EmployeeManagement;
import ui.Statistics;
import utilities.Utility;


public class Menues {

	// Class variables. 
	public static Scanner sc= new Scanner (System.in);

	// Class level method. 
	public static void printMainMenu() {
	
		Utility.echo("\n");
		Utility.echo("************ Main Menu ***************\n");
		Utility.echo(" 1. Load staff managment menu");
		Utility.echo(" 2. Load statistics menu");
		Utility.echo(" 3. Quit the pogram \n");
		Utility.echo("**************************************");

		System.out.print(" Make a choice: ");
		int response = sc.nextInt();

		switch (response) {
			case 1: 
				loadStaffManagementMenu();
				break;
			case 2: 
				loadStaffStatisticsMenu();
				break;
			case 3: 
				Utility.printQuitProgram();
				System.exit(0);
				break;
			default : 
				Utility.echo("Select a valid menu choice!"); 
				printMainMenu();
				break;
		}
	}

	private static void loadStaffManagementMenu() {
		
		Utility.echo("\n");
		Utility.echo("********* Staff Managment ************\n");
		Utility.echo(" 1. Add an employee");
		Utility.echo(" 2. Update an employee");
		Utility.echo(" 3. List information about an employee");
		Utility.echo(" 4. Remove an employee");
		Utility.echo(" 5. Return to main menu");
		Utility.echo(" 6. Quit the pogram \n");
		Utility.echo("**************************************");
		
		System.out.print(" Make a choice: \n");
		int response = sc.nextInt();

		Utility.echo("");
		
		switch (response) {
			case 1: 
				EmployeeManagement.addAnEmployee();
				loadStaffManagementMenu();
				break;
			case 2: 
				EmployeeManagement.updateAnEmployee();
				loadStaffManagementMenu();
				break;
			case 3: 
				EmployeeManagement.listInfoForAnEmployee();
				loadStaffManagementMenu();
				break;
			case 4: 
				EmployeeManagement.removeAnEmployee();
				loadStaffManagementMenu();
				break;
			case 5: 
				printMainMenu();
				break;
			case 6: 
				Utility.printQuitProgram();
				System.exit(0);
				break;
			default : 
				Utility.echo("Select a valid menu choice!"); 
				loadStaffManagementMenu();
				break;
		}

		Utility.echo("");
	}
	
	private static void loadStaffStatisticsMenu() {
		
		Utility.echo("\n");
		Utility.echo("********* Statistics Menu ************\n");
		Utility.echo(" 1. Get average salary overall");
		Utility.echo(" 2. Get average salary per profession");
		Utility.echo(" 3. Get gender distribution overall");
		Utility.echo(" 4. Get gender distribution per profession");
		Utility.echo(" 5. Get bonus overall");
		Utility.echo(" 6. Get bonus per profession");
		Utility.echo(" 7. List highest salary overall");
		Utility.echo(" 8. List lowest salary overall");
		Utility.echo(" 9. Return to main menu");
		Utility.echo("10. Quit the pogram \n");
		Utility.echo("**************************************");
		
		System.out.print(" Make a choice: ");
		int response = sc.nextInt();

		Utility.echo("");
		
		switch (response) {
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
			case 9: 
				printMainMenu();
				break;
			case 10: 
				Utility.printQuitProgram();
				System.exit(0);
				break;
			default : 
				Utility.echo("Select a valid menu choice!"); 
				loadStaffStatisticsMenu();
				break;
		}
		Utility.echo("");
	}

}
