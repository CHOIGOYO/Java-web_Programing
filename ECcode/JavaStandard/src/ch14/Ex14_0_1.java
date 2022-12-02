package ch14;

public class Ex14_0_1 {

	public static void main(String[] args) {
//		MyFuntion2 obj = new MyFuntion2() {
//			
//			@Override
//			public int max(int a, int b) {
//				//오버라이딩 조건 - 접근 제어자 범위를 같거나 더 넓게 가져야 한다. 
//				return 0;
//			}
//		};
		MyFuntion2 f = (a,b) -> a>b? a: b; // 람다식. 익명객체
		int value = f.max(3, 5);
		System.out.println("value = "+ value);
	}
}

@FuntionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드를 갖는 제약이 있다.
interface MyFuntion2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);
	
}