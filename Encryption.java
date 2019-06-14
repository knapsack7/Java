import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Encryption{
	public static void main(String[] args)throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char[] input_array=str.toCharArray();
		int len=input_array.length;
		int row1=(int)Math.floor(Math.sqrt(len));
		int col1=(int)Math.ceil(Math.sqrt(len));
		int row=0,col=0;
		if(row1*col1>=len){
		   row=row1;
		   col=col1;
		}
		else{
		   row=row1+1;
		   col=col1;
		}
		char[][] md_array=new char[row][col];
		int k=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(k<len){
					md_array[i][j]=input_array[k];
					k++;
				}
				else
					md_array[i][j]=' ';
					
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(md_array[i][j]);
			}
		System.out.println();
		}
		int i,j;
		for(i=0;i<col;i++){
			for(j=0;j<row;j++){
			if(md_array[j][i]!=32)
				     System.out.print(md_array[j][i]);
			if(j==row-1)
				System.out.print(" ");
			}
		}
	}
}
