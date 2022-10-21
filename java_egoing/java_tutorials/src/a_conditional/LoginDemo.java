package a_conditional;

public class LoginDemo {
    public static void main(String[] args) {
        // 조건문_변수와 비교연산자, 조건문
        String id = args[0]; // 참고 args[0];는 입력값을 받는다
        if (id.equals("choigoyo")) {
            System.out.println("로그인 되었습니다");
        } else {
            System.out.println("id가 일치하지 않습니다");
        }

    }

}
