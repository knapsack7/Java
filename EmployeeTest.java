public class EmployeeTest {
	public static void main(String[] args) {
	Employee empOne=new Employee("james Smith");
	Employee empTwo=new Employee("Mary Anne");}
empOne.empAge(26);
empOne.empDesignation("Senior Software Engineer");
empOne.empSalary(1000);
empOne.printEmployee();

empOne.empAge(21);
empOne.empDesignation("Software Engineer");
empOne.empSalary(500);
empOne.printEmployee();
}
}
