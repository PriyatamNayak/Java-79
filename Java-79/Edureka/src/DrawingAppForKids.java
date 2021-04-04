import java.util.Scanner;

public class DrawingAppForKids {

	public static void main(String[] args) {
		Shape sh = null;
		
		//sh = new Shape(); //compilation
		
		Scanner sc = new Scanner(System.in);
		System.out.print("select the shape [1-Rectangle | 2-Circle]: ");
		int opt = sc.nextInt();
		
		switch(opt) {
		  case 1:
			  System.out.print("enter length : ");
			  int length = sc.nextInt();
			  System.out.print("enter breadth: ");
			  int breadth = sc.nextInt();
			  
			  sh = new Rectangle("Red", length, breadth);
			  break;
		  case 2:
			  System.out.print("enter radius: ");
			  float radius = sc.nextFloat();
			  
			  sh = new Circle("Red", radius);
			  break;
		  default:
			  System.out.println("Incorrect Shape Selection... Restart Again");
			  return;
		}//switch
		
		System.out.println("Color of "+sh.getClass().getName()+" = "+ sh.getColor());
		sh.area();
	}
}
