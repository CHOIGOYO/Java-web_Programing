package ch12;
import java.util.*;

class Student{ 
	String name = "";
	int ban ;
	int number ;
	
	Student(String name, int ban ,int number) {
		this.name = name;
		this.ban = ban;
		this.number = number;
	}
}

public class Ex12_2 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("choigoyo", 9, 7));
		list.add(new Student("yusojung", 9, 3));
		list.add(new Student("goorum", 0, 1));
		list.add(new Student("dda-om", 0, 2));
		list.add(new Student("dda-som", 0, 3));
		
		
		// Iterator는 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스 읽어오기
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student s = (Student)it.next(); //지네릭스를 사용하지 않으면 형변환 필요.
			
//			Student s = it.next(); // ok
//			System.out.println("이름 : "+s.name +", 반 : "+s.ban+", 번호 : "+s.number);
			
			System.out.println("name : "+it.next().name); // 한줄로 간결하게 작성가능 
		}
	}

}
