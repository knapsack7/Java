package Collections;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
private int age;
private int salary;
class Employee(String name,int age,int salary){
       super();
       this.name = name;
       this.age = age;
       this.salary = salary;
       }
public String getname(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public int getAge(){
	return age;
}
public void setAge(int age){
	this.age = age;
}
public int getSalary(){
	return salary;
}
public int setSalary(int salary){
	this.salary = salary;
}
public String toString(){
	return "Employee [Name= " + name + "Age= "+ age + "Salary= " + salary +"]";
}
public class HashMapuser{
	public static void main(String[] args) throws IOException,NumberFormatException{
	HashMap<Integer,Employee> hashmap=new HashMap<Integer,Employee>();
	Employee Ramesh=new Employee("Ramesh",32,40000);
	Employee Suresh=new Employee("Suresh",35,43000);
	Employee Mahesh=new Employee("Mahesh",39,47000);
	hashmap.put(20,Ramesh);
	hashmap.put(10,Suresh);
	hashmap.put(20,Mahesh);
	System.out.println("hashmap:"+hashmap+"\n");
    Set<Map.Entry<Integer,Employee>> set=hashmap.entrySet();
	System.out.println("set"+set+"\n");
    System.out.println("---------------");
    System.out.println("Key"+"|"+"Values");
    System.out.println("---------------");
    for(Map.Entry<Integer,Employee> entry:set){
    	int empId=entry.getKey();
    	Employee employee=entry.getValue();
    	}
}
}