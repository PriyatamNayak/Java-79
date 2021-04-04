
public class Employee {
	int empno;
	String ename;
	float sal;

	void setDetails() {
		ename = "Praveen";
		sal = 5000f;
	}

	void displayDetails() {
		System.out.println(empno + " | " + ename + " | " + sal);
	}

	public static void main(String[] args) {
		// create an instance (or) object of Employee
		Employee emp = new Employee();

		System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal);

		emp.displayDetails();

		// to change the state of object using reference
		emp.empno = 101;
		emp.ename = "Sunil";
		emp.sal = 2500f;
		emp.displayDetails();

		// to change the state of object using method
		emp.setDetails();
		emp.displayDetails();
	}
}
