public class Ex4_2 {
    public static void main(String[] args) {
        // 조건식의 다양한 예
        int x = 0;
        System.out.printf( "x = %d일 때, 참인 것은 출력%n" , x );

        if(x == 0) System.out.println("x == 0"); //true
        if(x != 0) System.out.println("x != 0"); //false
        if(!(x == 0)) System.out.println("!(x == 0)"); //false
        if(!(x != 0)) System.out.println("!(x != 0)"); //true

        x = 1;
        System.out.printf("ㅌ = %d 일 때 , 참인 것은 출력%n" , x);
        
        if(x == 0) System.out.println("x == 0"); //false
        if(x!= 0) System.out.println("x!= 0"); //true
        if(!(x==0)) System.out.println("!(x==0)"); //true
        if(!(x!=0)) System.out.println("!(x!=0"); //false

        // if문 한 줄은 {}를 사용하지 않아도 허용된다

        // 블럭  {}

    }
}
