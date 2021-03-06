
public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(10/3); //3
		
		System.out.println(10%3); //1
		System.out.println(-10%3); //-1
		System.out.println(10%-3); //1
		System.out.println(-10%-3); //-1
		
		//System.out.println(10/0); //java.lang.ArithmeticException
		System.out.println(10.0/0); //Infinity
		System.out.println(-10.0f/0); //-Infinity
		System.out.println(0.0/0); //NaN (Not a Number)
		
		byte b1 = 12;
		byte b2 = 13;
		//byte b3 = b1 + b2;
		int b3 = b1 + b2;
		System.out.println(b3);
	}
}
