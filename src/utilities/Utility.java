package utilities;

import javax.swing.JOptionPane;

public class Utility {

	public static int getPercentageDistribution(int part, int total) {
		return (part * 100) / total;
	}

	// Fix division calculation to result in a double. 
	public static double divide(double num, int denom) {
		return ((double) num) / ((double) denom);
	}

	public static void printQuitProgram() {
		// JOptionPane.showMessageDialog(null, "Closing the program.");  
		echo("");
		echo("--------------------------------------");
		echo("Closing the program.");
		echo("--------------------------------------");
	}

	// Makes it easier to print to the console. 
	public static void echo(String s) {
		System.out.println(s);
	}

}
