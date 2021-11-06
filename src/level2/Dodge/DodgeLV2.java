package level2.Dodge;

import level2.enemy.Enemy;

public class DodgeLV2 extends Dodge implements InDodge{
    //创建方法更改dodge指向
    @Override
    public InDodge setNext(InDodge dodge) {
        dodge=new  DodgeLV3();
        return dodge;
    }
    //反击方法
    @Override
    public void dodgeEnemy() {
        Enemy enemy=new Enemy();
        if(enemy.ATK>2*super.Dodge){
            System.out.println("王子挡下了一击后，选择了逃跑。。");
        }
    }
}
