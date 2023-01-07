public class Warrior {
    private String name;
    private int attack;
    private int health;

    public Warrior (String w_name, int w_attack, int w_health) {
        this.name=w_name;
        this.attack=w_attack;
        this.health=w_health;
    }

    public void setHealth(int w_health) {
        this.health=w_health;
    }
    public String getName() {
        return this.name;
    }
    public int getAttack() {
        return this.attack;
    }
    public int getHealth() {
        return this.health;
    }
    public void TakeDamage (Warrior enemy) {
        enemy.health=enemy.health-this.attack;
    }
}
