import java.util.*;
public class LibraryFine{
      public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int actualReturnDay=scan.nextInt();
      int actualReturnMonth=scan.nextInt();
      int actualReturnYear=scan.nextInt();
      int expectedReturnDay=scan.nextInt();
      int expectedReturnMonth=scan.nextInt();
      int expectedReturnYear=scan.nextInt();
      int fine=0;
      if(actualReturnYear<expectedReturnYear){
        fine=0;
      }
      else{
    	  if(expectedReturnMonth==actualReturnMonth){
            if(actualReturnDay>expectedReturnDay){
            fine=(15*(actualReturnDay-expectedReturnDay));
            }
          }
          if(expectedReturnYear==actualReturnYear){
            if(actualReturnMonth>expectedReturnMonth){
            fine=(500*(actualReturnMonth-expectedReturnMonth));
            }
          }
          if(actualReturnYear>expectedReturnYear){
          fine = 10000;
          }
      }
      System.out.println(fine);
      scan.close();
    }
}