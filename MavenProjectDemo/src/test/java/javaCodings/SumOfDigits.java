package javaCodings;

public class SumOfDigits {

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number=12345;
        int sum=0;
     
         while(number>0) {
    	 sum+=number%10;  //Add last digit to sum(reminder)
    	 number/=10;
         }
         System.out.println(sum);
	     }
         }
       
