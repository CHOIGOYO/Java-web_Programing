package ch07;
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}
interface Fightable { // 인터페이스의 모든 메서드는 예외 없이 public abstract. 
	public abstract void move(int x, int y);
					void attack(Fightable fb); // public abstract 생략
}

class Fighter extends Unit implements Fightable{
	//오버라이딩 규칙 : 조상보다 접근제어자 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("[x= "+ x + ", y=" + y + "] 로이동");
	}
	public void attack(Fightable fb) {
		System.out.println(fb + "를 공격 ");
	}
}
public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit u = new Fighter();
		Fightable fb = new Fighter();
		
		f.move(100, 100);
		f.attack(new Fighter());
	}
}
