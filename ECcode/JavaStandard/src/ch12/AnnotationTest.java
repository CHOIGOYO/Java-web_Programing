package ch12;
import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101",hhmmss = "235959"))
public class AnnotationTest {
	@SuppressWarnings("deprecation") // 경고 억제 
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // Deprecated 된 메서드 사용 
		
		// 본 클래스의 객체 얻기 (class AnnotationTest)
		Class<AnnotationTest> cls = AnnotationTest.class;
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = "+ anno.testedBy());
		System.out.println("anno.testDate().yymmdd() =" + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() =" + anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) {
			System.out.println("testTools = "+ str);
		}
		System.out.println();
		
		// 본 클래스의 애너테이션 얻기 (class AnnotationTest)
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
	} // main end
}
class Parent {
	void parentMethod() { // 내용 생략 
	}
}
class Child extends Parent{
	@Override
	@Deprecated
	void parentMethod() { 
		System.out.println("Deprecated Method");
	}
}
@FunctionalInterface
interface Testable{ // 함수형 인터페이스  
	void test(); 
//	void check(); // @FunctionalInterface 사용하면 하나의 추상메서드를 가질 수 있는 제약이 있음 
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정 
@interface TestInfo{
	int cout() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}
@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface DateTime{
	String yymmdd();
	String hhmmss();
}

enum TestType{FIRST, FINAL}
