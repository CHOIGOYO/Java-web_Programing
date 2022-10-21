import java.util.Scanner;
public class Ex4_4 {
    public static void main(String[] args) {

        int score = 0;  // 점수를 저장하기 위한 변수 선언 0점으로 초기화
        char grade = ' '; // 학점을 저장하기 위한 변수 선언 공백으로 초기화

        System.out.println("점수를 입력하세요 >");

        Scanner scanner = new Scanner(System.in); 
        score = scanner.nextInt(); //화면으로부터 받은 값을 score에 저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >=80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else { // score < 70
            grade = 'D';
        }

        
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
