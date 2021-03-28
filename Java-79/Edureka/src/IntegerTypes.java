
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		
		//long pop = 98458712465; //The literal 98458712465 of type int is out of range 
		long pop = 98458712465L;
		System.out.println("World Population = " + pop);
		
		//int n = 12L; //Type mismatch: cannot convert from long to int
		int n = (int) 12L;
		System.out.println(n);
	}

}
