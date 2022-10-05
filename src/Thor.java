public class Thor extends Stark {
    private String power;



    public Thor(int helth, int damage, Weapon superweapon, String power) {
        super(helth, damage, superweapon);
       // super.getStark(helth,damage,superweapon);
        this.power = power;
    }



    public Thor(int helth, int damage, Weapon superweapon, Stark stark) {
        super(helth,damage,superweapon);
    }

    public String getPower() {
        return power;
    }



    public String printInfo() {
        return " Hp Stark: " + getHelth() +" Stark damage: " + getDamage()+ " Stark weapon: "+getSuperweapon() ;
       // ПЕРЕЗАПИСЫВАЕМЫЙ МЕТОД
    }


    public final String printInfo(String Sword){
        return " Thor Hp: " + getHelth()+ " Thor damage: "+ getDamage()+ " Thor Wepon: "+ getSuperweapon()+this.power;
      //НЕ ПЕРЕЗАПИСЫВАЕМЫЙ МЕТОД

    }

    @Override
    public String getStark(int helth, int damage, Weapon superweapon) {

        return  " Batman Hp: " + getHelth() +" Batman damage: " + getDamage()+ " Batman superpower: "+getSuperweapon()+ this.power;
    }

}

