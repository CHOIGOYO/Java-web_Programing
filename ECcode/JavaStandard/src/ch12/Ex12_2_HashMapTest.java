package ch12;
import java.util.*;
public class Ex12_2_HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String,Student1> map = new HashMap<>(); // JDK1.7부터 생성자에 타입지정 생략가능.
		
		map.put("choigoyo", new Student1("choigoyo",100,100,100));
		
		// key가 choigoyo인 value값 꺼내기 ( 형변환 필요 x )
		Student1 s = map.get("choigoyo");
		
		System.out.println(map);
		System.out.println(s); // Student 타입의 값이 출력
	}
} // main end
class Student1{
	String name = "";
	int kor;
	int eng;
	int math;
	
	Student1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
} // Student end