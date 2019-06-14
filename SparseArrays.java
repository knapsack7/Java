import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SparseArrays {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	Map<String,Integer> map=new HashMap<String,Integer>();
	while(N-->0){
		String s=sc.next();
		if(map.containsKey(s)){
			Integer temp=map.get(s);
			map.put(s,temp+1);
		}
		else
			map.put(s,1);
	}
	int Q=sc.nextInt();
	while(Q-->0){
		String s=sc.next();
		if(map.containsKey(s)){
			System.out.println(map.get(s));
		}
		else
			System.out.println("0");
	}
	sc.close();
  }
}
