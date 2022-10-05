 public final class  Betman extends Stark {
private String superpower;

     public String getPower() {
         return superpower;
     }

     public Betman(Stark stark,int helth, int damage, Weapon superweapon,String superpower) {
         super(helth, damage, superweapon,stark);

         this.superpower = superpower;
     }
     public String printInfo(){
         return  " Batman Hp: " + getHelth() +" Batman damage: " + getDamage()+ " Batman superpower: "+getSuperweapon()+ superpower;
     }

 }
