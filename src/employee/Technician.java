package employee;

import javax.swing.JOptionPane;

import utilities.Utility;

public class Technician extends Employee {

	// Member variables. 

	// Constructor. 
	public Technician(String firstName, String lastName, String gender, String title, int grade,
			double salary, double bonus) {
		
		super("TEC_", firstName, lastName, gender, title, grade, salary, bonus);
	
		employeeList.add(this);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Add code here
		
		Technician technician = (Technician)employee;
		
		// Ask for the new values. 
		String s = JOptionPane.showInputDialog("Enter new first name for the employee " + technician.getEmpID() + "!");	
		Utility.echo(s);
		technician.setFirstName(s); 

		
		// update the existing technician
		
		
		
//		for (Employee t : employeeList) {
//			t.print(); 
//		}		

		
	}

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

}
