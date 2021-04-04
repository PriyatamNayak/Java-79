class A2{
	A2(int n){		
		System.out.println("Inside A2 constructor");
	}
}

class B2 extends A2{
	public B2() {
		super(3);
		System.out.println("Inside B2 constructor");
	}	
}

public class SuperConstructors {
	public static void main(String[] args) {
		new B2();
	}
}
