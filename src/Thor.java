public class Thor extends Stark {
    private String power;







    public Thor(Stark stark,int helth, int damage, Weapon superweapon, String power) {
        super(helth, damage, superweapon,stark);
        super.getStark(helth,damage,superweapon);
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
    }

