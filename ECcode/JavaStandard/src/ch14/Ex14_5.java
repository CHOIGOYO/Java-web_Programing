package ch14;
import java.util.Comparator;
import java.util.stream.Stream;
public class Ex14_5 {
	public static void main(String[] args) {
		 Stream<Student> studentStream = Stream.of(
				 new Student("이자바", 3, 300),
				 new Student("김자바", 1, 200),
				 new Student("최자바", 2, 100),
				 new Student("유자바", 2, 150),
				 new Student("황자바", 1, 290),
				 new Student("박자바", 3, 180)
				 );
		 studentStream.sorted(Comparator.comparing(Student::getban) // 반별 정렬 
		 			.thenComparing(Comparator.naturalOrder())) // 기본 정렬 
		 			.forEach(System.out::println);
	}

}
class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	
	Student(String name, int ban, int totalScore){
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s,%d,%d]",name,ban,totalScore);
	}
	
	String getName () { return name; }
	int getban() { return ban; }
	int getTotalScore() { return totalScore; }
	
	public int compareTo(Student s) { // 내림차순으로 정렬하기 위함 
		return s.totalScore - this.totalScore;
	}
}