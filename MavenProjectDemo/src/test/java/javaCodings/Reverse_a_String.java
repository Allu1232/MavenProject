package javaCodings;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		
		String s="Automation";
		String org=s.toLowerCase();
		String r="";
	
		
		for(int i=org.length()-1; i>=0; i--) {
			char ch=org.charAt(i);
			r+=ch;
			
		}
		System.out.println(r);
		}}





/*	StringBuffer sbf=new StringBuffer(s);
	sbf.reverse();
	System.out.println(sbf);
	
		}*/
 /* StringBuilder a=new StringBuilder();
  a.append(s);
  a.reverse();
  System.out.println(a);*/
