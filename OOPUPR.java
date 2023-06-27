package Algoritmi;

import java.util.Scanner;

public class OOPUPR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.print("Input digit (0-9):");
        byte digit = scan.nextByte();
        switch(digit) {
        case 0: System.out.println("Your digit is zero"); break;
        case 1: System.out.println("Your digit is one"); break;
        case 2: System.out.println("Your digit is two"); break;
        case 3: System.out.println("Your digit is three"); break;
        case 4: System.out.println("Your digit is four"); break;
        case 5: System.out.println("Your digit is five"); break;
        case 6: System.out.println("Your digit is six"); break;
        case 7: System.out.println("Your digit is seven"); break;
        case 8: System.out.println("Your digit is eight"); break;
        case 9: System.out.println("Your digit is nine"); break;
        default: System.out.println("Input digit (0,1,2,3,4,5,6,7,8,9)"); break;
        }
    }
 
}
