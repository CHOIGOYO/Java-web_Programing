package ch07;
class Point123{
	int x;
	int y;
	Point123(int x, int y){
	
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :" +x+", y :"+y;
	}
}
//class Point3D123 extends Point123{
//	int z;
//	Point3D123(int x, int y, int z){
//		
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	String getLocation() {
//		return "x :" +x+", y :"+y+", z :"+z;
//	}
//}
//public class SuperTest {
//
//	public static void main(String[] args) {
//		Point3D123 p123d = new Point3D123(1, 2, 3);
//	}
//
//}
