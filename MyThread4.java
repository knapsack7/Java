class My_Thread implements Runnable{
	String name="";
	Thread t;
	My_Thread(String name){
		this.name=name;
		t=new Thread(this,name);
		System.out.println("New Thread "+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+":"+i);
				Thread.sleep(10000);
			}
		}catch(InterruptedException e){
			System.out.println(name+" Interrupted");
		}
		System.out.println(name+" exiting");
		}
} 
public class MyThread4 {
	public static void main(String[] args) {
		My_Thread t1=new My_Thread(" 1 ");
		My_Thread t2=new My_Thread(" 2 ");
		System.out.println("Thread 1 is Alive: "+t1.t.isAlive());
		System.out.println("Thread 2 is Alive: "+t2.t.isAlive());
		try{
			System.out.println("Waiting for Thread to finish");
			t1.t.join();
			t2.t.join();
		}catch(InterruptedException ie){
			System.out.println("Main Thread Interrupted ");
		}
		System.out.println("Thread 1 is Alive: "+t1.t.isAlive());
		System.out.println("Thread 2 is Alive: "+t2.t.isAlive());
		System.out.println("Main Thread Exiting...");
	}
}
