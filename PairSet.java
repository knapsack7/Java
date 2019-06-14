package Collections;
import java.util.ArrayList;
class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class PairSet {
  public static void main(String args[]){
        //Simple ArrayList to insert ints
        ArrayList<Integer>alist=new ArrayList<Integer>();//the <Integer> on both sides tells that arraylist is going to contain ints
        alist.add(2);
        alist.add(3);
        alist.add(1);
        alist.add(6);
        //to print elements of an arraylist
        for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i));
        }
       
        //Now apply same logic to arraylist of pairs
        ArrayList<Pair>plist=new ArrayList<Pair>();
        //let us say we need to isert 4 pairs then
        for(int i=0;i<4;i++){
            //in each loop create a pair object and insert it into the plist
            Pair p=new Pair(i,i+1);
            plist.add(p);
        }
       
        //to print the elements of plist
        for(int i=0;i<plist.size();i++){
            //first of all get the pair and store it in a pair object
            Pair p=plist.get(i);
            System.out.println(p.x+" "+p.y);
        }
    }
}