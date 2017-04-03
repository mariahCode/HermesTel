package employee;

public class Sales extends Employee {

	// Member variables. 
//	private String empID; // TODO enum? ex of values: dev site, sales office, customer/call/admin center

	// Constructor. 
	public Sales(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("SAL_", firstName, lastName, gender, title, grade, salary, bonus);
		
		employeeList.add(this);

	}
	
	// Methods. 
	// TODO Add specific method. 
	@Override
	public void updateEmployee() {
		// TODO Add code here
	}

}
