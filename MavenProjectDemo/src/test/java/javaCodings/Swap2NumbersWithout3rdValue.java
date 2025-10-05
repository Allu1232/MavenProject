package javaCodings;

public class Swap2NumbersWithout3rdValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=30;

    System.out.println("value beforeswap a="+a+" and b="+ b );
    
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("value Afterswap a="+a+" and b="+ b );
    
	}

}
