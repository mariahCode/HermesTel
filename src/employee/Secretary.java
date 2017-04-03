package employee;

import javax.swing.JOptionPane;

public class Secretary extends Employee {

	// Member variables. 
//	private String empID; // TODO enum? ex of values: dev site, sales office, customer/call/admin center
	
	// Constructor. 
	public Secretary(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("SEC_", firstName, lastName, gender, title, grade, salary, bonus);
		
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
		echo(s);

	}

    public void echo(String s) {
    	System.out.println(s);
	}

	
}
