package javaCodings;

public class Count_Character_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="Automation";
   str=str.toLowerCase();
   
    int[] count=new int[256];
    
    for(int i=0; i<str.length(); i++) {
    	
    	count[str.charAt(i)]++;
    }
    for(int i=0; i<256; i++) {
    	if(count[i]>0) {
    		
    		System.out.println((char)i+": "+ count[i]);   		
    	}
    }
	}

}
