class PrintA extends Thread{
	public void run(){
		System.out.print("a");
	}
}
class PrintB extends Thread{
	public void run(){
		try{
			Thread.sleep(2000);
			System.out.print("b");
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}
class PrintC extends Thread{
	public void run(){
		System.out.print("c");
	}
}
public class MyThread3 {
    public static void main(String[] args) {
    	PrintA t1=new PrintA();
    	PrintB t2=new PrintB();
    	PrintC t3=new PrintC();
    	t1.start();
    	t2.start();
    	t3.start();
    	}
}
