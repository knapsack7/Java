import java.util.HashSet;

public class FirstRepeatingElement {
	public int find(int [] arrA){
		int index = -1;
		HashSet<Integer> hs = new HashSet<>();
		for(int i = arrA.length-1;i>=0;i--){
			if(hs.contains(arrA[i])){
				index = i;
			}else{
				hs.add(arrA[i]);
			}
		}
		return arrA[index];
	}
	public static void main(String args[]){
		int [] a = {3,2,1,2,2,3};
		FirstRepeatingElement f = new FirstRepeatingElement();
		for(int j:a)
			System.out.print(j+" ");
		System.out.println();
		System.out.println("first repeated element by index is : " + f.find(a));
	}
}
