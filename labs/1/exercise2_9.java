import java.util.Scanner;
 
public class exercise2_9 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        //Prompt user for v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
         
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
         
        //calculate average acceleration and display answer
        double avgAcceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is: " + avgAcceleration);
         
 
    }
 
}