package testCases;

public class java_Code_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=10;
         int a=0;
         int b=1;
         
         System.out.print("fibonassi numbers for"+n+"terms"+a+" "+b+" ");
         for(int i=2; i<=n; i++) {
        	 int c=a+b;
        	 a=b;
        	 b=c;
        	 System.out.print("fibonassi numbers for"+n+"terms"+a+" "+b+" ");
         }
	}

}
