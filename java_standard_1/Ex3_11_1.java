package java_standard_1;

public class Ex3_11_1 {
    public static void main(String[] args) {
        double pi = 3.141592 ;
        double shortpi = Math.round( pi * 1000 ); // 3142.0
        
        double pi2 = shortpi / 1000;
        System.out.println(pi2);

        // Ex3_11예제를 활용하여 소수점 4번째 자리에서 반올림 하는 방법 
    }
}
