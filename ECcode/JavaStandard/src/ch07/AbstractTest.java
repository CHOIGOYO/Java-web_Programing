package ch07;

abstract class Player{
	abstract void play(int pos); // 추상 클래스
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "부터 재생합니다.");
	}
	void stop() {
		System.out.println("재생을 멈춥니다.");
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
