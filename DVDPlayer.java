abstract class Palyer {
	abstract void play();

	abstract void pause();

	abstract void stop();
}

class GenericPlayer extends Player {
	GenericPlayer(String name, int year) {
		super(name, year);
	}

	void play() {
		System.out.println("Playing .avi files");
		System.out.println("Playing .dat files");
	}

	void pause() {
		System.out.println("Paused .avi files");
		System.out.println("Paused .dat files");
	}

	void stop() {
		System.out.println("Stopped .avi files");
		System.out.println("Stopped .dat files");
	}

}

public class DVDPlayer extends GenericPlayer {
	DVDPlayer(String name, int year) {
		super(name, year);
	}

	void play() {
		super.play();
		System.out.println("Playing .mpeg files");
	}

	void pause() {
		super.pause();
		System.out.println("Paused .mpeg files");
	}

	void stop() {
		super.stop();
		System.out.println("Stopped .mpeg files");
	}

	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer("DVD Player", 2005);
		dvd.play();
		dvd.pause();
		dvd.stop();
	}

}
