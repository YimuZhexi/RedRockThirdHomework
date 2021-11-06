package level1.role;

public class Hero extends Role implements Act {
    public Hero() {
        hp = 1000;
        atk = 100;
        defence = 100;
    }

    @Override
    public String getName() {
        return "英雄";
    }

    @Override
    public void attack(Enemy enemy, Hero hero) {
        int hurt = hero.atk * enemy.defence / (100 + enemy.defence);
        enemy.setHp(enemy.hp - hurt);
        System.out.println(hero.getName() + "对" + enemy.getName() + "造成了" + hurt + "伤害");
        enemy.getRole();
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
}
