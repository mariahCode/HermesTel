package employee;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import utilities.GenderType;
import utilities.GradeType;
import utilities.Utility;

public class SalesPerson extends Employee {

	// Member variables.
	// private String empID; // TODO enum? ex of values: dev site, sales office,
	// customer/call/admin center

	// Class variables.
	static public double averageSalaryForSales; // Make private
	public static int nSales = 0;
	static public ArrayList<SalesPerson> salesPersonList = new ArrayList<>();

	// Constructor.
	public SalesPerson(String firstName, String lastName, GenderType gender, String title, GradeType grade, double salary,
			double bonus) {

		super("SAL_", firstName, lastName, gender, title, grade, salary, bonus);

		nSales++;

		employeeList.add(this);
		salesPersonList.add(this);

	}

	// Methods.
	// TODO Add specific method.
	@Override
	public void updateEmployee(Employee employee) {

		SalesPerson sales = (SalesPerson) employee;

		// Ask for the new values.
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + sales.getEmpID() + "!" );
		if (s == null)
			System.exit(0);
		sales.setFirstName(s);
		System.out.println("The First name :");
		Utility.echo(s);
		System.out.println(":::::::::::::::::::::");

		String s1 = JOptionPane.showInputDialog("Enter new last name for the employee " + sales.getEmpID() + "!");
		if (s1 == null)
			System.exit(0);
		sales.setLastName(s1);
		System.out.println("The last name :");
		Utility.echo(s1);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s1);
		
		String s3 = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN) " + sales.getEmpID() + "!");
		if (s3 == null)
			System.exit(0);
		if (s3.equalsIgnoreCase("male")){
			sales.setGender(GenderType.MALE);
		}
		else if (s3.equalsIgnoreCase("female")){
			sales.setGender(GenderType.FEMALE);
		}
		else if (s3.equalsIgnoreCase("unknown")){
			sales.setGender(GenderType.UNKNOWN);
		}
	
		
		System.out.println("The gender :");
		Utility.echo(s3);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s3);
		
		String s4 = JOptionPane.showInputDialog("Enter new title for the employee " + sales.getEmpID() + "!");
		if (s4 == null)
			System.exit(0);
		sales.setTitle(s4);
		System.out.println("The title :");
		System.out.println(sales.getTitle());
//		Utility.echo(s4);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s4);
		
		String s5 = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) " + sales.getEmpID() + "!");
		if (s5 == null)
			System.exit(0);
		if (s5.equalsIgnoreCase("REP")){
			sales.setGrade(GradeType.REP);
			sales.setBonus(2500);
		}
		else if (s5.equalsIgnoreCase("HOS")){
			sales.setGrade(GradeType.HOS);
			sales.setBonus(5000);
		}
		else if (s5.equalsIgnoreCase("HOD")){
			sales.setGrade(GradeType.HOD);
			sales.setBonus(8000);
		}
		
		System.out.println("The grade :");
		Utility.echo(s5);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s5);
		
		
		String s6 = JOptionPane.showInputDialog("Enter new Salary for the employee " + sales.getEmpID() + "!");
		if (s6 == null)
			System.exit(0);
		sales.setSalary(Double.parseDouble(s6));
		System.out.println("The Salary :");
		Utility.echo(s6);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s6);
		
//		String s7 = JOptionPane.showInputDialog("Enter new bouns for the employee " + sales.getEmpID() + "!");
////		sales.setBonus(Double.parseDouble(s7));
//		if (s7.equalsIgnoreCase("REP")){
//			sales.setBonus(2500);
//		}
//		else if (s7.equalsIgnoreCase("HOS")){
//			sales.setBonus(5000);
//		}
//		else if (s7.equalsIgnoreCase("HOD")){
//			sales.setBonus(8000);
//		}
		
		System.out.println("The bouns :");
//		Utility.echo(s7);
		System.out.println(sales.getBonus());
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s7);
	}

	@Override
	public String mariaTest(Employee employee) {

		SalesPerson sales = (SalesPerson) employee;
		Utility.echo("Sales");
		return "";

	}

	@Override
	public double calculateBonus(Employee employee) {

		SalesPerson sales = (SalesPerson) employee;
		Utility.echo("Sales");
		return 1000.00;
	}

	// @Override
	public void calculateTotalSalaryPerProfession(Employee employee) {

		averageSalaryForSales += employee.getSalary();
		Utility.echo("Sale: " + employee.getSalary());
	}

	// @Override
	public static void calculateAverageSalaryPerProfession() {

		Utility.echo("" + averageSalaryForSales);
		Utility.echo("" + nSales);

		Utility.echo("averageSalaryForSales: " + Utility.divide(averageSalaryForSales, nSales));

	}

}
