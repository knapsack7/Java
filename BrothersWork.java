import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BrothersWork{
    static class CarPartDetails{
        String id;
        int yom;
        String m;
        int qm;
       }
    static CarPartDetails cpd[][][]=new CarPartDetails[6][6][10];
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n-->0){
            String s[]=br.readLine().split(" ");
            String id=s[0];
            int yom=Integer.parseInt(s[1]);
            String m=s[2];
            int qm=Integer.parseInt(s[3]);
            int i=id.charAt(0)-'A';
            int j=id.charAt(1)-'A';
            int k=Character.getNumericValue(id.charAt(2));
            cpd[i][j][k]=new CarPartDetails();
            cpd[i][j][k].id=id;
            cpd[i][j][k].yom=yom;
            cpd[i][j][k].m=m;
            cpd[i][j][k].qm=qm;
        }
        System.out.println("Enter id whose details are required:");
        String s=br.readLine();
        int i=s.charAt(0)-'A';
        int j=s.charAt(1)-'A';
        int k=Character.getNumericValue(s.charAt(2));
        System.out.println(cpd[i][j][k].id+" "+cpd[i][j][k].yom+" "+cpd[i][j][k].m+" "+cpd[i][j][k].qm);
       }
}