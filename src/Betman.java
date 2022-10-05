 public final class  Betman extends Stark {
private String superpower;

     public String getPower() {
         return superpower;
     }

     public Betman(int helth, int damage, Weapon superweapon,String superpower) {
         super(helth, damage, superweapon);

         this.superpower = superpower;
     }


     public String printInfo(){
         return  " Batman Hp: " + getHelth() +" Batman damage: " + getDamage()+ " Batman superpower: "+getSuperweapon()+ superpower;
     }


     @Override
     public String getStark(int helth, int damage, Weapon superweapon) {
         System.out.println("kokokokok");
         return "jjjjj"+ getHelth() + getDamage() + getSuperweapon()+ superpower;
     }
 }
