package a_conditional;

public class SwitchDemo {

    public static void main(String[] args) {
        // switch
        
        
        System.out.println("switch(1)");
        
        switch(1) {
            case 1 :
                System.out.println("하나");
                break;
            case 2 :
                System.out.println("둘");
                break;
            case 3 :
                System.out.println("셋");
                break;
        }
        System.out.println("switch(2)");
        switch(2) {
            case 1 :
                System.out.println("하나");
                break;
            case 2 :
                System.out.println("둘");
                break;
            case 3 :
                System.out.println("셋");
                break;
        }
        System.out.println("default 출력하기");
        switch(4) {
            case 1 :
                System.out.println("하나");
                break;
            case 2 :
                System.out.println("둘");
                break;
            case 3 :
                System.out.println("셋");
                break;
            default :
                System.out.println("default");
        }
        }
        
}
