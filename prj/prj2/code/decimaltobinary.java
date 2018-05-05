package project;

import java.util.Scanner;

public class decimaltobinary {

  //  private static Scanner in;

//	public static void main(String[] args) {
//        int number;
//
//       // in = new Scanner(System.in);
//
//        System.out.println("Enter a positive integer");
//        number = in.nextInt();
//
//        if (number < 0) {
//            System.out.println("please enter a positive integer");
//        } else {
//
//            System.out.print("Your number in Binary is:");
//            //System.out.print(binaryform(number));
//            printBinaryform(number);
//        }
//    }

    public void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return; // KICK OUT OF THE RECURSION
        }

        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}