
public class TowerOfHanoi {

	/**
	 * Program to find right sets of steps to solve Tower Of Hanoi Problem
	 */
	public static void towerOfHanoi(int n,char source,char destination,char auxiliary){
		if(n==1){
			System.out.println("Move from "+source+" to "+destination);
			return;
		}
		towerOfHanoi(n-1,source,auxiliary,destination);
		System.out.println("Move from "+source+" to "+destination);
		towerOfHanoi(n-1,auxiliary,destination,source);
	}
	public static void main(String[] args) {
	towerOfHanoi(4,'A','C','B');	
	}

}
