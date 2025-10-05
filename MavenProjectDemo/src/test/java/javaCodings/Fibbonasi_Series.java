package javaCodings;

public class Fibbonasi_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=10;
    int a=0, b=1;
    
    System.out.print(a+" "+b+ " ");
    
    for(int i=3; i<=n; i++) {
    	int nxt=a+b;
    	System.out.print(nxt+" ");
    	a=b;
    	b=nxt;
    	
    	
    }
	}

}
