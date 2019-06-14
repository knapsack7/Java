import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class VariableLength2dArray {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=3;
//		int a[][]=new int[3][];
//		for(int i=0;i<n;i++){
//			String s[]=br.readLine().split(" ");
//			a[i]=new int[s.length];
//			for(int j=0;j<s.length;j++){
//				a[i][j]=Integer.parseInt(s[j]);
//			}
//		}
//		for(int i=0;i<n;i++){
//			for(int j=0;j<a[i].length;j++){
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		ArrayList< ArrayList<Integer> >list=new ArrayList< ArrayList<Integer> >();
		while(n-->0){
			ArrayList<Integer>alist=new ArrayList<Integer>();
			String s[]=br.readLine().split(" ");
			for(int i=0;i<s.length;i++){
				alist.add(Integer.parseInt(s[i]));
			}
			list.add(alist);
		}
		
			ArrayList<Integer>alist=new ArrayList<Integer>();
			alist=list.get(2-1);
			
			System.out.println(alist.get(3-1));
		
	}

}
