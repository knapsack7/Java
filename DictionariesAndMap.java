import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DictionariesAndMap{
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
 
        Map<String,Long> myMap = new HashMap<String,Long>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            Long phone = in.nextLong();
            myMap.put(name,phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            if(myMap.get(s)!=null){
                System.out.println(s+"="+myMap.get(s));
            } else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}