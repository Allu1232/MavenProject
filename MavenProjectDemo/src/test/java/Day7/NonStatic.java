package Day7;

public class NonStatic {
    int i=10;
	public static void main(String[] args) {
 System.out.println(new NonStatic().i);
 System.out.println(new NonStatic().i=200);
 System.out.println(new NonStatic().i);
 
	}

}
