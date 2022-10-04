public class Stark {
    private int helth;
    private int damage;
    private Weapon superweapon;

    public int getHelth() {
        return helth;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getSuperweapon() {
        return superweapon;
    }

    public Stark(int helth, int damage, Weapon superweapon) {
        this.helth = helth;
        this.damage = damage;
        this.superweapon = superweapon;
    }
}
