public class Main {

    public static void main(String[] args) {


       // Thor objectA = new Thor(200, 50, Weapon.WEAPON," Stun");
        Stark stark = new Stark();
        Thor objectA = new Thor(stark,456,345,Weapon.WEAPON," Hill");
        Betman objectB = new Betman(stark,210,40,Weapon.WEAPON," Blast ");
        Betman objectC = new Betman(stark,200,20,Weapon.WEAPON," Lick Smerti ");

        System.out.println(objectA.printInfo()); //Перезаписываемый первый
        System.out.println(objectB.printInfo());//Перезаписываемый
        System.out.println(objectC.printInfo());                    //второй
        System.out.println(objectA.printInfo(" frost")); //Не перезаписываемый

    }
}