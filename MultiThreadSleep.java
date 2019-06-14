public class MultiThreadSleep {
	public static void main(String[] args) {
		new My_Thread(" 1 ");
		new My_Thread(" 2 ");
		new My_Thread(" 3 ");
		try{
			Thread.sleep(20000);
		}catch(InterruptedException ie){
			System.out.println("Main Thread Interrupted ");
		}
		System.out.println("Main Thread Exiting...");
	}
}
