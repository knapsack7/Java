import java.util.*;
import java.util.LinkedList;
public class FindingMergePointOfTwoLinkedList{
	public static void findMergingPoint(LinkedList<Integer> l1,LinkedList<Integer> l2){
		Integer head1=l1.getFirst(),head2=l2.getFirst();
		int len1=0,len2=0,diff=0;
		ListIterator li1=l1.listIterator(),li2=l2.listIterator();
		while(li1.hasNext()){
			Integer temp=(Integer) li1.next();
			len1++;	
		}
		while(li2.hasNext()){
			Integer temp=(Integer) li2.next();
			len2++;
		}
		if(len1>len2){
			head1=l1.getFirst();
			head2=l2.getFirst();
			diff=len1-len2;
			li1=l1.listIterator();
			li2=l2.listIterator();
		}
		else{
			head1=l2.getFirst();
			head2=l1.getFirst();
			diff=len2-len1;
			li1=l2.listIterator();
			li2=l1.listIterator();
		}
		for(int i=0;i<diff;i++){
			head1=(Integer)li1.next();
		}
		while(li1.hasNext()&&li2.hasNext()){
			head1=(Integer)li1.next();
			head2=(Integer)li2.next();
			if(head1==head2){
				System.out.println("Merging Point is : "+head1);
				return;
		}
}
	}
	public static void main(String[] args){
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(7);
		l1.add(8);
		l1.add(11);
		l1.add(23);
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(3);
		l2.add(7);
		l2.add(6);
		l2.add(10);
		l2.add(8);
		l2.add(11);
		l2.add(23);
		findMergingPoint(l1,l2);
	}
}
