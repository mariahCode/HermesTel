package employee;

import javax.swing.JOptionPane;

import utilities.Utility;

public class Secretary extends Employee {

	// Member variables. 
//	private String empID; // TODO enum? ex of values: dev site, sales office, customer/call/admin center
	
	// Class variables. 
	static public double averageSalaryForSecretary; // Make private 
	public static int nSecretary = 0;

	// Constructor. 
	public Secretary(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("SEC_", firstName, lastName, gender, title, grade, salary, bonus);
		
		nSecretary++; 

		employeeList.add(this);

	}	
	
	// Methods. 
	// TODO Add specific method. 
	@Override
	public void updateEmployee(Employee employee) {

		Secretary secretary = (Secretary)employee;
		
		// Ask for the new values. 
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + secretary.getEmpID() + "!");	
		secretary.setFirstName(s); 
		Utility.echo(s);

	}

	@Override
	public String mariaTest(Employee employee) {

		Secretary secretary = (Secretary)employee;
		
		Utility.echo("Secretary");
		return ""; 

	}
	
	@Override
	public double calculateBonus(Employee employee) {

		Secretary secretary = (Secretary)employee;
		
		Utility.echo("Secretary");
		return 2000.00; 

	}
	
	@Override
	public void calculateTotalSalaryPerProfession(Employee employee) {

		averageSalaryForSecretary += employee.getSalary(); 
		Utility.echo("" + employee.getSalary());
	}	

//	@Override
	public static void calculateAverageSalaryPerProfession() {

		Utility.echo("" + averageSalaryForSecretary);
		Utility.echo("" + nSecretary);

		Utility.echo("averageSalaryForSecretary: " + Utility.divide(averageSalaryForSecretary, nSecretary));
				
	}	


}
