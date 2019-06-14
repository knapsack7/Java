import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class PalindromicGame {
	public static void main(String[] args) throws NumberFormatException,IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T=Integer.parseInt(br.readLine());
	Map<Character,Integer> map_A=new HashMap<Character,Integer>();
	Map<Character,Integer> map_B=new HashMap<Character,Integer>();
	  while(T-->0){
		String a=br.readLine();
		String b=br.readLine();
		for(int i=0;i<a.length();i++){
			if(map_A.containsKey(a.charAt(i))){
				int value=map_A.get(a.charAt(i));
				map_A.put(a.charAt(i),value+1);
			}
			else
				map_A.put(a.charAt(i),1);
	    }
		for(int i=0;i<b.length();i++){
			if(map_B.containsKey(b.charAt(i))){
				int value=map_B.get(b.charAt(i));
				map_B.put(b.charAt(i),value+1);
			}
			else
				map_B.put(b.charAt(i),1);
	    }
		Set<Character> key_A=map_A.keySet();
	    Set<Character> key_B=map_B.keySet();
	    if(key_A.containsAll(key_B)&&key_A.size()==key_B.size())
	    	System.out.println("B");
	    else if(key_A.containsAll(key_B)&&key_A.size()>key_B.size())
	    	System.out.println("A");
	    else {
	    	key_A.removeAll(key_B);
	    	Set<?> c=map_A.entrySet();
	    	Iterator<?> itr=c.iterator();
	    	boolean is_there_any=false;
	    	while(itr.hasNext()){
	    	   Map.Entry<Character, Integer> map=(Map.Entry<Character, Integer>)itr.next();
	    	   if(map.getValue()>=2){
	    		is_there_any=true;   
	    		System.out.println("A");
	    		break;
	    		}
	    	}
	    	if(!is_there_any)
	    	System.out.println("B");
	    }
	    map_A.clear();
		map_B.clear();
	  }
	}
 }	
