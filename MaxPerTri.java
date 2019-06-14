import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Triplet{
    int x;
    int y;
    int z;
    Triplet(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
   
}
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Triplet tr1=(Triplet)obj1;
        Triplet tr2=(Triplet)obj2;
        if(sum(tr1)>sum(tr2))return -1;
        else if(sum(tr1)<sum(tr2))return +1;
        else{
            if(max(tr1)>max(tr2))return -1;
            else if(max(tr1)<max(tr2))return +1;
            else{
                if(min(tr1)>min(tr2))return -1;
                else if(min(tr1)<min(tr2))return +1;
                else return -1;
            }
        }
       
    }
    public static int sum(Triplet tr){
        int a=tr.x;
        int b=tr.y;
        int c=tr.z;
        return a+b+c;
    }
    public static int max(Triplet tr){
        int a=tr.x;
        int b=tr.y;
        int c=tr.z;
        if(a>=b&&a>=c)return a;
        else if(b>=a && b>=c)return b;
        else return c;
    }
    public static int min(Triplet tr){
        int a=tr.x;
        int b=tr.y;
        int c=tr.z;
        if(a<=b&&a<=c)return a;
        else if(b<=a && b<=c)return b;
        else return c;
    }
}


public class TriangleTriplet {
   
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        String s[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        ArrayList<Triplet>alist=new ArrayList<Triplet>();
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(isValidTriplet(a[i],a[j],a[k])){
                        alist.add(new Triplet(a[i],a[j],a[k]));
                    }
                }
            }
        }
//        for(int i=0;i<alist.size();i++){
//            Triplet tr=alist.get(i);
//            System.out.println(tr.x+" "+tr.y+" "+tr.z);
//        }
        Collections.sort(alist,new MyComparator());
//        System.out.println();
//        for(int i=0;i<alist.size();i++){
//            Triplet tr=alist.get(i);
//            System.out.println(tr.x+" "+tr.y+" "+tr.z);
//        }
       
        if(alist.size()==0){
            System.out.println(-1);
        }else{
            Triplet t=alist.get(0);
            ArrayList<Integer>list=new ArrayList<Integer>();
            list.add(t.x);
            list.add(t.y);
            list.add(t.z);
            Collections.sort(list);
            System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(2));
        }
       
    }
    public static boolean isValidTriplet(int x,int y,int z){
        if((x+y)>z && (x+z)>y && (z+y)>x){
            return true;
        }else{
            return false;
        }
    }
}