import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BoatTrips{
	public static void main(String[] args) throws NumberFormatException,IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String[] s=br.readLine().split(" ");
     int trips=Integer.parseInt(s[0]);
     int capacity=Integer.parseInt(s[1]);
     int boatavailable=Integer.parseInt(s[2]);
     int[] people_pertrip=new int[trips];
     String[] s1=br.readLine().split(" ");
     int max=0;
     for(int i=0;i<trips;i++){
    	 people_pertrip[i]=Integer.parseInt(s1[i]);
    	 if(people_pertrip[i]>=max){
    		 max=people_pertrip[i];
    	 }
     }
     if(max>(capacity*boatavailable))
    	 System.out.println("No");
     else
    	 System.out.println("Yes");
     }
}