import java.util.Scanner;
public class MaxSqsubMat{
	public static int Min(int a,int b,int c){
		int min1=Math.min(a,b);
		int min2=Math.min(b,c);
		return Math.min(min1, min2);
	}
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the rows and columns of matrix:");
	int rows=scan.nextInt();
	int columns=scan.nextInt();
	int[][] matrix=new int[rows][columns]; 
	System.out.println("Enter matrix elements");
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
			matrix[i][j]=scan.nextInt();
		}
	}
	int[][] table=new int[rows][columns];
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
	        if(i==0||j==0)
	        	table[i][j]=matrix[i][j];
	        else if(matrix[i][j]==0)
     	       table[i][j]=matrix[i][j];
             else
     	       table[i][j]=Min(table[i-1][j-1],table[i-1][j],table[i][j-1])+1;
	        }
	}
	int max=table[0][0];
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
			if(table[i][j]>max)
				max=table[i][j];
			System.out.print(table[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(max);
	scan.close();
	}
}
