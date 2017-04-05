package employee;

import javax.swing.JOptionPane;

import utilities.GenderType;
import utilities.GradeType;
import utilities.Utility;

public class Technician extends Employee {

	// Member variables. 

	// Class variables. 
	static public double averageSalaryForTechnician; // Make private 
	public static int nTechnician = 0;

	// Constructor. 
	public Technician(String firstName, String lastName, GenderType gender, String title, GradeType grade, double salary,
			double bonus) {
		
		super("TEC_", firstName, lastName, gender, title, grade, salary, bonus);
	
		nTechnician++; 

		employeeList.add(this);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Add code here
		
		Technician technician = (Technician)employee;
		
		// Ask for the new values. 

		
		
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + technician.getEmpID() + "!");
		technician.setFirstName(s);
		System.out.println("The First name :");
//		Utility.echo(s);
		System.out.println(":::::::::::::::::::::");

		String s1 = JOptionPane.showInputDialog("Enter new last name for the employee " + technician.getEmpID() + "!");
		technician.setLastName(s1);
		System.out.println("The last name :");
//		Utility.echo(s1);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s1);
		
		String s3 = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN) " + technician.getEmpID() + "!");
		
		if (s3.equalsIgnoreCase("male")){
			technician.setGender(GenderType.MALE);
		}
		else if (s3.equalsIgnoreCase("female")){
			technician.setGender(GenderType.FEMALE);
		}
		else if (s3.equalsIgnoreCase("unknown")){
			technician.setGender(GenderType.UNKNOWN);
		}
	
		
		System.out.println("The gender :");
//		Utility.echo(s3);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s3);
		
		String s4 = JOptionPane.showInputDialog("Enter new title for the employee " + technician.getEmpID() + "!");
		technician.setTitle(s4);
		System.out.println("The title :");
//		Utility.echo(s4);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s4);
		
		String s5 = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) " + technician.getEmpID() + "!");
		if (s5.equalsIgnoreCase("REP")){
			technician.setGrade(GradeType.REP);
		}
		else if (s5.equalsIgnoreCase("HOS")){
			technician.setGrade(GradeType.HOS);
		}
		else if (s5.equalsIgnoreCase("HOD")){
			technician.setGrade(GradeType.HOD);
		}
		
		System.out.println("The grade :");
//		Utility.echo(s5);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s5);
		
		
		String s6 = JOptionPane.showInputDialog("Enter new grade for the employee " + technician.getEmpID() + "!");
		
		technician.setSalary(Double.parseDouble(s6));
		System.out.println("The Salary :");
//		Utility.echo(s6);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s6);
		
		String s7 = JOptionPane.showInputDialog("Enter new grade for the employee " + technician.getEmpID() + "!");
		technician.setBonus(Double.parseDouble(s7));
		System.out.println("The bouns :");
//		Utility.echo(s7);
		System.out.println(":::::::::::::::::::::");
//		Utility.echo(s7);
	}
		
		// update the existing technician
		
		
		
//		for (Employee t : employeeList) {
//			t.print(); 
//		}		

		
	

	// Methods. 
	// TODO Add specific method. 

	@Override
	public String mariaTest(Employee employee) {

		Technician technician = (Technician)employee;
		
		Utility.echo("Technician");
		return ""; 

	}

	@Override
	public double calculateBonus(Employee employee) {

		Technician technician = (Technician)employee;
		
		Utility.echo("Technician");
				
		return 3000.00; 

	}
	
	// TODO MH Remove?	
//	@Override
//	public void calculateTotalSalaryPerProfession(Employee employee) {
//
//		averageSalaryForTechnician += employee.getSalary(); 
//		Utility.echo("" + employee.getSalary());
//	}	

	// TODO MH Remove?	
//	@Override
//	public static void calculateAverageSalaryPerProfession() {
//
//		Utility.echo("" + averageSalaryForTechnician);
//		Utility.echo("" + nTechnician);
//
//		Utility.echo("averageSalaryForTechnician: " + Utility.divide(averageSalaryForTechnician, nTechnician));
//				
//	}	

}
