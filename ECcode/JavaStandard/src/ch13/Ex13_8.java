package ch13;

public class Ex13_8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
		try {
			System.out.println("2초간 sleep");
			th1.sleep(2000); // -> sleep은 다른 쓰레드를 잠자게 할 수 없다 main이잠  
			for(int i = 1; i < 3; i++) {
				System.out.println(i);
			}
		} catch(InterruptedException e) {}
		System.out.println("<<mainThread end>>");
	} // main
} // Ex13_8 end

class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i = 0; i<21; i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.print("*");
		}
		System.out.println("<< th1 end >>");
	}// run
} // ThreadEx8_1 end

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i = 0; i<21; i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.print("@");
		}
		System.out.println("<< th2 end >>");
	} // run
}// ThreadEx8_2 end