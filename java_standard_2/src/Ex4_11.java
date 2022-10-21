public class Ex4_11 {
    public static void main(String[] args) {
        //중첩 for문

        for(int i = 1; i <= 5; i++){ // 안에 for문을 5번 출력
            for(int j =1 ; j<=10; j++){
                System.out.print("*"); // *을 10번까지 이어 출력 print
            }
            System.out.println(" "); //구분 짓기위한 공백 출력 
        }

        for(int i = 1; i <= 5; i++){ 
            for(int j =1 ; j<=i; j++){
                System.out.print("*"); // *을 i번까지 이어 출력 print
            }
            System.out.println(" ");  
        }
    }
}
