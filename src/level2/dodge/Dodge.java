package level2.dodge;

import level2.enemy.Enemy;

public abstract class Dodge{
    //初始化防御值
    int Dodge = 75;
    Dodge next;

    /*最开始写的
    //创建方法更改dodge指向
    abstract InDodge setNext(InDodge dodge);
    */
    abstract void setNext(Dodge dodge);

    //获得next
    public Dodge getNext(){
        return next;
    }

    //反击方法
    /*原代码
    abstract void dodgeEnemy();
    */
    public abstract void dodgeEnemy(Enemy enemy);
}
