public class Main {

    public static void main(String[] args) {


       // Thor objectA = new Thor(200, 50, Weapon.WEAPON," Stun");

        Thor objectA = new Thor(456,345,Weapon.WEAPON," Hill");
        Betman objectB = new Betman( 40, 40,Weapon.WEAPON," Blast ");
        Betman objectC = new Betman(200,20,Weapon.WEAPON," Lick Smerti ");

        System.out.println(objectA.printInfo()); //Перезаписываемый первый
        System.out.println(objectB.printInfo());//Перезаписываемый
        System.out.println(objectC.printInfo());                    //второй
        System.out.println(objectA.printInfo(" frost")); //Не перезаписываемый




    }
}