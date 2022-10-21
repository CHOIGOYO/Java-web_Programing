package java_standard_1;

public class Ex3_10 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000; //  int * int -> int 
        long b = 1_000_000 * 1_000_000L; // int * long -> long

        System.out.println("a =" + a); // a =-727379968 오버 플로우
        System.out.println("b =" + b); // b =1000000000000

    }
    
}
