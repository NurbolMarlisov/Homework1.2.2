public class Stark {
    private int helth;
    private int damage;
    private Weapon superweapon;
    private Stark stark;

    public Stark(int helth, int damage, Weapon superweapon) {
    }

    public Stark getStark(int helth, int damage, Weapon superweapon) {
        return stark;
    }

    public Stark(

    ) {


    }

    public int getHelth() {
        return helth;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getSuperweapon() {
        return superweapon;
    }

    public Stark(int helth, int damage, Weapon superweapon,Stark stark) {
        this.helth = helth;
        this.damage = damage;
        this.superweapon = superweapon;
        this.stark = stark;
    }


}
