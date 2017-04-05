package employee;

import javax.swing.JOptionPane;

import utilities.Utility;

public class Sales extends Employee {

	// Member variables. 
//	private String empID; // TODO enum? ex of values: dev site, sales office, customer/call/admin center

	// Class variables. 
	static public double averageSalaryForSales; // Make private 
	public static int nSales = 0;

	// Constructor. 
	public Sales(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("SAL_", firstName, lastName, gender, title, grade, salary, bonus);

		nSales++; 

		employeeList.add(this);

	}
	
	// Methods. 
	// TODO Add specific method. 
	@Override
	public void updateEmployee(Employee employee) {

		Sales sales = (Sales)employee;
		
		// Ask for the new values. 
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + sales.getEmpID() + "!");	
		sales.setFirstName(s); 
		Utility.echo(s);

	}

	@Override
	public String mariaTest(Employee employee) {

		Sales sales = (Sales)employee;
		Utility.echo("Sales");
		return ""; 

	}
	
	@Override
	public double calculateBonus(Employee employee) {

		Sales sales = (Sales)employee;
		Utility.echo("Sales");
		return 1000.00; 
	}	
	
// TODO MH Remove?	
////	@Override
//	public static double calculateAverageSalaryPerProfession() {
//		Utility.echo(averageSalaryForSales + " / " + nSales);
//		return Utility.divide(averageSalaryForSales, nSales); 
//	}	
	
}
