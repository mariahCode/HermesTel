package employee;

public class Technician extends Employee {

	// Member variables. 

	// Constructor. 
	public Technician(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("TEC_", firstName, lastName, gender, title, grade, salary, bonus);
	
		employeeList.add(this);
	}
	
	@Override
	public void updateEmployee() {
		// TODO Add code here
	}

	// Methods. 
	// TODO Add specific method. 

}
