
public class Learning{
	private int add(int a,int b){
		return a+b;
	}
	private int add(int a,int b,int c){
		return a+b+c;
	}
	private int add(int a,int b,int c,int d){
		return a+b+c+d;
	}
    public static void main(String[] args) {
    System.out.println(new Learning().add(2,3));
    System.out.println(new Learning().add(2,3,4));
    System.out.println(new Learning().add(2,3,4,5));
    }
}

