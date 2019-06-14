import java.util.Scanner;
public class DesignerPDFViewer{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=26;
        int height[]=new int[n];
        for(int i=0;i<n;i++)
        	height[i]=scan.nextInt();
        String word=scan.next();
        int length=word.length();
        int max=0;
        for(int i=0;i<length;i++){
        	char ch=word.charAt(i);
        	max=max>height[ch-97]?max:height[ch-97];
        }
        System.out.println(max*length);
        scan.close();
    }
}