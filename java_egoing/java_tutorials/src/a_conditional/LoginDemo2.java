package a_conditional;

public class LoginDemo2 {

    public static void main(String[] args) {
        // 조건문의 중첩
        String id =args[0];
        String password =args[1];
        if (id.equals("choigoyo")) {
            if(password.equals("1234")) {
                System.out.println("로그인 되었습니다.");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            } 
            
            
            } else {
                System.out.println("존재하지 않는 아이디입니다.");
        }

    }

}
