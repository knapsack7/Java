import java.util.Scanner;
public class GettingMatrixInSpiral {
    static int arr[][]=new int[4][4];
    public static void getMatrix(){
    	int rowStart=0,colStart=0,rowEnd=arr.length-1,colEnd=arr.length-1;
    	Scanner sc=new Scanner(System.in);
    	while(rowStart<=rowEnd&&colStart<=colEnd){
    		int i=rowStart,j=colStart;
    		for(j=colStart;j<=colEnd;j++)
    			arr[i][j]=sc.nextInt();
    		for(i=rowStart+1,j--;i<=rowEnd;i++)
    			arr[i][j]=sc.nextInt();
    		for(j=colEnd-1,i--;j>=colStart;j--)
    			arr[i][j]=sc.nextInt();
    		for(i=rowEnd-1,j++;i>=rowStart+1;i--)
    			arr[i][j]=sc.nextInt();
    		rowStart++;rowEnd--;colStart++;colEnd--;
    	}
    	sc.close();
    }
    public static void show(){
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length;j++){
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args) {
    System.out.println("Enter 4*4 matrx");
    getMatrix();
    System.out.println("Matrix in Spiral form is");
    show();
    }
}
