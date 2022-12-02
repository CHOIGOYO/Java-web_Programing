// 기본 생성자    

class Data_1 {
    int value; // 매개변수가 없으므로 컴파일러가 자동으로 기본 생성자 추가
}
class Data_2 {
    int value;

    Data_2(int x){ // 생성자 정의 기본생성자 추가되지 않음 
        value = x; 
    }
        
}


public class Ex6_11 {
    public static void main(String[] args) {
    
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(10); // 매개변수가 있는 생성자이기 때문에 매개변수를 입력하지않으면 error발생 
    }
}
