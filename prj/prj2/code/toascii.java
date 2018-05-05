package project;

import java.util.Scanner;

public class toascii {


public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("What string would you like the ascii values for? ");
    String testi = scan.nextLine();
    char[] ascii1 = testi.toCharArray();

    for(char ch:ascii1){
        System.out.println((int)ch+"  ");
    }


  scan.close();
}
}
