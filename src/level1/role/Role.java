package level1.role;

abstract class Role implements Act{
    int hp;
    int atk;
    int defence;
    @Override
    public String getName(){
        return null;
    }

    @Override
    public void getRole() {
        System.out.print("生命：");
        for (int i = 0; i < hp / 100; i++) {
            System.out.print("■");
        }
        System.out.println(hp);
        System.out.print("攻击：");
        for (int i = 0; i < atk / 10; i++) {
            System.out.print("■");
        }
        System.out.println(atk);
        System.out.print("防御：");
        for (int i = 0; i < defence / 10; i++) {
            System.out.print("■");
        }
        System.out.println(defence);
    }

    @Override
    public void attack(Enemy enemy, Hero hero) {

    }

    @Override
    public void setHp(int hp) {

    }
}
