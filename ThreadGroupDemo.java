public class ThreadGroupDemo implements Runnable {
	public static void main(String[] args) {
		ThreadGroupDemo tg = new ThreadGroupDemo();
		tg.func();
	}
	public void func() {
		try {
			ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");
			ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");
			// create a thread
			Thread t1 = new Thread(pGroup, this);
			System.out.println("Starting " + t1.getName() + "...");
			t1.start();
			// create another thread
			Thread t2 = new Thread(cGroup, this);
			System.out.println("Starting " + t2.getName() + "...");
			t2.start();
			System.out.println("ParentThreadGroup for " + pGroup.getName()
					+ " is " + pGroup.getParent().getName());
			System.out.println("ParentThreadGroup for " + cGroup.getName()
					+ " is " + cGroup.getParent().getName());
			// block until the other threads finish
			t1.join();
			t2.join();
		} catch (InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			i++;
		}
		System.out.println(Thread.currentThread().getName()
				+ " finished executing.");
	}
}