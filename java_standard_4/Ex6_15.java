package JScode.java_standard_4;

public class Ex6_15 {
    // 명시적 초기화 배열 arr[] 선언
    static int [] arr = new int[10];

    static { // 클래스 초기화 블럭을 이용
        for (int i = 0; i < arr.length; i++) {
            //1과 10사이의 임의값을 배열 arr에 저장
            arr[i] = (int)(Math.random()*10) +1 ;
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] : " + arr[i]);
        }
    }
}

/*
result >
arr[0] : 1
arr[1] : 7
arr[2] : 5
arr[3] : 8
arr[4] : 5
arr[5] : 4
arr[6] : 5
arr[7] : 9
arr[8] : 9
arr[9] : 2
*/

