import java.util.Scanner;
public class Ex4_5 {
    public static void main(String[] args) {
        // 중첩 if문 예제
        int score = 0;
        char grade = ' ' , opt = '0';

        System.out.print( "점수 입력 > " );

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt() ; //화면을 통해 입력받은 점수를 score에 저장 

        System.out.printf("당신의 점수는 %d 입니다.", score);

        if (score >= 90) {
            grade ='A';
            if (score >= 98){
                opt = '+';
            } else if (score < 94){
                opt = '-';
            }
        }
        else if (score >=80) {
                grade = 'B';
                if (score >= 88){
                    opt = '+';
                } else if (score < 84){
                opt = '-';
                }
        } 
        else if (score >= 70) {
            grade = 'C';
            if (score >= 78){
                opt = '+';
                } else if (score < 74){
                opt = '-';
                }
        } 
        else { // score < 70
            grade = 'D';
        }
        System.out.printf("당신의 학점은 %c%c 입니다.%n", grade, opt);    
        }
    }

