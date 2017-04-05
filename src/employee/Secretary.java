package employee;

import javax.swing.JOptionPane;

import utilities.GenderType;
import utilities.GradeType;
import utilities.Utility;

public class Secretary extends Employee {

	// Member variables. 
//	private String empID; // TODO enum? ex of values: dev site, secretary office, customer/call/admin center
	
	// Class variables. 
	static public double averageSalaryForSecretary; // Make private 
	public static int nSecretary = 0;

	// Constructor. 
	public Secretary(String firstName, String lastName, GenderType gender, String title, GradeType grade, double salary,
			double bonus) {
		
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
		if (s == null)
			System.exit(0);
		secretary.setFirstName(s);
		System.out.println("The First name :");
//		Utility.echo(s);
		System.out.println(":::::::::::::::::::::");

		String s1 = JOptionPane.showInputDialog("Enter new last name for the employee " + secretary.getEmpID() + "!");
		if (s1 == null)
			System.exit(0);
		secretary.setLastName(s1);
		System.out.println("The last name :");
//		Utility.echo(s1);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s1);
		
		String s3 = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN) " + secretary.getEmpID() + "!");
		if (s3 == null)
			System.exit(0);
		if (s3.equalsIgnoreCase("male")){
			secretary.setGender(GenderType.MALE);
		}
		else if (s3.equalsIgnoreCase("female")){
			secretary.setGender(GenderType.FEMALE);
		}
		else if (s3.equalsIgnoreCase("unknown")){
			secretary.setGender(GenderType.UNKNOWN);
		}
	
		
		System.out.println("The gender :");
//		Utility.echo(s3);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s3);
		
		String s4 = JOptionPane.showInputDialog("Enter new title for the employee " + secretary.getEmpID() + "!");
		if (s4 == null)
			System.exit(0);
		secretary.setTitle(s4);
		System.out.println("The title :");
//		Utility.echo(s4);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s4);
		
		String s5 = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) " + secretary.getEmpID() + "!");
		if (s5 == null)
			System.exit(0);
		if (s5.equalsIgnoreCase("REP")){
			secretary.setGrade(GradeType.REP);
			secretary.setBonus(1000);
		}
		else if (s5.equalsIgnoreCase("HOS")){
			secretary.setGrade(GradeType.HOS);
			secretary.setBonus(2000);
		}
		else if (s5.equalsIgnoreCase("HOD")){
			secretary.setGrade(GradeType.HOD);
			secretary.setBonus(5000);
		}
		
		System.out.println("The grade :");
		Utility.echo(s5);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s5);
		
		
		String s6 = JOptionPane.showInputDialog("Enter new salary for the employee " + secretary.getEmpID() + "!");
		if (s6 == null)
			System.exit(0);
		secretary.setSalary(Double.parseDouble(s6));
		System.out.println("The Salary :");
//		Utility.echo(s6);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s6);
		
//		String s7 = JOptionPane.showInputDialog("Enter new bouns for the employee " + secretary.getEmpID() + "!");
////		secretary.setBonus(Double.parseDouble(s7));
//		if (s7.equalsIgnoreCase("REP")){
//			secretary.setBonus(1000);
//		}
//		else if (s7.equalsIgnoreCase("HOS")){
//			secretary.setBonus(2000);
//		}
//		else if (s7.equalsIgnoreCase("HOD")){
//			secretary.setBonus(5000);
//		}
		System.out.println("The bouns :");
//		Utility.echo(s7);
		System.out.println(secretary.getBonus());
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s7);
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
	
	// TODO MH Remove?	
//	@Override
//	public void calculateTotalSalaryPerProfession(Employee employee) {
//
//		averageSalaryForSecretary += employee.getSalary(); 
//		Utility.echo("" + employee.getSalary());
//	}	

	// TODO MH Remove?	
//	@Override
//	public static void calculateAverageSalaryPerProfession() {
//		Utility.echo("" + averageSalaryForSecretary);
//		Utility.echo("" + nSecretary);
//		Utility.echo("averageSalaryForSecretary: " + Utility.divide(averageSalaryForSecretary, nSecretary));
//	}	

}
