package ch14;
@FuntionalInterface
interface MyFuntion123{
	//	 모든 함수형 인터페이스는 하나의 메서드를 갖고, 인터페이스는 public 추상 메서드를 갖는다 
	void run(); // public abstract void run()
}

public class Ex14_1 {
	static void execute(MyFuntion123 f) { // 매개변수 타입이 MyFuntion123인 메서드 
		f.run();
	}
	static MyFuntion123 getMyfuntion123() { // 반환타입이 MyFuntion123인 메서드 
		MyFuntion123 f = () -> System.out.println("f3.run()");
		return f;
	}
	public static void main(String[] args) {
		// 람다식으로 MyFuntion123의 run() 구현 
		MyFuntion123 f1 = ()->System.out.println("f1.run()");
		
		MyFuntion123 f2 = new MyFuntion123() { // 익명클래스로 run()구현 
			public void run() { // public 필수 
				System.out.println("f2.run()");
			}
		};
		
		MyFuntion123 f3 = getMyfuntion123();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( ()->System.out.println("run()") );
	}
}