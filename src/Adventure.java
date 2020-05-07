import java.util.Scanner;

public class Adventure {




    public static void main(String[] args) {

        startGame();
        deathStar();




    }



    public static void startGame() {

        Scanner myScanner = new Scanner(System.in);
        int playerHP;
        String playerWeapon;
        String playerName;


        playerHP = 10;
        playerWeapon = "Blaster";

        System.out.println("Player HP " + playerHP);
        System.out.println("Player Weapon " + playerWeapon);



        System.out.println("What is your name? ");

        playerName = myScanner.nextLine();

        System.out.println("Are you ready to start the game " + playerName + "? " );

    }

    public static void deathStar() {


    }
}
