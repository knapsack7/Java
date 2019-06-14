import java.util.*;
import java.math.BigInteger;
public class JavaPrimalityTest{
      public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      System.out.println(n.isProbablePrime(15) ? "prime" : "not prime");
      in.close();
   }
}