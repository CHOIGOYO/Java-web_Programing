// 추상클래스의 작성 
public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {
            new Marine() , new Tank() , new Dropship()
        };

        for(int i = 0; i < group.length; i++){
            group[i].move(100, 100);
        }
    }
}
abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){}
}
class Marine extends Unit { // 보병
    void move(int x , int y){
        System.out.println("Marine [x= "+ x + ", y=" + y + "]");
    }
    void stimPack(){
        /* 스팀팩을 사용한다 */
    }
}
class Tank extends Unit{
    void move(int x , int y){
        System.out.println("Tnak [x= "+ x + ", y=" + y + "]");
    }
    void siegeMode(){
        /* 공성모드로 변경 */
    }
}
class Dropship extends Unit{
    void move(int x , int y){
        System.out.println("Dropship [x= "+ x + ", y=" + y + "]");
    }
    void load() {
        /* 유닛 태우기 */
    }
    void unload(){
        /* 유닛 내리기 */
    }
}
