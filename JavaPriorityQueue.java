import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Student1{
   private int token;
   private String fname;
   private double cgpa;
   public Student1(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}
class Comparator1 implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2){
		if(s1.getCgpa()>s2.getCgpa())
			return -1;
		else if(s1.getCgpa()<s2.getCgpa())
			return 1;
		else if(s1.getCgpa()==s2.getCgpa()&&s1.getFname()!=s2.getFname())
			return s1.getFname().compareTo(s2.getFname());
		else{
			if(s1.getToken()>s2.getToken())
				return -1;
			else 
				return 1;
			}
	}
}
public class JavaPriorityQueue{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      PriorityQueue<Student1> pq=new PriorityQueue<Student1>(15,new Comparator1());
      int totalEvents = Integer.parseInt(in.nextLine());
      while(totalEvents-->0){
         String event = in.next();
         if(event.equals("ENTER")){
        	 String name=in.next();
        	 double cgpa=in.nextDouble();
        	 int token=in.nextInt();
        	 Student1 s1=new Student1(token,name,cgpa);
        	 pq.offer(s1);
        	 s1=null;
         }   
         else if(event.equals("SERVED")){
        	 pq.poll();
         }
      }
      Iterator<Student1> itr=pq.iterator();
      if(itr.hasNext()==false)
    	  System.out.println("EMPTY");
      else{
    	  while(itr.hasNext()){
    		  Student1 s=pq.poll();
    	      System.out.println(s.getFname());
    	  }
      }
      in.close();
    }
}
