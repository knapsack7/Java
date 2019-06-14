import java.util.Scanner;
public class MissingNumber{
	public static int normalApproach(int[] a){
		int sum=(a.length+1)*(a.length+2)/2;//Finding sum upto n numbers
		for(int i=0;i<a.length;i++)
			sum-=a[i];
		return sum;//after subtracting all elements from the array we are left with missing number
	}
    public static int efficientApproach(int[] a){
    	int a1=a[0];
    	for(int i=1;i<a.length;i++)
    		a1^=a[i];//taking XOR of all elements of array
    	int a2=1;
    	for(int i=2;i<=a.length+1;i++)
    		a2^=i;//taking XOR of all first N integers
    	return (a1^a2);//it returns missing number
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={1,2,3,4,6,7,8};
		System.out.println("Enter 1 for finding the missing number using first method and 2 using second method");
		int way=sc.nextInt();
		if(way==1)
			System.out.println(normalApproach(arr));
		else if(way==2)
			System.out.println(efficientApproach(arr));
		else
			System.out.println("Wrong Input..Application is terminating");
        sc.close();   
	}
}
