package ch07;

abstract class Player{
	abstract void play(int pos); // �߻� Ŭ����
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "���� ����մϴ�.");
	}
	void stop() {
		System.out.println("����� ����ϴ�.");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
//		Player p = new Player();
		AudioPlayer ap = new AudioPlayer();
		Player ap2 = new AudioPlayer();
		ap.play(30);
		ap.stop();
		
		ap2.play(10);
		ap2.stop();
	}
}
