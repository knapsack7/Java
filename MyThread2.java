class Num1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
			System.out.print(i*5+" ");
	}
}
class Num2 extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
			System.out.print(i*3+" ");
	}
}
class Num3 extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
			System.out.print(i*7+" ");
	}
}
public class MyThread2 {
    public static void main(String[] args) {
    	Num1 t1=new Num1();
    	Num2 t2=new Num2();
    	Num3 t3=new Num3();
    	t1.start();
    	t2.start();
    	t3.start();
    	}
}
