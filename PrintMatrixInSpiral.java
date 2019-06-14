public class PrintMatrixInSpiral {
    static int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    public static void printMatrix(){
    	int rowStart=0,colStart=0,rowEnd=arr.length-1,colEnd=arr.length-1;
    	while(rowStart<=rowEnd&&colStart<=colEnd){
    		int i=rowStart,j=colStart;
    		for(j=colStart;j<=colEnd;j++)
    			System.out.print(arr[i][j]+" ");
    		for(i=rowStart+1,j--;i<=rowEnd;i++)
    			System.out.print(arr[i][j]+" ");
    		for(j=colEnd-1,i--;j>=colStart;j--)
    			System.out.print(arr[i][j]+" ");
    		for(i=rowEnd-1,j++;i>=rowStart+1;i--)
    			System.out.print(arr[i][j]+" ");
    		rowStart++;rowEnd--;colStart++;colEnd--;
    	}
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
    System.out.println("Intial matrix is");
    show();
    System.out.println("Printing by accessing elements in Spiral form");
    printMatrix();
    }
}
