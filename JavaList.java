import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class JavaList{
	public static void main(String[] args) throws NumberFormatException,IOException{
		LinkedList<Integer>list=new LinkedList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine());
	    String s[]=br.readLine().split(" ");
	    for(int i=0;i<n;i++){
	    	list.add(Integer.parseInt(s[i]));
	    }
	    int m=Integer.parseInt(br.readLine());
	    while(m-->0){
		    String command=br.readLine();
		    if(command.compareTo("Insert")==0){
		    	String s1[]=br.readLine().split(" ");
		    	int pos=Integer.parseInt(s1[0]);
			    int value=Integer.parseInt(s1[1]);
		    	list.add(pos,value);
		    }
		    if(command.compareTo("Delete")==0){
		    	int pos=Integer.parseInt(br.readLine());
		    	list.remove(pos);
		    }
	    }
	    for(int i=0;i<list.size();i++)
	    System.out.print(list.get(i)+" ");
	}
}

