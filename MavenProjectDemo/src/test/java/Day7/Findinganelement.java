package Day7;

public class Findinganelement {

	public static void main(String[] args) {
    int a[]	= {10, 20, 30,40};
    int Search_Element=60;
    boolean Status=false;
     /* for(int i=0; i<a.length; i++) {
    	  if(a[i]==Search_Element) {
    		  System.out.println("Element found");
    		  Status=true;
    	  }
    	  /*else {
    		  System.out.println("Element not found");
    	  }*/
    	 
    for(int x:a) {
  	  if(x==Search_Element) {
  		  System.out.println("Element found");
  		  Status=true;
  		  break;
  	  }}
      
        if(Status==false)
		  System.out.println("Element not found");
	  
	}

}
