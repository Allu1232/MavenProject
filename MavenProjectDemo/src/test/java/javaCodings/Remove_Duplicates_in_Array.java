package javaCodings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> uniqueNumbers= new HashSet<>();
     Integer[] numbers= {1, 2, 3, 2,5,1,6,3,7};
     
     for(int num:numbers) {
    	 if(!uniqueNumbers.contains(num)) {
    		 uniqueNumbers.add(num);
    		 System.out.print(num+", ");
    	 }
     }
     
     }
	
	}


