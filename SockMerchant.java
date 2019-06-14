package collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class SockMerchant{
static void printFreq(int arr[]){
HashMap<Integer,Integer>hmap=new  HashMap<Integer,Integer>();
for(int i=0;i<arr.length;i++){
   Integer c=hmap.get(arr[i]);
   if(hmap.get(arr[i])==null)
   hmap.put(arr[i],1);
   else
   hmap.put(arr[i],++c);}
int total=0;
for(Map.Entry m:hmap.entrySet()){
          int fre=(Integer)m.getValue();
          total=total+(fre/2);}
System.out.println(total);}
public static void main(String[]args)throws NumberFormatException,IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
int n=Integer.parseInt(br.readLine());
int arr[]=new int[n];
String s[]=br.readLine().split(" ");
for(int i=0;i<n;i++)
	arr[i]=Integer.parseInt(s[i]);
printFreq(arr);
}
}




