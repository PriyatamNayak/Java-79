
public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 10, y=20, lar = 0;
		
		lar = (x > y)? x : y;
		
		System.out.println("Largest among("+x+", "+y+") is "+lar);
	}

}
