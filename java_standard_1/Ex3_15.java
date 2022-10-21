package java_standard_1;

import java.util.Scanner;


public class Ex3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in으로 들어온 사용자의 입력을 받아 scanner에 저장
        char ch = ' ';
        System.out.printf("문자를 하나 입력하세요. >");

        String input = scanner.nextLine(); // 문자열 한줄을 input에 저장
        ch = input.charAt(0); // input에 저장된 문자열의 0번째 문자열 ch에 저장

        if ('0' <= ch && ch <= '9') {
            // 입력받은 문자가 0보다 크거나 같고 9보다 작거나 같으면 실행
            System.out.printf("입력하신 문자는 숫자입니다.%n");
            
        }
        
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'A')) {
            // 입력받은 문자가 a보다 크거나 같고 z보다 작거나 같고, 또는 A보다 크거나 같고 Z보다 작거나 같으면 실행
            System.out.printf("입력하신 문자는 영문자입니다.%n");

        }
    }
}
