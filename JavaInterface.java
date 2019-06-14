import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface AdvancedArithmetic{
  public abstract int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=1;i<=n;++i){
            if(n%i==0){
                nums.add(i);
            }
        }
        int total=0;
        for(int iter:nums){
            total += iter;
        }
        return total;
    }
}
class JavaInterface{
    public static void main(String []args){
        MyCalculator my_calculator=new MyCalculator();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        System.out.print(my_calculator.divisorSum(n)+"\n");
        sc.close();
    }
    static void ImplementedInterfaceNames(Object o)
    {
    Class<?>[] theInterfaces=o.getClass().getInterfaces();
        for(int i=0;i<theInterfaces.length;i++){
            String interfaceName=theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}