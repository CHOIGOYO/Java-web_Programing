package ch13;

import javax.swing.JOptionPane;

public class Ex13_5 {

	public static void main(String[] args) throws Exception{
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		String input = JOptionPane.showInputDialog("값을 입력해 주세요.");
		System.out.println("입력하신 값은 "+ input + "입니다.");
	}

}
class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {
				System.out.println("예외발생.");
			}
		}
		
	}
}