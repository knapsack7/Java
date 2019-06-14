import java.util.Scanner;
class MyCalculator1{
    public int power( int n, int p ) throws Exception {
        if(n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)(Math.pow(n,p));
    }
}
public class JavaExceptionHandling1{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator1 M = new MyCalculator1();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
       in.close();
    }
}