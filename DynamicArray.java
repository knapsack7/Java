import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DynamicArray{
	public static void main(String[] args) {
	List<ArrayList<Integer>> seqList=new ArrayList<ArrayList<Integer>>();
	Scanner sc=new Scanner(System.in);
    int lastAns=0;
	int N,Q;
	N=sc.nextInt();
	Q=sc.nextInt();
	for(int i=0;i<N;i++){
        seqList.add(new ArrayList<Integer>());
    }
	while(Q-->0){
		int typequery,x,y;
		typequery=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		ArrayList<Integer> seq=seqList.get((x^lastAns) % N);
		if(typequery==1){
			seq.add(y);
		}
		else if(typequery==2){
			lastAns=seq.get(y%seq.size());
            System.out.println(lastAns);
		}
	}
	sc.close();
	}
}
