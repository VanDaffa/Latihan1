//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String playerName;
    private double health;
    private String weapon;
    private double weaponAttack;
    private String armor;
    private double armorDefense;

    public Main (String playerName, double health, String weapon, double weaponAttack, String armor, double armorDefense) {
        this.playerName = playerName;
        this.health = health;
        this.weapon = weapon;
        this.weaponAttack = weaponAttack;
        this.armor = armor;
        this.armorDefense = armorDefense;
    }

    public void tampilkanInfo() {
        System.out.println("Name : " + playerName);
        System.out.println("Health : " + health);
        System.out.println("Weapon : " + weapon + ", Attack : " + weaponAttack);
        System.out.println("Armor : " + armor + ", Armor Defense : " + armorDefense);
        System.out.println("=======================================================");
    }

    public static void main(String[] args) {
        Main mainPlayer1 = new Main("DelEko_", 100.0, "Katana", 35.0, "Dark Picesa", 35.0);
        Main mainPlayer2 = new Main("9Ty5_Master", 95.0, "Bow", 65.0, "Black Magician", 15.0);

        mainPlayer1.tampilkanInfo();
        mainPlayer2.tampilkanInfo();
    }
}