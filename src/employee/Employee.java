package employee;

import java.util.ArrayList;

import utilities.GenderType;
import utilities.GradeType;
import utilities.Utility;

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

	private double salary = 50000.00;
	private double bonus = 5000.00;


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

	// we maked this enum
	public void setGender(GenderType gender) {
		this.gender = gender;
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

	// we maked this enum
	public void setGrade(GradeType grade) {
		this.grade = grade;
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

	// Class variables.
	private static int nEmployees = 1;

	// Constructor. also // we maked this enum
	public Employee(String shortTitle, String firstName, String lastName, GenderType gender, String title,
			GradeType grade, double salary, double bonus) {

		super();
		this.empID = shortTitle + nEmployees++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.title = title;
		this.grade = grade;
		this.salary = salary;
		this.bonus = bonus;
	}

	// Methods.

	static public void removeEmployee(String empID) {

		for (Employee employee : employeeList) {

			if (employee.empID.equals(empID)) {

				if (employee instanceof Technician) {
					typeOfEmployee = "Technician";
				} else if (employee instanceof SalesPerson) {

					typeOfEmployee = "Sales";
				} else if (employee instanceof Secretary) {

					typeOfEmployee = "Secretary";
				}
				employeeList.remove(employee);

				// TODO Info message: This employee was removed.
				System.out.println("The Employee from " + Employee.typeOfEmployee + "/ " + employee.getEmpID() + "/ "
						+ employee.getFirstName() + "/ " + employee.getLastName() + "/ "

						+ employee.getGender() + "/ " + employee.getGrade() + "/ " + employee.getSalary() + "/ "
						+ employee.getBonus() + "/ " + " Was removed ");
				break;
			}
		}
	}

	public void updateEmployee(String empID) {
		updateEmployee(getEmployeeByID(empID));
		for (Employee employee : employeeList) {
			if (employee.empID.equals(empID)) {
				if (employee instanceof Technician) {
					typeOfEmployee = "Technician";
				} else if (employee instanceof SalesPerson) {

					typeOfEmployee = "Sales";
				} else if (employee instanceof Secretary) {

					typeOfEmployee = "Secretary";
				}

				// TODO Info message: This employee was removed.
				System.out.println("The Employee" + "/ " + employee.getEmpID() + "/ " + employee.getFirstName() + "/ "
						+ employee.getLastName() + "/ " + employee.getGender() + "/ "+ employee.getTitle()+"/ "+ employee.getGrade() + "/ "
						+ employee.getSalary() + "/ " + employee.getBonus() + "/ " + " Was moved to" + " "
						+ Employee.typeOfEmployee);
				System.out.println(
						"-----------------------------------------------------------------------------------------------");
				break;
			}
		}
	}

	abstract public void updateEmployee(Employee employee);

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

	public Employee getEmployeeByID(String empID) {

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
