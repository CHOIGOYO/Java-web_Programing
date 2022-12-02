package ch14;
import java.util.function.*;
public class Ex14_0_3 {

	public static void main(String[] args) {
		// 생성자의 메서드 참조 
		// Supplier 는 입력 없고, 출력만 있는 공급자이다.
		Supplier<MyClass> s = ()-> new MyClass();
		Supplier<MyClass> s2 = MyClass::new; // 메서드 참조
		
		System.out.println(s.get());
		System.out.println(s2.get());
		
		Function<Integer,MyClass2> f = (i)-> new MyClass2(i);
		
		MyClass2 mc = f.apply(100);
		System.out.println(mc);
		System.out.println(f.apply(200).iv); // 200
		
		Function<Integer,int[]> arr = x -> new int[x];
		System.out.println("arr.apply(100).length -> "+arr.apply(100).length); 
		
		Function<Integer,int[]> arr2 = int[]::new; // 메서드 참조
		System.out.println("arr2.apply(200).length -> "+arr2.apply(200).length);
	}
}
class MyClass{}

class MyClass2{
	int iv;
	MyClass2(int iv){
		this.iv=iv;
	}
}