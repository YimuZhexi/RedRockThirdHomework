package level2.boJi;

import level2.dodge.*;
import level2.enemy.Enemy;

/*import java.util.ArrayList;*/

public class BoJi {
    public static void main(String[] args) {
       /*原代码
        //添加数组放置dodge
        ArrayList<InDodge>dodges = new ArrayList<>();*/
        Enemy enemy = new Enemy();
        DodgeLV1 dodgeLV1 = new DodgeLV1();
        DodgeLV2 dodgeLV2 = new DodgeLV2();
        DodgeLV3 dodgeLV3 = new DodgeLV3();
        DodgeLV4 dodgeLV4 = new DodgeLV4();
        /*InDodge dodge=new DodgeLV1();*/
        /*原代码
        //向数组中添加dodge
        dodges.add(dodge);
        dodges.add(dodgeLV1.setNext(dodge));
        dodges.add(dodgeLV2.setNext(dodge));
        dodges.add(dodgeLV3.setNext(dodge));*/
        //调用attack方法
        /*enemy.attack(dodges);*/
        dodgeLV1.setNext(dodgeLV2);
        dodgeLV2.setNext(dodgeLV3);
        dodgeLV3.setNext(dodgeLV4);
        enemy.attack(dodgeLV1);

    }
}
