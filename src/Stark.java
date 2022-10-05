public abstract class Stark {
    private Integer helth;
    private Integer damage;
    private Weapon superweapon;


    public abstract String getStark(int helth, int damage, Weapon superweapon);


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
