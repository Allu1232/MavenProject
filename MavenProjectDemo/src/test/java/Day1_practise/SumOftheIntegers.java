package Day1_practise;

public class SumOftheIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int []a= {2,5,1,9,6};
    
   
  
   /*int sum=0;
    for(int i=0; i<a.length; i++) {
    //	System.out.println(a[i]);
    	
    //sum+=a[i];
    	
   // }
   // System.out.println(sum);
	}*/

    
    //print max number and integer 
    
    int max=a[0];
    for(int i=0; i<a.length; i++) {
    	if(a[i]>max) {
    	
    	max=a[i];
    	
    	
    	}
    	
    	}
    System.out.println(max);
    }
    
}
