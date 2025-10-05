package javaCodings;

public class Palindrome {
	public static void main(String[] args) {
String str="Madam";
   String original=str.toLowerCase();
   String reversed="";
   
   for(int i=original.length()-1; i>=0; i-- ) {
	   
	   reversed+=original.charAt(i);
   }
   
   if(reversed.equals(original)) {
	   System.out.println(str + " "+ "is a palindrome");
   }
   else {
	   System.out.println(str + " "+ "is not a palindrome");
	   System.out.println(reversed);
   }
}}
