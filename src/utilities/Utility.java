package utilities;

public class Utility {

	public static int getPercentageDistribution(int part, int total) {
		return (part * 100) / total;
	}

	// Fix division calculation to result in a double. 
	static public double divide(double num, int denom) {
		return ((double) num) / ((double) denom);
	}

	// Makes it easier to print to the console. 
	static public void echo(String s) {
		System.out.println(s);
	}

}
