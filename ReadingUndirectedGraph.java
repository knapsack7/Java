public class ReadingUndirectedGraph{
	private static boolean adjMatrix[][];
    private static int vertexCount;
	public ReadingUndirectedGraph(int vertexCount){
	    this.vertexCount=vertexCount;
	    adjMatrix=new boolean[vertexCount][vertexCount];
	}
	public static void addEdge(int i,int j){
		if(i>=0 && i<vertexCount && j>0 && j<vertexCount){
			adjMatrix[i][j]=true;
			adjMatrix[j][i]=true;
		}
	}
	public static void removeEdge(int i,int j){
		if(i>=0 && i<vertexCount && j>0 && j<vertexCount){
			adjMatrix[i][j]=false;
			adjMatrix[j][i]=false;
			}
	}
	public static boolean isEdge(int i,int j){
		if(i>=0 && i<vertexCount && j>0 && j<vertexCount)
			return adjMatrix[i][j];
		else
			return false;
	}
	public static void main(String[] args){
		int num=4;
		ReadingUndirectedGraph A=new ReadingUndirectedGraph(num);
		addEdge(1,2);
		addEdge(1,4);
		addEdge(2,3);
		addEdge(2,4);
		addEdge(2,1);
		System.out.println(isEdge(2,1));
	}
}