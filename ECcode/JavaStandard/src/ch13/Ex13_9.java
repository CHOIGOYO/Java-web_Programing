package ch13;
import javax.swing.*;
public class Ex13_9 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		System.out.println("isInterrupted() : "+ th1.isInterrupted()); // false
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 : " + input + "입니다.");
		
		th1.interrupt(); // interrupt() 호출하면 interrupt 상태가 true
		System.out.println("main_isInterrupted() : "+ th1.isInterrupted()); // true
		System.out.println("main_Interrupted() : "+ Thread.interrupted()); // false (main Thread)

	}// main
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;		
		while(i !=0 && !isInterrupted()) { // && and
			System.out.println(i--);
			for(long x = 0; x < 25000000000000L; x++);
				//시간지연//
		}
		System.out.println("ThreadEx9_1_isInterrupted() : "+ this.isInterrupted()); // false
		System.out.println("ThreadEx9_1_Interrupted() : "+ Thread.interrupted()); // false   

		System.out.println("ThreadEx9_1_The count end");
	} // run
} 
