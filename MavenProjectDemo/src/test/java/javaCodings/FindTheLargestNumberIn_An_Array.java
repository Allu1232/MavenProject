package javaCodings;

import java.util.Arrays;

public class FindTheLargestNumberIn_An_Array {

	public static void main(String[] args) {
		
		int[] numbers= {5,20,100,2000};
		
	int max= numbers[0];
		for(int i=1; i<numbers.length; i++) {
		if(numbers[i]>max) {
			max=numbers[i];
		}
		}
		System.out.println("Largest Number is:"+ max);
	}
}
		
		
		
		
		
		
	/*	int[] numbers= {5,20,100,2000};
		int min= numbers[0];
		for(int i=1; i<numbers.length; i++) {
		if(numbers[i]<min) {
			min=numbers[i];
		}
		}
		System.out.println("Smallest Number is:"+ min);
		
		Arrays.sort(numbers); 
		
		  
		//System.out.println(numbers[3]);
		}}
*/

