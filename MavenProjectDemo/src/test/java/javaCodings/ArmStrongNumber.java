package javaCodings;
import java.util.Scanner;
public class ArmStrongNumber {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int originalNumber = number;
	        int sum = 0;

	        while(number>0) {
	        	
	            int digit = number % 10;
	            sum += (digit*digit*digit);
	            number /= 10;
	        }

	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	    }}
	
