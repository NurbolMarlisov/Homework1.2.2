 public final class  Betman extends Thor {
private String superpower;

     public String getPower() {
         return superpower;
     }

     public Betman(int helth, int damage, Weapon superweapon,String superpower) {
         super(helth, damage, superweapon);

         this.superpower = superpower;
     }
     public String printInfo(){
         return  super.printInfo() + this.getPower() ;
     }

 }
