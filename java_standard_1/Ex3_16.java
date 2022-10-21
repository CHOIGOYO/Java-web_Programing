package java_standard_1;
public class Ex3_16 {
    public static void main(String[] args) {
        // 논리 부정 연산자 !

        boolean b = true;
        char ch = 'C';

        System.out.printf(" b = %b%n " , b); // b = true
        System.out.printf(" b = %b%n ", !b); //  b = false
        System.out.printf(" !!b = %b%n " , b); //  !!b = true
        System.out.printf(" !!!b = %b%n%n " , !!!b); //  !!!b = false

        System.out.printf("ch = %c%n" , ch); // ch = C
        System.out.printf("ch < 'a' || ch > 'z' = %b%n", (ch < 'a' || ch > 'z') ); // ch < 'a' || ch > 'z' = true
        System.out.printf("!('a' <= ch && ch <= 'z' = %b%n)" , !('a' <= ch && ch <= 'z') ); // !('a' <= ch && ch <= 'z' = true)
        System.out.printf(" 'a' <= ch && ch <= 'z' = %b%n ", 'a' <= ch && ch <= 'z'); // 'a' <= ch && ch <= 'z' = false

        // 대소문자 구분 조심 
    }
}