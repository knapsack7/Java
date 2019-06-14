import java.math.BigInteger;
import java.util.Scanner;
public class ExtraLongFactorials{
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        BigInteger factorial=BigInteger.valueOf(num);
        for (int i=(num-1);i>0;i--){
            factorial = factorial.multiply((BigInteger.valueOf(i)));
        }
        System.out.println(factorial);
        in.close();
    }
}