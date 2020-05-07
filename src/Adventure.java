import java.util.Scanner;

public class Adventure {
    Scanner myScanner = new Scanner(System.in);

    int playerHP;
    int monsterHP;
    String playerWeapon;
    String playerName;

    int choice;




    public static void main(String[] args) {
        Adventure game;

        game = new Adventure();
        game.startGame();
        game.deathStar();

    }

    public void startGame() {

        playerHP = 10;
        monsterHP= 10;

        playerWeapon = "Blaster";

        System.out.println("Player HP " + playerHP);
        System.out.println("Player Weapon " + playerWeapon);

        System.out.println("What is your name? ");

        playerName = myScanner.nextLine();

        System.out.println("Are you ready to start the game " + playerName + "? " );

    }

    public  void deathStar() {
        System.out.println("A monster appeared.");

        System.out.println("1. Fight");
        System.out.println("2. Run");

        choice = myScanner.nextInt();

        if(choice==1) {
            fight();
        } else {
            return;
        }
    }

    public void fight() {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Monster HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1) {
            attack();
        } else {
            return;
        }

    }

    public void attack() {
        int playerDamage = 0;

        if(playerWeapon.equals("Blaster")) {
            playerDamage = new java.util.Random().nextInt(5);
        }

        System.out.println("You attacked the monster and did " + playerDamage);

        monsterHP = monsterHP - playerDamage;

        System.out.println("Monster HP: " + monsterHP);

        if(monsterHP < 1) {
            ending();
        } else if (monsterHP > 0){
            int monsterDamage = 0;

            monsterDamage = new java.util.Random().nextInt(2);

            System.out.println("The monster attacked you and did " + monsterDamage);

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if ( playerHP < 1) {
                dead();
            } else if (playerHP > 1) {
                fight();
            }
        }
    }

    public void ending() {
        System.out.println("The End.");
    }

    public void dead() {
        System.out.println("You Died.");
    }
}
