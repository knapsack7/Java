import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class StudentRecord implements Comparator<StudentRecord>{
   private int id;
   private String fname;
   private double cgpa;
   public StudentRecord(){}
   public StudentRecord(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   public int compare(StudentRecord stu1,StudentRecord stu2){
		double a=stu1.cgpa,b=stu2.cgpa;
		String s1=stu1.fname,s2=stu2.fname;
		int id1=stu1.id,id2=stu2.id;
		if(a>b)
			return -1;
		else if(a<b)
			return 1;
		else if(a==b)
			return s1.compareTo(s2);
		else{
			if(id1>id2)
				return -1;
			else 
				return 1;
		}
    }
}
public class JavaSort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      List<StudentRecord> studentList = new ArrayList<StudentRecord>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         StudentRecord st = new StudentRecord(id, fname, cgpa);
         studentList.add(st);
         testCases--;
      }
      in.close();
      Collections.sort(studentList,new StudentRecord());
      for(StudentRecord st: studentList){
         System.out.println(st.getFname());
      }
   }
}
