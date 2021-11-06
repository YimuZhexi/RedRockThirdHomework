package level2.Dodge;

import level2.enemy.Enemy;

public class DodgeLV1 extends Dodge implements InDodge{
    //创建方法更改dodge指向
    @Override
    public InDodge setNext(InDodge dodge){
        dodge = new DodgeLV2();
        return dodge;
    }
    //反击方法
    @Override
    public void dodgeEnemy() {
        Enemy enemy=new Enemy();
        if(enemy.ATK>3*super.Dodge){
            System.out.println("王子直接逃跑了！");
        }
    }
}
