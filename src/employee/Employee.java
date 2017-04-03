package employee;

import java.util.ArrayList;

abstract public class Employee {
	
	// Member variables. 
	private String empID; // TODO ex: "Scr001" (TODO must override. how to?)
	private String firstName;
	private String lastName;	
	private String gender; // TODO enum
	private String title; // TODO enum
	private String departement; // TODO enum (REPresentative. HeadOfSection. HOOffice)
	private int grade; // TODO enum (1, 2, 3)
	
	private double salary = 50000.00; 
	private double bonus = 5000.00;

	// TODO should be private?
	public ArrayList<Employee> employeeList = new ArrayList<>();

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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
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


	
	// Constructor. 
	public Employee(String shortTitle, String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		super();
		this.empID = shortTitle + nEmployees++; // TODO: Add this to all sub classes. 
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.title = title;
		this.grade = grade;
		this.salary = salary;
		this.bonus = bonus;
//		employeeList = new ArrayList<Employee>();
//		employeeList.add(new OpenAccount());

	}
	
	// Methods. 
//	public void addEmployee() {
//		
//	}
//

//	public void updateEmployee(String empID) {
//		// Ask for new values for all the attributes. like first name aso. 
//		Employee employeeToUpdate = getEmployee(empID);
//		
//	}

	abstract public void updateEmployee();
	//Employee employeeToUpdate, String firstName, String lastName, String gender, String title, int grade, double salary, double bonus) {
	
	//	employeeToUpdate.setBonus(20.00);
		//employeeToUpdate.setFirstName(firstName);
		// aso

	

//	public Employee getEmployee(String empID) {
//		
//		Employee employee = new Employee();
//		// Loop through the array of all employees, regardless of type. 
//		// Where ID is the same. Get that instance. 
//		return employee; 
//	}
	


	//	public void removeEmployee() {
//		
//	}
//	
//	public calculateSalary()
//	calculateBonus()
	
	
	
}
