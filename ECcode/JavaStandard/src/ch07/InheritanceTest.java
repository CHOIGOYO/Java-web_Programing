package ch07;

class Point{
	int x;
	int y;
}

class Circle { // Point�� ���� ���þ��� class
	int x;
	int y;
	int r;
}

class ExtendsCircle extends Point{ // ���
	int r;
}

class CompositeCircle { // ����
	Point p = new Point();
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		
		ExtendsCircle c = new ExtendsCircle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println("c.x = " + c.x + ", nc.y = " + c.y + ", c.r = " + c.r );
		
		CompositeCircle cc = new CompositeCircle();
		cc.p.x = 4;
		cc.p.y = 5;
		cc.r = 6;
		System.out.println("cc.p.x = " + cc.p.x + ", cc.p.y = " + cc.p.y + ", cc.r = " + cc.r );
		
	}

}






/*
c.x = 1, nc.y = 2, c.r = 3
cc.p.x = 4, cc.p.y = 5, cc.r = 6
*/
