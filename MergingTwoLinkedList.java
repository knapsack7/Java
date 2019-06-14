import java.util.*;
/*program for Merging two Sorted LinkedList*/
class MergingTwoLinkedList{
	static LinkedList<Integer> ans=new LinkedList<Integer>();
	public static LinkedList<Integer> mergingFunction(LinkedList<Integer> l1,LinkedList<Integer> l2){
		if(l1.isEmpty()&&l2.isEmpty())
			return ans;
		if(l1.isEmpty()){
			ans.add(l2.poll());
			mergingFunction(l1,l2);
		}
		else if(l2.isEmpty()){
			ans.add(l1.poll());
			mergingFunction(l1,l2);
		}
		else if(l1.getFirst()<=l2.getFirst()){
			ans.add(l1.poll());
			mergingFunction(l1,l2);
		}
		else{
			ans.add(l2.poll());
			mergingFunction(l1,l2);
		}
		return ans;	
	}
	public static void main(String[] args){
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(1);
		list1.add(7);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(3);
		list2.add(4);
		list1=mergingFunction(list1,list2);
		System.out.println(list1);
	}
}
