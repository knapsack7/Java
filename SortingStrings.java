import java.util.Arrays;
import java.util.Comparator;

class MyStringComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		if(s1.compareTo(s2)<0)
			return -1;
		else if(s1.compareTo(s2)>0)
			return 1;
		else
			return 0;
	}
}
public class SortingStrings {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String[] s={"Austraila","India","Nepal","America","Britain"};
	Arrays.sort(s,new MyStringComparator());
    for(String i:s)
    	System.out.println(i);
	}

}
