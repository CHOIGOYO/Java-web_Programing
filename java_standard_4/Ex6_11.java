package JScode.java_standard_4;
// 기본 생성자
class Data_1{
    int value; // 매개변수가 없는 생성자 컴파일러가 자동으로 생성해줌 
}

class Data_2{
    int value;

    Data_2(int x) { // 매개변수가 있는 생성자 
        value = x;
    }
    
}
public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 D1 = new Data_1(); 
        Data_2 D2 = new Data_2(100); // 매개변수가 있는 생성자는 매개변수를 입력하여 인스턴스 생성을 해야함 
    }
}
