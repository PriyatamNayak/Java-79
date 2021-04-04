class Employee
{
  int empno;
  String ename;
  float sal;

  Employee(){
    System.out.println("*****");
    empno = 101;
    ename = "Sunil";
    sal = 2500f;
  }

  void displayDetails(){
    System.out.println(empno + " | "+ ename + " | " + sal);
  }
}

class ConstructorTest 
{
	public static void main(String[] args) 
	{
	  Employee emp1 = new Employee();
	  Employee emp2 = new Employee();
	  Employee emp3 = new Employee();

	  emp1.displayDetails();
	  emp2.displayDetails();
	  emp3.displayDetails();
	}
}

