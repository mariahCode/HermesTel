package employee;

import javax.swing.JOptionPane;

import utilities.Utility;

public class SalesPerson extends Employee {

	// Member variables. 
//	private String empID; // TODO enum? ex of values: dev site, sales office, customer/call/admin center

	// Class variables. 
	static public double averageSalaryForSales; // Make private 
	public static int nSales = 0;

	// Constructor. 
	public SalesPerson(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("SAL_", firstName, lastName, gender, title, grade, salary, bonus);

		nSales++; 

		employeeList.add(this);

	}
	
	// Methods. 
	// TODO Add specific method. 
	@Override
	public void updateEmployee(Employee employee) {

		SalesPerson sales = (SalesPerson)employee;
		
		// Ask for the new values. 
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + sales.getEmpID() + "!");	
		sales.setFirstName(s);
		System.out.println("The First name :");
		Utility.echo(s);
		System.out.println(":::::::::::::::::::::");

		String s1 = JOptionPane.showInputDialog("Enter new last name for the employee " + sales.getEmpID() + "!");	
		sales.setLastName(s1); 
		System.out.println("The last name :");
		Utility.echo(s1);
		System.out.println(":::::::::::::::::::::");
		Utility.echo(s1);
		

	}

	@Override
	public String mariaTest(Employee employee) {

		SalesPerson sales = (SalesPerson)employee;
		Utility.echo("Sales");
		return ""; 

	}
	
	@Override
	public double calculateBonus(Employee employee) {

		SalesPerson sales = (SalesPerson)employee;
		Utility.echo("Sales");
		return 1000.00; 
	}	
	
	@Override
	public void calculateTotalSalaryPerProfession(Employee employee) {

		averageSalaryForSales += employee.getSalary(); 
		Utility.echo("Sale: " + employee.getSalary());
	}	
		
//	@Override
	public static void calculateAverageSalaryPerProfession() {

		Utility.echo("" + averageSalaryForSales);
		Utility.echo("" + nSales);

		Utility.echo("averageSalaryForSales: " + Utility.divide(averageSalaryForSales, nSales));
				
	}	
	
	
}
