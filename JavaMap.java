import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
public class JavaMap {
	public static void main(String[] args) throws NumberFormatException,IOException{
		HashMap<String,Long>phoneDirectory=new HashMap<String,Long>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        while(n-->0){
	       String name=br.readLine();
	       long mobnum=Long.parseLong(br.readLine());
	       phoneDirectory.put(name, mobnum);
	    }
        Iterator it = phoneDirectory.entrySet().iterator();
                /*while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
            }*/
           String s=null;
           s=br.readLine();
           while(s!=null){
        	   if(phoneDirectory.containsKey(s)){
        		   System.out.println(s+"="+phoneDirectory.get(s));
        	   }else{
        		   System.out.println("Not found");
        	   }
        	   s=br.readLine();
           }
        }

}
