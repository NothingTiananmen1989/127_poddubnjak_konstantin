public class ArmoredWarrior extends Warrior {
    private int armor;
    public ArmoredWarrior (String name, int attack, int health, int armor) {
        super(name, attack, health);
        this.armor=armor;
    }

    public int getArmor() {
        return this.armor;
    }

    @Override
    public void TakeDamage(Warrior damage) {
        int d=damage.getHealth()-this.armor;
        if(d<1) {
            d=1;
        }
    }
}