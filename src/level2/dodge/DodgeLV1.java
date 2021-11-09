package level2.dodge;

import level2.enemy.Enemy;

public class DodgeLV1 extends Dodge/* implements InDodge*/ {

    /*原来代码
    //创建方法更改dodge指向
    @Override
    public InDodge setNext(InDodge dodge){
        dodge = new DodgeLV2();
        return dodge;
    }*/

    @Override
    public void setNext(Dodge dodge) {
        this.next = dodge;
    }

    //反击方法
    /*原代码
    @Override
    public void dodgeEnemy() {
        Enemy enemy=new Enemy();
        if(enemy.ATK>3*super.Dodge){
            System.out.println("王子直接逃跑了！");
        }
    }*/
    @Override
    public void dodgeEnemy(Enemy enemy) {
        if (enemy.ATK > 3 * super.Dodge) {
            System.out.println("王子直接逃跑了！");
        }else{
            getNext().dodgeEnemy(enemy);
        }
    }
}
