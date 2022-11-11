package ch07;

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelup() { channel++; }
	void channelDown() { channel--; }
}

class DVD {
	boolean power;
	void power() { power = !power; }
	void play() {
		System.out.println("DVD PLAY");
	}
	void stop() {
		System.out.println("DVD STOP");
	}
}

class TvDVD extends Tv{
	DVD d = new DVD();
	void play() {
		d.play();
	}
	void stop() {
		d.stop();
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		

	}

}
