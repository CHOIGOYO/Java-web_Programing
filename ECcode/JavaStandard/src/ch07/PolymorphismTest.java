package ch07;

class Mycat{
	int age;
	String color;
	
	Mycat(){}
	void age(int a) {
		this.age = a;
	}
	void color(String c) {
		this.color = c;
	}
}

class Goorum extends Mycat{
	int number;
	String name;
	Goorum(){}
	
	void name1(String n) {
		this.name = n;
	}
}
public class PolymorphismTest {
	public static void main(String[] args) {
		Mycat mc = new Goorum();
		Goorum g = (Goorum)mc;
		Mycat mc2 = (Mycat)g;
	}

}
