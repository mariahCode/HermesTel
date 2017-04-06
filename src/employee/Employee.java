package employee;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.print.PrinterJob.JobStatus;
import utilities.*;


abstract public class Employee {

	// Member variables.
	private String empID; // TODO ex: "Scr001" (TODO must override. how to?)
	private String firstName;
	private String lastName;
	private GenderType gender; // TODO enum
	private String title; // TODO enum

	private String profission;
	private static String typeOfEmployee = "";// TODO enum (REPresentative.
												// HeadOfSection.
	// HOOffice)
	private GradeType grade; // TODO enum (1, 2, 3)

	private double salary ;
	private double bonus;

	// TODO should be private?
	static public ArrayList<Employee> employeeList = new ArrayList<>();

	// Getters and setters.
	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// we maked this enum
	public GenderType getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("MALE")) {
			this.gender = GenderType.MALE;
		}
		else if (gender.equalsIgnoreCase("FEMALE")) {
			this.gender = GenderType.FEMALE;
		}
		else if (gender.equalsIgnoreCase("UNKNOWN")) {
			this.gender = GenderType.UNKNOWN;
		}	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// we maked this enum
	public GradeType getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		
		if (grade.equalsIgnoreCase("REP")) {
			this.grade = GradeType.REP;
		}
		else if (grade.equalsIgnoreCase("HOS")) {
			this.grade = GradeType.HOS;
		}
		else if (grade.equalsIgnoreCase("HOD")) {
			this.grade = GradeType.HOD;
		}	
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public abstract void setBonus();

	// Class variables.
	private static int nEmployees = 1;

	// Constructor. also // we maked this enum
		public Employee(String shortTitle, String firstName, String lastName, String gender, String title,
				String grade, double salary) {

		super();
		this.empID = shortTitle + nEmployees++;
		this.firstName = firstName;
		this.lastName = lastName;
		setGender(gender);
		this.title = title;
		setGrade(grade);
		this.salary = salary;
		this.setBonus();
	}

	// Methods.
	
	
//public void addEmployee(String firstName, String lastName, GenderType gender, String title, GradeType grade, double salary,
//		double bonus) {
//	
//		String employeeType = JOptionPane.showInputDialog("Enter the employee type (SalesPerson/Secretary/Technician)");
//		String firstName = JOptionPane.showInputDialog("Enter first name for the new employee");
//		GenderType gender = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN)");
//		String title = JOptionPane.showInputDialog("Enter title  for the new employee");
//		GradeType grade = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) ");
//		 double salary = JOptionPane.showInputDialog("Enter new Salary for the employee");
//		 double bonus = JOptionPane.showInputDialog(message);
//		if (employeeType.equals("SalesPerson")) {
//			SalesPerson e3 = new SalesPerson("Almothana", "Aboush", GenderType.MALE, "HOD", GradeType.HOD, 10000.00, 10000.00);
//		}
//		if (employeeType.equals("Secretary")) {
//			SalesPerson e3 = new SalesPerson("Almothana", "Aboush", GenderType.MALE, "HOD", GradeType.HOD, 10000.00, 10000.00);
//		}
//		if (employeeType.equals("Technician")) {
//			SalesPerson e3 = new SalesPerson("Almothana", "Aboush", GenderType.MALE, "HOD", GradeType.HOD, 10000.00, 10000.00);
//		}
//}

	// TODO Fix: The empolyee is not removed from the child listArray.  
	static public void removeEmployee(String empID) {

		for (Employee employee : employeeList) {

			if (employee.empID.equals(empID)) {

				if (employee instanceof SalesPerson) {
					typeOfEmployee = "Sales";
					SalesPerson.salesPersonList.remove(empID);
				} else if (employee instanceof Secretary) {
					typeOfEmployee = "Secretary";
					Secretary.secretaryList.remove(empID);
				} else if (employee instanceof Technician) {
					typeOfEmployee = "Technician";;
					Technician.technicianList.remove(empID);
				}
				employeeList.remove(employee);

				break;
			}
		}
	}

	@Override
	// TODO Fix the employee type. Always empty. 
	public String toString() {
		 return ("The " + Employee.typeOfEmployee + "/ " + this.getEmpID() + "/ "
		+ this.getFirstName() + "/ " + this.getLastName() + "/ "

		+ this.getGender() + "/ " + this.getGrade() + "/ " + this.getSalary() + "/ "
		+ this.getBonus());
	}

//	public static Employee updateEmployee(String empID) {
//		updateEmployee(getEmployeeByID(empID));
//		for (Employee employee : employeeList) {
//			if (employee.empID.equals(empID)) {
//				if (employee instanceof Technician) {
//					typeOfEmployee = "Technician";
//				} else if (employee instanceof SalesPerson) {
//
//					typeOfEmployee = "Sales";
//				} else if (employee instanceof Secretary) {
//
//					typeOfEmployee = "Secretary";
//				}
//
////				System.out.println(employee);
////				
////				
////				// TODO Info message: This employee was removed.
////				System.out.println("The Employee" + "/ " + employee.getEmpID() + "/ " + employee.getFirstName() + "/ "
////						+ employee.getLastName() + "/ " + employee.getGender() + "/ "+ employee.getTitle()+"/ "+ employee.getGrade() + "/ "
////						+ employee.getSalary() + "/ " + employee.getBonus() + "/ " + " Was moved to" + " "
////						+ Employee.typeOfEmployee);
////				System.out.println("-----------------------------------------------------------------------------------------------");
//				break;
//			}
//		}
//	}
//
//	abstract public void updateEmployee();

	// TODO Does this update the child lists also? 
	// TODO Fix the gender, grade. And the employee type.
	public void updateEmployee() {
		
		// Ask for the new values.
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + this.getEmpID() + "!" );
		if (s == null)
			System.exit(0);
		this.setFirstName(s);
//		System.out.println("The First name :");
//		Utility.echo(s);
//		System.out.println(":::::::::::::::::::::");

		String s1 = JOptionPane.showInputDialog("Enter new last name for the employee " + this.getEmpID() + "!");
		if (s1 == null)
			System.exit(0);
		this.setLastName(s1);
//		System.out.println("The last name :");
//		Utility.echo(s1);
//		System.out.println(":::::::::::::::::::::");
		
		String s3 = JOptionPane.showInputDialog("Enter new gender for the employee (MALE/FEMALE/UNKNOWN) " + this.getEmpID() + "!");
		if (s3 == null)
			System.exit(0);	
		
//		System.out.println("The gender :");
//		Utility.echo(s3);
//		System.out.println(":::::::::::::::::::::");
		
		String s4 = JOptionPane.showInputDialog("Enter new title for the employee " + this.getEmpID() + "!");
		if (s4 == null)
			System.exit(0);
		this.setTitle(s4);
//		System.out.println("The title :");
//		System.out.println(this.getTitle());
//		System.out.println(":::::::::::::::::::::");
		
		String s5 = JOptionPane.showInputDialog("Enter new grade for the employee (REP/HOS/HOD) " + this.getEmpID() + "!");
		if (s5 == null)
			System.exit(0);
		
//		System.out.println("The grade :");
//		Utility.echo(s5);
//		System.out.println(":::::::::::::::::::::");
		
		String s6 = JOptionPane.showInputDialog("Enter new Salary for the employee " + this.getEmpID() + "!");
		if (s6 == null)
			System.exit(0);
		this.setSalary(Double.parseDouble(s6));
//		System.out.println("The Salary :");
//		Utility.echo(s6);
//		System.out.println(":::::::::::::::::::::");
//		
//		System.out.println("The bouns :");
//		System.out.println(this.getBonus());
//		System.out.println(":::::::::::::::::::::");

	}

	
	
	// maria test
	abstract public String mariaTest(Employee employee);

	// Polymorphism example.
	abstract public double calculateBonus(Employee employee);

	// TODO MH remove one row below?
	// abstract public void calculateTotalSalaryPerProfession(Employee
	// employee);
	// abstract public double calculateAverageSalaryPerProfession();

	// Trying to move this
	// public double averageSalary() {
	//
	// echo(empID);
	//
	// double totalSalary = 0.00;
	// for (Employee employee : employeeList) {
	// echo("totalSalary: " + totalSalary);
	// totalSalary += employee.getSalary();
	// }
	// return divide(totalSalary, employeeList.size());
	// }

	// Employee employeeToUpdate, String firstName, String lastName, String
	// gender, String title, int grade, double salary, double bonus) {

	// employeeToUpdate.setBonus(20.00);
	// employeeToUpdate.setFirstName(firstName);
	// aso

	public static Employee getEmployeeByID(String empID) {

		for (Employee employee : employeeList) {
			if (employee.empID.equals(empID)) {
				return employee;
			}
		}
		return null;

		// Loop through the array of all employees, regardless of type.
		// Where ID is the same. Get that instance.
	}

	// public void removeEmployee() {
	//
	// }
	//
	// public calculateSalary()
	// calculateBonus()

//	public String getDepartement() {
//		return profession;
//	}
//
//	public void setDepartement(String departement) {
//		this.profession = departement;
//	}

}
