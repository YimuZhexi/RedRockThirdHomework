package level2.Dodge;

public abstract class Dodge{
    //初始化防御值
    int Dodge = 75;
    //创建方法更改dodge指向
    abstract InDodge setNext(InDodge dodge);
    //反击方法
    abstract void dodgeEnemy();
}
