public class Thor extends Stark {
    private String power;

    public Thor(int helth, int damage, Weapon superweapon,String power) {
        super(helth, damage, superweapon);
        this.power = power;
    }



    public Thor(int helth, int damage, Weapon superweapon) {
        super(helth,damage,superweapon);
    }

    public String getPower() {
        return power;
    }

    public String printInfo() {
        return  "Betman  Hp: " + getHelth() + " Damage: " + getDamage() + " Weapon: " + getSuperweapon()+ this.getPower();
       // ПЕРЕЗАПИСЫВАЕМЫЙ МЕТОД
    }
    public final String printInfo(String Sword){
        return " Stark Hp: " + getHelth()+ " damage: "+ getDamage()+ " Wepon: "+ getSuperweapon()+this.power;
      //НЕ ПЕРЕЗАПИСЫВАЕМЫЙ МЕТОД

    }
    }

