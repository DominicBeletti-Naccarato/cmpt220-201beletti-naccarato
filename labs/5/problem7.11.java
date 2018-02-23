import java.util.Scanner;

public class problem7_11 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in); 
		// Create an array of lentgh 10
		double[] numbers = new double[10]; 

		// Prommpt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		// Displays the mean and standard deviation
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}


	public static double deviation(double[] x) {
		double deviation = 0;
		double mean = mean(x);
		for (double e: x) {
			deviation += Math.pow(e - mean, 2);
		}
		return Math.sqrt(deviation / (x.length - 1));
	}

	
	public static double mean(double[] x) {
		double mean = 0;
		for (double e: x) {
			mean += e;
		}
		return mean / x.length;
	}
}