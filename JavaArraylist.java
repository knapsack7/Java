import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class JavaArraylist {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>>list =new ArrayList<ArrayList<Integer>>();
		while(n-->0){
			ArrayList<Integer>alist=new ArrayList<Integer>();
			String s1[]=br.readLine().split(" ");
			for(int i=0;i<s1.length;i++)
				alist.add(Integer.parseInt(s1[i]));
			list.add(alist);
		}
		int m=Integer.parseInt(br.readLine());
        while(m-->0){
    	   ArrayList<Integer>alist=new ArrayList<Integer>();
    	   String s[]=br.readLine().split(" ");
    	   int p=Integer.parseInt(s[0]);
    	   int q=Integer.parseInt(s[1]);
    	   alist=list.get(p-1);
    	   if(q<=alist.get(0))
    	   System.out.println(alist.get(q));
    	   else
    	   System.out.println("ERROR!");
       }
	}

}

