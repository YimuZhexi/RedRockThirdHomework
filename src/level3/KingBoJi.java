package level3;

import java.util.ArrayList;
import java.util.List;

//创建KingBoJi继承King
public class KingBoJi extends King {
    //创建soldiers数组
    List<Soldier> soldiers = new ArrayList<>();
    //具体实现review
    @Override
    public void review() {
        //创建匿名士兵类
        Soldier soldier1 = () -> System.out.println("国王好！");
        Soldier soldier2 = () -> System.out.println("国王吉祥！");
        Soldier soldier3 = () -> System.out.println("向国王致敬！");
        //将士兵类写入数组
        soldiers.add(soldier1);
        soldiers.add(soldier2);
        soldiers.add(soldier3);
        System.out.println("开始阅兵！");
        //逐个调用士兵类的response方法
        for (Soldier soldier : soldiers) {
            soldier.response();
        }
    }
}
