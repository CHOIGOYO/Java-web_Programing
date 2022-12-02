// 멤버 변수의 초기화
class Ex6_14 {
    static {
        System.out.println("static {클래스 초기화 블럭}");
    }

    {
        System.out.println("{인스턴스 초기화 블럭}");
    }
    public Ex6_14() {
        System.out.println("생성자");
    }

    
    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
    
}
/*
result >
static {클래스 초기화 블럭}
Ex6_14 bt = new Ex6_14(); 
{인스턴스 초기화 블럭}
생성자
Ex6_14 bt2 = new Ex6_14(); 
{인스턴스 초기화 블럭}
생성자
 */

 // 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행 
 // 인스턴스 초기화 블럭은 인스턴스 생성될 때 마다 수행