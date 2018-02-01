import java.util.Scanner;

public class Problem2_7 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//promt the user
		System.out.print("enter the number of minutes: ");
		long minutes = input.nextLong();
		
		//claculate 
		long years = minutes / (365 * 24 * 60);
		long days = minutes % (365 * 24 * 60) / (24 * 60);
		
		//out put the result 
		System.out.println(minutes + " minutes is approximatly " + years + " years and " + days + " days ");
		
	}

}
