package javaCodings;

import java.util.Scanner;

public class Reversing_Each_word {

	public static void main(String[] args) {
  
		String s="Welcome to India";
   String a[]=s.split(" ");
   String rev="";
   
   for (int i=0; i<a.length; i++) {
	   for(int j=a[i].length()-1; j>=0; j--) {
		   rev+=a[i].charAt(j);
		   }
	   rev+=" ";
	   
	   }System.out.println(rev);
   }

}







//Scanner sc=new Scanner(System.in);
//System.out.println("Enter a word");
//String s=sc.nextLine();
