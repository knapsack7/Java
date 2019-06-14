class Thread1 implements Runnable{
	public void run(){
			int i;
			for(i=0;i<5;i++)
				System.out.print(i*3+" ");
	}
}
class Thread2 implements Runnable{
	public void run(){
			int i;
			for(i=0;i<5;i++)
				System.out.print(i*4+" ");
	}
}
public class MyThread {
    public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread t3=new Thread(t1);
		Thread t4=new Thread(t2);
		t3.start();
		t4.start();
	}

}
