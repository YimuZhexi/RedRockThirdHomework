package level2.Dodge;

import level2.enemy.Enemy;

public class DodgeLV4 extends Dodge implements InDodge{
    //创建方法更改dodge指向
    @Override
    public InDodge setNext(InDodge dodge) {
        return null;
    }
    //反击方法
    @Override
    public void dodgeEnemy() {
        Enemy enemy=new Enemy();
        if(enemy.ATK<super.Dodge){
            System.out.println("王子选择了反击！");
            enemy.attacked();
        }
    }
}
