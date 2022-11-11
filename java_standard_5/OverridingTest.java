package ch07;

class Point3{
	int x;
	int y;
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}
class Point3D extends Point3{
	int z;
	String getLocation() {
		return "x: "+x+", y: "+y+", z: "+z;
	}
}
/*
class Parent2{
	void parentMethod() throws IOException, SQLException{
		
	}
}
class child2 extends Parent2{
	void childMethod() throws IOException{
		
	}
}
*/
public class OverridingTest {
	public static void main(String[] args) {
		Point3 p3 = new Point3();
		p3.x = 10;
		p3.y = 10;
		System.out.println(p3.getLocation());
		
		Point3D pp3 = new Point3D();
		pp3.z = 20;
		System.out.println(pp3.getLocation());	
	}
}

/*
x: 10, y: 10
x: 0, y: 0, z: 20
*/
