import java.util.Scanner;

public class exercise2_5 {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter a subtotal and Gratuity: ");
		double subtotal = input.nextInt();
		double gratuityRate = input.nextInt();

		//calculate Gratuity 
		double gratuity =subtotal * (gratuityRate/100); // JA
		//add gratuity to subtotal to create total cost
		double total = gratuity + subtotal;
		
		//Output answer
		System.out.println("The Gratuity is $" + gratuity + " and total is $" + total);

	}

}