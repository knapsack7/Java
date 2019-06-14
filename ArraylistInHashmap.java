package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
public class ArraylistInHashmap {
	public static void main(String[] args) throws IOException,NumberFormatException{
		List<String> Fruits=new ArrayList<String>();
		Fruits.add("MANGO");
		Fruits.add("APPLE");
		List<String> Vegetables=new ArrayList<String>();
		Vegetables.add("LADY'S FINGER");
		Vegetables.add("POTATO");
		Vegetables.add("CARROT");
		List<String> Bikes=new ArrayList<String>();
		Bikes.add("APACHE");
		Bikes.add("SPLENDOR");
		Bikes.add("PASSIONPRO");
		HashMap<Integer,List<String>> combine=new HashMap<Integer,List<String>>();
		combine.put(1,Fruits);
		combine.put(2,Vegetables);
		combine.put(3,Bikes);
		System.out.println(combine);
		System.out.println("Key And corresponding Multiple Values are as follows:");
		System.out.println("Key:  "+ "Values:");
		Set<Map.Entry<Integer,List<String>>> entries=combine.entrySet();
		for(Map.Entry<Integer, List<String>> entry:entries){
			System.out.println(entry.getKey()+" | "+ entry.getValue());
		}
		}
}
