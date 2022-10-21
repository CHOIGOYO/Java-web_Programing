

public class Ex5_2 {
    public static void main(String[] args) {
        
        int sum = 0; // 총합을 저장하기 위한 변수 sum선언
        float average = 0f; // 평균을 저장하기 위한 변수 average선언

        int[] score = {
            100, 88, 100, 100, 90
        };

        for (int i = 0; i < score.length; i++){
            sum += score[i]; //sum 은 배열 score의 합
        }
        average = sum / (float)score.length; //  average는 score의 합 sum / score.length  // 계산 결과를 float타입으로 얻으려 형변환 함
        
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}