import java.util.*;
public class AppendAndDelete{
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String t=in.next();
        int k=in.nextInt();
        if(s.length()+t.length()<=k)
            {
            System.out.println("Yes");
            System.exit(0);
        }
        if(k%2==0&&(s.length()-t.length())%2 !=0)
        {
            System.out.println("No");
            System.exit(0);
        }
        int point=k-k/2+(Math.abs(s.length()-t.length()))/2;
        if(s.length()>t.length())
           {
            String str=s.substring(0,s.length()-point);
            if(str.equals(t.substring(0,s.length()-point)))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
        {
             String str=t.substring(0,t.length()-point);
            if(str.equals(s.substring(0,t.length()-point)))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
       in.close();        
    }
        }