package ch14;

public class Ex14_0 {
	public static void main(String[] args) {
//		Object obj = (a,b) -> a>b? a: b // 람다식. 익명객체
		@SuppressWarnings("unused")
		Object obj = new Object() {
						@SuppressWarnings("unused")
						int max (int a , int b) {
							return a > b? a:b;
						}
					};
//		int value = obj.max(3,5); // 형변환 할 수 없음  함수형 인터페이스로 해결가능함.
	}
}
