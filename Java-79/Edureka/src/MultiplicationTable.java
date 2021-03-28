import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Which number's multiplication table: ");
		int num = sc.nextInt();
		
		printMultiplicationTable(num); //method call
	}

	private static void printMultiplicationTable(int n) {
		for(int i=1; i<=10; i++)
		{
			int p = n * i;
			System.out.println(n + " x " + i + " = " + p);
		}
	}



}
