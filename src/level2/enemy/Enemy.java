package level2.enemy;

/*import level2.dodge.InDodge;*/

import level2.dodge.Dodge;

/*import java.util.ArrayList;*/

public class Enemy {
    public int ATK = 100;

    /*原代码
      //创建敌人攻击方法
      public void attack(ArrayList<InDodge> dodges){
          System.out.println("敌人进行了攻击！");
          for(InDodge dodge:dodges){
              dodge.dodgeEnemy();
          }
      }*/
    //创建反击成功方法
    public void attacked() {
        System.out.println("反击成功！");
    }

    public void attack(Dodge dodge){
        dodge.dodgeEnemy(this);
    }
}
