package ch13;

public class Ex13_1 {
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		// t2 는 Thread의 run()매서드의 구현부를 외부(ThreadEx1_2)에서 받아온다 
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		// t2의 과정을 한줄로 요약 (t3)
		Thread t3 = new Thread(new ThreadEx1_2());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
/*
 * ThreadEx1_1 는 Tread를 상속받아 run()메서드의 구현부를 작성함 
 */
class ThreadEx1_1 extends Thread{
	public void run() { // 상속받은 run() 메서드 
		for(int i = 0; i < 500; i++) {
			System.out.println(this.getName()); // 조상인 Tread의 getName()호출 (this 생략가능)
		}
	}
}

/*
 * ThreadEx1_2 는 Runnable를 구현하고 
 * run() 메서드 구현부를 작성
 */
class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i = 0; i < 500; i++) {
			// Thread.currentThread() -> 현재 실행중인 Thread반환 
			System.out.println(Thread.currentThread().getName());
		}
	}
}