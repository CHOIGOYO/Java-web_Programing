package ch13;

public class Ex13_6 {
	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		th2.setPriority(7); // 1~10까지 우선 순위 중 7로 지정해준다.
		
		// 우선순위의 값을 가져와 출력 
		System.out.println("Priority of th1(0) " + th1.getPriority());
		System.out.println("Priority of th2(1) " + th2.getPriority());
		
		th1.start();
		th2.start();
	}

}
// Thread 1
class ThreadEx6_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("0");
			for(int x = 0; x <10000000; x ++); // 너무 빨리 작업이 끝나지 않기 위해 시간 제한으 넣음 의미x
		}
	}
}
// Thread 2
class ThreadEx6_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("1");
			for(int x = 0; x <10000000; x ++);
		}
	}
}