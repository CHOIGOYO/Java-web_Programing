// 난수를 요소로 갖는 스트림 생성하기 
package ch14;
import java.util.Random;
import java.util.stream.IntStream;
public class Ex14_0_6 {
	public static void main(String[] args) {
		IntStream intStream = new Random().ints();
		// limit() 사용해서 5개만 잘라 출력 
		intStream.limit(5).forEach(System.out::println);
		System.out.println();
		
		// 5~9 범위의 난수 ints(5,10)
		IntStream intStream2 = new Random().ints(4,5,10); // 4개까지 5~9범위 난수 저장 
		intStream2
//		.limit(5) // 5개 출력
		.forEach(System.out::println);
		

	}
}
