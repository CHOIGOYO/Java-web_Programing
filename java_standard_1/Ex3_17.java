package java_standard_1;

public class Ex3_17 {
    public static void main(String[] args) {
        // 조건 연산자를 활용하여 절대값을 구하고 부호를 붙이는 예

        int x , y , z;
        int absX , absY , absZ;
        char signX ,signY , signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x; // x가 0보다 작으면 음수로 만든다 +x
        absY = y >= 0 ? y : -y; // -y
        absZ = z >= 0 ? z : -z; // z

        // 조건 연산자를 중첩
        signX = x > 0 ? '+' : ( x == 0 ? ' ' : '-'); 
        signY = y > 0 ? '+' : ( y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : ( z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d%n" , signX ,absX); // x = +10
        System.out.printf("Y = %c%d%n" , signY ,absY); // Y = -5
        System.out.printf("Z = %c%d%n" , signZ ,absZ); // Z =  0
    }
}
