import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	int marks;
	String fname;
	Student(int id,int marks,String fname){
		this.id=id;
		this.marks=marks;
		this.fname=fname;
	}
}
class MyComparat implements Comparator<Object>{
	public int compare(Object obj1,Object obj2){
		Student st1=(Student)obj1;
		Student st2=(Student)obj2;
		if(st1.marks<st2.marks)return -1;
		else if(st1.marks==st2.marks){
			if(st1.id<st2.id)return -1;
			else if(st1.id==st2.id){
				return (st1.fname).compareTo(st2.fname);
			}
			else
				return +1;
		}
		else
			return +1;
	}
}
public class CustomizedSorting {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		ArrayList<Student>stList=new ArrayList<Student>();
		while(n-->0){
			String s[]=br.readLine().split(" ");
			int id=Integer.parseInt(s[0]);
			int marks=Integer.parseInt(s[1]);
			String fname=s[2];
			Student st=new Student(id,marks,fname);
			stList.add(st);
			
		}
		for(int i=0;i<stList.size();i++){
			Student st=stList.get(i);
			System.out.println(st.id+" "+st.fname+" "+st.marks);
		}
		System.out.println("=================================Customized Sorting==================================");
		Collections.sort(stList,new MyComparat());
		
		for(int i=0;i<stList.size();i++){
			Student st=stList.get(i);
			System.out.println(st.marks+" "+st.id+" "+st.fname);
		}
	}

}
