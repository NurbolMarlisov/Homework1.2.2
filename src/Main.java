public class Main {

    public static void main(String[] args) {


        Thor objectA = new Thor(200, 50, Weapon.WEAPON," Stun");
        Betman objectB = new Betman(210,40,Weapon.WEAPON," Blast ");
        Betman objectC = new Betman(200,20,Weapon.WEAPON," Lick Smerti ");


        System.out.println(objectA.printInfo(" FrostSword"));// не перезаписываемый
        System.out.println(objectB.printInfo());
        System.out.println(objectC.printInfo());
    }
}