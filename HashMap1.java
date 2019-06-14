package Collections;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
public class HashMap1{
	public static void main(String[] args) throws IOException,NumberFormatException{
	HashMap<Integer,String> fruits=new HashMap<Integer,String>();
	String pvalue=fruits.put(1,"Apple");
	System.out.println("Previous value stored for key 1 is: "+pvalue);
	pvalue=fruits.put(1,"Guava");
	System.out.println("Previous value stored for key 1 is: "+pvalue);
	fruits.put(2,"Mango");
	fruits.put(3,"Banana");
	System.out.println("FRUITS: "+fruits+"\n");
	Set<Map.Entry<Integer,String>> entries=fruits.entrySet();
	System.out.println("------------------");
    System.out.println("Key:  "+ "Value:");
    System.out.println("------------------");
    for(Map.Entry<Integer,String> entry:entries){
    	System.out.println(entry.getKey()+" | "+ entry.getValue());
    }
    boolean check=fruits.isEmpty();
    System.out.println(check);
    System.out.println("------------------");
    Collection<String> names=fruits.values();
    Iterator<String> itr=names.iterator();
    while(itr.hasNext()){
    	String value=itr.next();
    	System.out.println(value);
    }
    System.out.println("------------------");
    boolean iscontains=fruits.containsValue("Apple");
    System.out.println(iscontains);
    }
}
