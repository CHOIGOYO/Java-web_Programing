// super() 조상의 생성자

class Point {
    int x, y;

    Point(int x , int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;
    Point3D(int x, int y, int z){
        // 생성자는 상속되지 않는다
        super(x, y); //  point(int x , int y) _ 생성자 를 호출하여 초기화
        
        this.z = z;
    }
}



public class Ex7_4 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.print("\nx = "+ p.x + "\ny = "+ p.y + "\nz = "+p.z);
    }
}

/*
result>
x = 1
y = 2
z = 3
 */