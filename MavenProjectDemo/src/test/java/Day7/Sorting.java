package Day7;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
     int a[]= {100,700,400,100,500};
     System.out.println("Before Sorting");
     System.out.println(Arrays.toString(a));  //Read Array Elements
	
	
	Arrays.sort(a);  //Sort Elements in Array
	System.out.println("After Sorting");
	System.out.println(Arrays.toString(a));
	

}}
