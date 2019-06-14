import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class AGoodSet{
	static int size;
	static int[] selection=new int[500];
	static ArrayList<Integer> list1;
	static ArrayList<Integer> list2;
	static int[][] checkingarr=new int[100][100];
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<500;i++)
			selection[i]=i+1;
		while(T-->0){
		list1=new ArrayList<Integer>();
		list2=new ArrayList<Integer>();
		size=Integer.parseInt(br.readLine());	
		for(int i=0;list1.size()!=size;i++){
			if(selection[i]==1||selection[i]==2){
				list1.add(selection[i]);
				list2.add(selection[i]);
				}
			else{
				list1.add(selection[i]);
				list2.add(selection[i]);
				checkingarr(selection[i]);
			}
		}
		for(int i:list1)
			System.out.print(i+" ");
		}
	}
	static void checkingarr(int temp){
		for(int i=0;i<list1.size();i++){
	        for(int j=0;j<list2.size();j++){
	        	checkingarr[i][j]=list1.get(i)+list2.get(j);
	        }
		}

		boolean check=true;
		for(int i=0;i<checkingarr.length;i++){
	        for(int j=0;j<checkingarr.length;j++){
	        	if(checkingarr[i][j]==temp){
	        		list1.remove(list1.size()-1);
	        		list2.remove(list2.size()-1);
	        		check=false;
	        		break;
	        	}
	        }
	        if(!check)
        		break;
		}
	}
}
