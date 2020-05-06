import java.util.Scanner;


public class Adventure {

    Scanner myScanner = new Scanner(System.in);
    int playerHP;
    String playerWeapon;
    String playerName;

    public void main(String[] args) {

        startGame();

    }

    public void startGame() {

        playerHP = 10;
        playerWeapon = "Blaster";

        System.out.println("Player HP" + playerHP);
        System.out.println("Player Weapon" + playerWeapon);



        System.out.println("What is your name ?");

        playerName = myScanner.nextLine();

        System.out.println("Are you ready to start the game" + playerName + "?" );








    }
}
