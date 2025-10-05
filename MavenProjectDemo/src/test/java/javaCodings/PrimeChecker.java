
package javaCodings;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=5;
    boolean isPrime=true;
    
    if(num<=1) {
    	isPrime=false;
    }
    else {
    	for(int i=2; i<=Math.sqrt(num); i++) {
    		if(num %i==0) {
    			isPrime=false;
    			break;
    		}
    	}
    }System.out.println(num+ "isPrime : "+isPrime);
	}

}
