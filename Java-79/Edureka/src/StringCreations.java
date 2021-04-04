
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1 == s2);
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4);
		
		String s5 = new String("edureka");
		System.out.println(s1 == s5);
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.contentEquals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		s1.concat(" Limited");
		//s1 = s1.concat(" Limited");
		System.out.println(s1);	
		
	}
}
