package project;

import java.util.Scanner;

public class caller {

	
	public static void main(String[] args) {
		
		
		System.out.println("ceaser = 1");
		System.out.println("binary = 2");
		System.out.println("ascii = 3");
		System.out.println("type in the number that matches what you would like to do");

		
		
		
		Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			
			
			if (choice == 1) {
			
	//			keyboard = new Scanner(System.in);
			//    String password;
			    int key;

			    System.out.print("Please enter a string to be encoded: ");
			    input.nextLine();
			    String password = input.nextLine();
			    
			    do {
			        System.out.print("Please enter a shift key between 1-25: ");
			        key = input.nextInt();
			      //  input.nextLine();
			        if (key < 1 || key > 25) {
			            System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
			        }
			    } while (key < 1 || key > 25);

			    Ceaser2 ceaser2Object = new Ceaser2();
				

			    System.out.println("string:\t" + password);
			    
			    System.out.println("Encrypted:\t" + ceaser2Object.cipher(password, key));
			    System.out.println("Decrypted:\t" + ceaser2Object.cipher(ceaser2Object.cipher(password, key), -key));

			}
			
			        
			else if (choice == 2) {
				int number;

			       // in = new Scanner(System.in);

			        System.out.println("Enter a positive integer");
			        number = input.nextInt();

			        if (number < 0) {
			            System.out.println("please enter a positive integer");
			        } else {

			            System.out.print("Your number in Binary is:");
			            //System.out.print(binaryform(number));
			            
			            decimaltobinary x = new decimaltobinary();
			            
			            x.printBinaryform(number);
			        }	
						        
			}
	
			else if (choice == 3) {
			  
			    
				//Scanner input = new Scanner(System.in);
				System.out.println("What string would you like the ascii values for? ");
				input.nextLine();
			    String testi = input.nextLine();
			    char[] ascii1 = testi.toCharArray();

			    for(char ch:ascii1){
			        System.out.println((int)ch+"  ");
			    }

	}
	
}
}


