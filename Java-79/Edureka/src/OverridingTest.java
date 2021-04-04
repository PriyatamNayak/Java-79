class A1{
	int a = 10;
	int b = 20;
	
	void display() {
		System.out.println("Inside class A1 : "+ a + " | "+b);		
	}
}

class B1 extends A1{
	int a = 30;
	int b = 40;
	
	@Override //annotation - to provide meta data
	void display() {
		System.out.println("Inside class B1 : "+ super.a+" | "+super.b+" | "+this.a+" | "+this.b);
		super.display();
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();
		
		A1 a1Obj = new A1();
		a1Obj.display();
	}

}
