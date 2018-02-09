import java.util.Scanner;

public class exercise2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user for input
		
		System.out.print("Enter a celsius degree: ");
		int celsius = input.nextInt();
		double fahenheit = ((9.0/5.0) * celsius + 32); // Find fahrenheit
		
		System.out.println(celsius + " Celsius is " + fahenheit + " Fahenheit");

	}

}