import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GridSearch{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		String[] sg=br.readLine().split(" ");
		int R=Integer.parseInt(sg[0]);
		int C=Integer.parseInt(sg[1]);
		int[][] sp1=new int[R][C];
		for(int i=0;i<R;i++){
			String s=br.readLine();
			for(int j=0;j<C;j++){
				sp1[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
			}
		}
		//for(String s2:sg1)
			//System.out.println(s2);
		String[] sp=br.readLine().split(" ");
		int r=Integer.parseInt(sp[0]);
		int c=Integer.parseInt(sp[1]);
		int[][] sg1=new int[r][c];
		for(int i=0;i<r;i++){
			String s=br.readLine();
			for(int j=0;j<c;j++){
				sg1[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
			}
		}
		boolean exist=false;
		int flag=0,row1=0,row2=0,col1=0,col2=0;
		for(int i=0;i<R-r;i++){
			for(int j=0;j<C-c;j++){
				if(((sp1[i][j]==sg1[0][0])&&(sp1[i+r-1][j]==sg1[0+r-1][0])&&(sp1[i][j+c-1]==sg1[0][0+c-1])&&(sp1[i+r-1][j+c-1]==sg1[0+r-1][0+c-1]))){
					flag=1;
					exist=true;
					row1=i;row2=i+r-1;col1=j;col2=j+c-1;
					break;
				}
			}
			if(exist)
			break;
		}
		if(flag==1){
			for(int i=row1,l=0;i<row2;i++,l++){
			   for(int j=col1,k=0;j<col2;j++,k++){
				if(sp1[i][j]!=sg1[l][k]){
				  exist=false;
				  break;
				}
			}
		}
		}
		if(exist)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
	}
}