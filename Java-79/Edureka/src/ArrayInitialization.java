public class ArrayInitialization {

	public static void main(String[] args) {
		//int[] marks = {92,87,96,73,84,90};
		int[] marks = new int[]{92,87,96,73,84,90};
		
		System.out.println("No of Subjects = " + marks.length);
		
		//array iteration using a normal for loop 
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		System.out.print("Marks Obtained   :  ");
		//array iteration using enhanced for loop (for..each loop)
		for(int mark : marks)
		{
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
