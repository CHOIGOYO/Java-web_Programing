package ch07;
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("����ϴ�.");
	}
}
interface Fightable { // �������̽��� ��� �޼���� ���� ���� public abstract. 
	public abstract void move(int x, int y);
					void attack(Fightable fb); // public abstract ����
}

class Fighter extends Unit implements Fightable{
	//�������̵� ��Ģ : ���󺸴� ���������� ������ ������ �ȵȴ�.
	public void move(int x, int y) {
		System.out.println("[x= "+ x + ", y=" + y + "] ���̵�");
	}
	public void attack(Fightable fb) {
		System.out.println(fb + "�� ���� ");
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
