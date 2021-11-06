package level1.fight;

import level1.role.Enemy;
import level1.role.Hero;

public class Level0 {
    public static void main(String[] args) {
        System.out.println("开始");
        Hero myHero = new Hero();
        Enemy myEnemy = new Enemy();
        System.out.println(myHero.getName());
        myHero.getRole();
        System.out.println(myEnemy.getName());
        myEnemy.getRole();
        myEnemy.attack(myEnemy,myHero);
    }
}
