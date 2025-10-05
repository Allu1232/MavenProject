package Day7;

public class FindNumberof_Repeations {

	public static void main(String[] args) {
    int a[]= {1,2,3,4,2,4,2,};
    int num=2;
    int count=0;
    for(int value:a) {
    	if(value==num) {
    		count++;
    	}
    	
    }
    System.out.println(count);
	}

}
