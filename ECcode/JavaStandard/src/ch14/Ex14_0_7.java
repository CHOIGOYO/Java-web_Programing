// 람다식을 소스로 하는 스트림 iterate() , generate()
package ch14;
import java.util.stream.Stream;
public class Ex14_0_7 {
	public static void main(String[] args) {
		// iterate(T seed,UnaryOperator f) : 단항 연산자 
		Stream<Integer> intSteram = Stream.iterate(1,n->n+2); // 무한 스트림 
		intSteram.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : 공급자 입력은 없고 출력값만 존재 
		Stream<Integer> intSteram2 = Stream.generate(()->1);
		intSteram2.limit(10).forEach(System.out::println);
	}

}
