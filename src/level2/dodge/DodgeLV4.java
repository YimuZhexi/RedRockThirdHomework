package level2.dodge;

import level2.enemy.Enemy;

public class DodgeLV4 extends Dodge /*implements InDodge*/{
    /*原代码
    //创建方法更改dodge指向
    @Override
    public InDodge setNext(InDodge dodge) {
        return null;
    }*/
    @Override
    public void setNext(Dodge dodge){
        this.next = dodge;
    }
    //反击方法
    /*原代码
    @Override
    public void dodgeEnemy() {
        Enemy enemy=new Enemy();
        if(enemy.ATK<super.Dodge){
            System.out.println("王子选择了反击！");
            enemy.attacked();
        }
    }*/
    @Override
    public void dodgeEnemy(Enemy enemy){
        if(enemy.ATK<super.Dodge){
            System.out.println("王子选择了反击！");
            enemy.attacked();
        }else {
            getNext().dodgeEnemy(enemy);
        }
    }
}
