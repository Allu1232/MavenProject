package javaCodings;

public class findMissingNumberInanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3,5,6,7};
		int Sum1=0;
		for(int i=0; i<a.length; i++ ) {
			Sum1+=a[i];
		}
		System.out.print(Sum1);
			
		
	 int Sum2=0;
	 
	 for(int i=1; i<=7; i++) {
		 Sum2+=i;
	 }
	 System.out.print("Sum of range of elements in array"+ Sum2);
	 System.out.print("Missing Number"+ (Sum2-Sum1));
	 }
     
}
