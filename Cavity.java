import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Cavity {
      public static void main(String[] args) throws NumberFormatException,IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  int n=Integer.parseInt(br.readLine());
	  char[][] matrix=new char[n][n];
	  for(int i=0;i<n;i++){
		  String s=br.readLine();
		  for(int j=0;j<n;j++){
			  matrix[i][j]=s.charAt(j);
		  }
	  }
	  if(n>2){
		  for(int i=1;i<n-1;i++){
			  for(int j=1;j<n-1;j++){
				  if(((Character.getNumericValue(matrix[i][j-1])<Character.getNumericValue(matrix[i][j]))&&(Character.getNumericValue(matrix[i][j+1])<Character.getNumericValue(matrix[i][j])))&&(Character.getNumericValue(matrix[i-1][j])<Character.getNumericValue(matrix[i][j]))&&(Character.getNumericValue(matrix[i+1][j])<Character.getNumericValue(matrix[i][j]))){
					  matrix[i][j]='X';
				  }
			   }
		  }
	  }
	  for(int i=0;i<n;i++){
		  for(int j=0;j<n;j++){
			  System.out.print(matrix[i][j]);
		  }
	  System.out.println();
	  }
	 }
}

