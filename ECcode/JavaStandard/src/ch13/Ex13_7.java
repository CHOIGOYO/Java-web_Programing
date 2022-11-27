package ch13;

public class Ex13_7 implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7());
		t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다
		t.start();
		
		for(int i = 1; i <11; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				// 내용 생략 
			}
			System.out.println(i);
			
			if(i==5) {
				autoSave = true;
			}
		}
		System.out.println("프로그램을 종료합니다.");
 	}// main end
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			} catch(InterruptedException e) {
				// 내용 생략 
			}
			if(autoSave){
				autoSave();
			}
		}
	} // run end
	public void autoSave() {
		System.out.println("작업 파일이 저장되었습니다.");
	} // autoSave
}
