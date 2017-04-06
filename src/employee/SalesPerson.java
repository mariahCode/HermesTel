package employee;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import utilities.GenderType;
import utilities.GradeType;
import utilities.Utility;

public class SalesPerson extends Employee {

	// Member variables.
	@Override
	public void setBonus() {
		if (getGrade() == GradeType.REP){
			super.setBonus(2500);
		}
		else if (getGrade() == GradeType.HOS){
			super.setBonus(5000);
		}
		else if (getGrade() == GradeType.HOD){
			super.setBonus(8000);
		}
	}
	
	// Class variables.
	static public double averageSalaryForSales; // Make private
	public static int nSales = 0;
	static public ArrayList<SalesPerson> salesPersonList = new ArrayList<>();

	// Constructor.
	public SalesPerson(String firstName, String lastName, String gender, String title, String grade, double salary) {
//		public SalesPerson(String firstName, String lastName, GenderType gender, String title, GradeType grade, double salary,
//				double bonus) {
				
		super("SAL_", firstName, lastName, gender, title, grade, salary);

		nSales++;

		employeeList.add(this);
		salesPersonList.add(this);

	}

	// Methods.
	// TODO Add specific method.
//	@Override
////	public void updateEmployee() {
//		
//		// Ask for the new values.
//		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + this.getEmpID() + "!" );
//		if (s == null)
//			System.exit(0);
//		this.setFirstName(s);
//		System.out.println("The First name :");
//		Utility.echo(s);
//		System.out.println(":::::::::::::::::::::");
//
//		String s1 = JOptionPane.showInputDialog("Enter new last name for the employee " + this.getEmpID() + "!");
//		if (s1 == null)
//			System.exit(0);
//		this.setLastName(s1);
//		System.out.println("The last name :");
//		Utility.echo(s1);
//		System.out.println(":::::::::::::::::::::");
//		
//		String s3 = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN) " + this.getEmpID() + "!");
//		if (s3 == null)
//			System.exit(0);	
//		
//		System.out.println("The gender :");
//		Utility.echo(s3);
//		System.out.println(":::::::::::::::::::::");
//		
//		String s4 = JOptionPane.showInputDialog("Enter new title for the employee " + this.getEmpID() + "!");
//		if (s4 == null)
//			System.exit(0);
//		this.setTitle(s4);
//		System.out.println("The title :");
//		System.out.println(this.getTitle());
//		System.out.println(":::::::::::::::::::::");
//		
//		String s5 = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) " + this.getEmpID() + "!");
//		if (s5 == null)
//			System.exit(0);
//		
//		System.out.println("The grade :");
//		Utility.echo(s5);
//		System.out.println(":::::::::::::::::::::");
//		
//		String s6 = JOptionPane.showInputDialog("Enter new Salary for the employee " + this.getEmpID() + "!");
//		if (s6 == null)
//			System.exit(0);
//		this.setSalary(Double.parseDouble(s6));
//		System.out.println("The Salary :");
//		Utility.echo(s6);
//		System.out.println(":::::::::::::::::::::");
//		
//		System.out.println("The bouns :");
//		System.out.println(this.getBonus());
//		System.out.println(":::::::::::::::::::::");
//
//	}

	
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
