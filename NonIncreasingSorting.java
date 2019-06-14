import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator<Object>{
	public int compare(Object obj1,Object obj2){
		Integer a=(Integer)obj1;
		Integer b=(Integer)obj2;
		if(a>b)return -1;
		else if(a<b)return +1;
		else return 0;
	}
}
public class NonIncreasingSorting {
     public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(0);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new MyComparator());
		System.out.println(list);
	}
	
}
