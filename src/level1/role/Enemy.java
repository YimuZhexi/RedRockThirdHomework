package level1.role;

public class Enemy extends Role implements Act {
    public Enemy() {
        hp = 500;
        atk = 50;
        defence = 100;
    }

    @Override
    public String getName() {
        return "小兵";
    }

    @Override
    public void attack(Enemy enemy, Hero hero) {
        hero.attack(enemy,hero);
        while (hero.hp!=0&&enemy.hp!=0) {
            int hurt = enemy.atk * hero.defence / (100 + hero.defence);
            hero.setHp(hero.hp - hurt);
            System.out.println(enemy.getName() + "对" + hero.getName() + "造成了" + hurt + "伤害");
            if (hero.hp != 0) {
                System.out.println("反击");
                hero.attack(enemy, hero);
            } else {
                System.out.println("死亡");
                break;
            }
            hero.getRole();
            if (enemy.hp==0){
                System.out.println("您胜利了");
            }
        }
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
}
