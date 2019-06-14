import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
class Sorted implements Comparator<Integer>{
	public int compare(Integer num1,Integer num2){
		int a=num1,b=num2;
		if(a>b)
			return -1;
		else
			return 1;
	}
}
public class GreedyCandidates{
	public static void main(String[] args)throws NumberFormatException,IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int T=Integer.parseInt(br.readLine());
      Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
      while(T-->0){
    	String[] s=br.readLine().split(" ");
    	int N=Integer.parseInt(s[0]);
    	int M=Integer.parseInt(s[1]);
    	int line=M;
    	int[] minSalary=new int[N];
    	s=br.readLine().split(" ");
    	for(int i=0;i<N;i++)
    		minSalary[i]=Integer.parseInt(s[i]);
    	while(line-->0){
    		s=br.readLine().split(" ");
    	    map.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
    	Collection<Integer> k1=map.values();
    	Object[] karr1=new Object[M];
    	karr1=k1.toArray();
    	line=N;
    	int no_stu=0,no_company=0;
    	long tot_salary=0;
    	int j=0;
    	while(line-->0){
    		String s2=br.readLine();
    		Set<?> s1=map.entrySet();
    		Iterator<?> itr1=s1.iterator();
    		SortedSet<Integer> sortset=new TreeSet<Integer>(new Sorted());
     		for(int i=0;i<M;i++){
     		   Map.Entry<Integer,Integer> m1=(Map.Entry<Integer, Integer>)itr1.next();
      		   if(s2.charAt(i)=='1'){
         			sortset.add(m1.getKey());
         		}
         	}
     		for(Integer i:sortset){
    	    	itr1=s1.iterator();
    	    	while(itr1.hasNext()){
    	    	  Map.Entry<Integer,Integer> m1=(Map.Entry<Integer, Integer>)itr1.next();
    	    	  if(i>=minSalary[j]&&(Integer)m1.getValue()>0){
    	    		int val=(int)m1.getValue();
    	    		m1.setValue(val-1);
    	    		no_stu++;
    	    		tot_salary+=(int)m1.getKey();
    	    		break;
    	    	  }
    	    	}
    	    	break;
    	    }
    	j++;
    	}
    	Collection<Integer> k2=map.values();
    	Object[] karr2=new Object[M];
    	karr2=k2.toArray();
    	for(int i=0;i<M;i++){
    		if(karr1[i].equals(karr2[i])==true)
    			no_company++;
    	}
    	System.out.println(no_stu+" "+tot_salary+" "+no_company);
    	}
    }
}