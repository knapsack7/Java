public class SleepResumeDemo extends Thread {
	public static void main(String args[]) throws SecurityException {
		SleepResumeDemo srd1 = new SleepResumeDemo();
		SleepResumeDemo srd2 = new SleepResumeDemo();
		srd1.setName("First");
		srd2.setName("Second");
		srd1.start();
		srd2.start();
		try {
			Thread.sleep(1000);
			srd1.suspend();
			System.out.println("Suspending thread First");
			Thread.sleep(1000);
			srd1.resume();
			System.out.println("Resuming thread First");

			Thread.sleep(1000);
			srd2.suspend();
			System.out.println("Suspending thread Second");
			Thread.sleep(1000);
			srd2.resume();
			System.out.println("Resuming thread Second");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			for (int i = 0; i < 7; i++) {
				Thread.sleep(500);
				System.out.println(this.getName() + ":  " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
