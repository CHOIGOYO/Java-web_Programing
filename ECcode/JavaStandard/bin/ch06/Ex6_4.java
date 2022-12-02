public class Ex6_4 {
    public static void main(String[] args) {
        // 메서드의 실행 흐름 
        MyMath mm = new MyMath(); // 인스턴스 생성

        long result_1 = mm.add(5L, 3L);
        long result_2 = mm.subtract(5L, 3L);
        long result_3 = mm.multiply(5L, 3L);
        double result_4 = mm.divide(5L, 3L); // double대신 long값으로 호출하였다 이 값은 자동 형변환 된다.

        System.out.println("add(5L, 3L) = " + result_1);
        System.out.println("subtract(5L, 3L) = " + result_2);
        System.out.println("multiply(5L, 3L) = " + result_3);
        System.out.println("divide(5L, 3L) = " + result_4); 

    }
}

class MyMath {
    long add (long a , long b){
        long result = a + b;
        return result;
    }

    // 더 간단하게  작성하기
    long subtract (long a, long b){
        return a - b;
    }

    long multiply (long a, long b){
        return a * b;
    }

    double divide (double a, double b){
        return a / b;
    }
}