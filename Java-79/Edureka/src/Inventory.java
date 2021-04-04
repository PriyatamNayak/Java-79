
public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		prod.setProductId(1001);
		prod.setProductName("Keyboard");
		prod.setProductPrice(350f);
		
		System.out.println(prod.getClass().getName());
		System.out.println(prod.hashCode());
		System.out.println(Integer.toHexString(prod.hashCode()));
		System.out.println(prod); //toString()	
		
		Product prod1 = new Product(1002,"Monitor",7500.5f);
		System.out.println(prod1);
	}
}
