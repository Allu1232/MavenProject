package Java_Practise;

public class java_coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	boolean isPrime=true;
		int n=20;
		
		
	if(n<=1) {
		isPrime=false;
	}
	else {
   for(int i=2; i<=Math.sqrt(n); i++) {
	   if(n%i==0) {
		   isPrime=false;
		   break;
	   }
   }
	} System.out.println(n + "isPrime number :"+ isPrime);*/
		
		
		
		/* int[] arr= {1, 2, 3, 4};
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.println("index"+ i+"is:"+arr[i]);
		 }
		
		int[] numbers= {5, 20, 50,20};
		int max=numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		
		System.out.println("max no is:"+max);*/
		
		
		
		
	/*	int n1=5;
		int fact1=1;
			 for(int i=1; i<=n1; i++) {
				 
				 fact1*=i;
			 System.out.print(fact1+ " ");
			
		}
		
		
		String str="banana"; 
		String org=str.toLowerCase();
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--) {
			rev+=org.charAt(i);
		
		}
		if(rev.equals(org)) {
			System.out.println(str+" given str is a palindrome");}
			else {
				System.out.println(str+" given str is not a palindrome");
			}
		
		
		
		
		String string="banana"; 
		String org1=str.toLowerCase();
		String revers="";
		
		for(int i=org1.length()-1; i>=0; i--) {
			revers+=org.charAt(i);
		
		}
		System.out.println(revers);*/
		
		
		
		String s="My name is Siva";
		String a[]=s.split(" ");
		String rev="";
		
	for(int i=0; i<a.length; i++) {
		for(int j=a[i].length()-1; j>=0; j-- ) {
			rev+=a[i].charAt(j);
		}
		rev+=" ";}
			
	System.out.println(rev);
	
	
	
	
	
	String str2="Automation";
	str2=str2.toLowerCase();
	int[] count=new int[256];
	for(int i=0; i<str2.length(); i++) {
		count[str2.charAt(i)]++;}
	for(int i=0; i<256; i++) {
		if(count[i]>0) {
			System.out.println((char)i+ ": "+ count[i]);
		}
		
	}
	}
		
		
		
		
		
		
		
		
		
		
	
		
		
}