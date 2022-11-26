package ch12;
import java.util.*;

class Tv{}
class Audio{}

public class GenericTest {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();  
		ArrayList<Tv> list = new ArrayList<Tv>(); // Tv 타입의 객체만 저장가능
		
		list.add(new Tv());
//		list.add(new Audio());
		
		Tv t = list.get(0); // Generic클래스는 한가지 타입만 저장 가능한 클래스이기 때문에 요소를 얻어올 때 형변환이 필요 없음  
//		Tv t = (Tv)list.get(0); // list의 첫번째 요소를 꺼낸다. (list의 반환타입이 Object 타입이라 형변환 필요) 
		
	}
}
