// String 배열의 초기화

public class Ex5_6 {
    public static void main(String[] args) {
        String[] names = {"choi", "go", "yo"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] : " + names[i]);
        }//
        
        
        String tmp = names[2]; //배열의 3번째 요소를 tmp에 임시저장
        System.out.println("tmp : " + tmp);
        names[0] = "yu";
        //
        
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
    }
}
