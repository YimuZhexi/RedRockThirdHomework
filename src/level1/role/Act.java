package level1.role;

interface Act {
    String getName();

    void getRole();

    void attack(Enemy enemy, Hero hero);

    void setHp(int hp);
}
