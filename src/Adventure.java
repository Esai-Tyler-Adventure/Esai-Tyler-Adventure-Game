import java.util.Scanner;

public class Adventure {
    Scanner myScanner = new Scanner(System.in);

    int playerHP;
    int initialPlayerHP;
    int monsterHP;
    int potions;
    int choice;
    String playerWeapon;
    String playerName;

    public static void main(String[] args) {
        Adventure game;
        game = new Adventure();
        game.intro();
        game.startGame();
        game.room();

    }

    public void intro(){
        System.out.println("\n" +
                " /$$$$$$ /$$   /$$        /$$$$$$         /$$$$$$   /$$$$$$  /$$        /$$$$$$  /$$   /$$ /$$     /$$\n" +
                "|_  $$_/| $$$ | $$       /$$__  $$       /$$__  $$ /$$__  $$| $$       /$$__  $$| $$  / $$|  $$   /$$/\n" +
                "  | $$  | $$$$| $$      | $$  \\ $$      | $$  \\__/| $$  \\ $$| $$      | $$  \\ $$|  $$/ $$/ \\  $$ /$$/ \n" +
                "  | $$  | $$ $$ $$      | $$$$$$$$      | $$ /$$$$| $$$$$$$$| $$      | $$$$$$$$ \\  $$$$/   \\  $$$$/  \n" +
                "  | $$  | $$  $$$$      | $$__  $$      | $$|_  $$| $$__  $$| $$      | $$__  $$  >$$  $$    \\  $$/   \n" +
                "  | $$  | $$\\  $$$      | $$  | $$      | $$  \\ $$| $$  | $$| $$      | $$  | $$ /$$/\\  $$    | $$    \n" +
                " /$$$$$$| $$ \\  $$      | $$  | $$      |  $$$$$$/| $$  | $$| $$$$$$$$| $$  | $$| $$  \\ $$    | $$    \n" +
                "|______/|__/  \\__/      |__/  |__/       \\______/ |__/  |__/|________/|__/  |__/|__/  |__/    |__/    \n" +
                "                                                                                                      \n" +
                "                                                                                                      \n" +
                "                                                                                                      \n" +
                " /$$$$$$$$/$$$$$$  /$$$$$$$         /$$$$$$  /$$      /$$  /$$$$$$  /$$     /$$                       \n" +
                "| $$_____/$$__  $$| $$__  $$       /$$__  $$| $$  /$ | $$ /$$__  $$|  $$   /$$/                       \n" +
                "| $$    | $$  \\ $$| $$  \\ $$      | $$  \\ $$| $$ /$$$| $$| $$  \\ $$ \\  $$ /$$/                        \n" +
                "| $$$$$ | $$$$$$$$| $$$$$$$/      | $$$$$$$$| $$/$$ $$ $$| $$$$$$$$  \\  $$$$/                         \n" +
                "| $$__/ | $$__  $$| $$__  $$      | $$__  $$| $$$$_  $$$$| $$__  $$   \\  $$/                          \n" +
                "| $$    | $$  | $$| $$  \\ $$      | $$  | $$| $$$/ \\  $$$| $$  | $$    | $$                           \n" +
                "| $$    | $$  | $$| $$  | $$      | $$  | $$| $$/   \\  $$| $$  | $$    | $$                           \n" +
                "|__/    |__/  |__/|__/  |__/      |__/  |__/|__/     \\__/|__/  |__/    |__/                           \n" +
                "                                                                                                      \n" +
                "                                                                                                      \n" +
                "                                                                                                      \n");
    }

    public void startGame() {
        potions = 2;
        playerWeapon = "Blaster";

        System.out.println("What is your name rebel?");
        playerName = myScanner.nextLine();

        System.out.println("How many HP do you want?");
        initialPlayerHP = myScanner.nextInt();
        System.out.println("Player HP set to: " + initialPlayerHP);
        playerHP = initialPlayerHP;

        System.out.println("How many HP should he enemy have?");
        monsterHP = myScanner.nextInt();
        System.out.println("Monster HP set to: " + monsterHP);
    }

    public void room(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You wake up in your room confused, you can only remember your name is " + playerName + ".");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You find a Blaster in your hand and some Jabba Juice next to you.");
        System.out.println("You take both items with you. You need to get out quick!");
        System.out.println();
        System.out.println("1: Get out!");
        System.out.println();
        System.out.println("2: Stay");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1) {
            deathStar();
        } else if(choice ==2){
            System.out.println("You had to leave, or die...");
            chambers();
        }
    }

    public void deathStar() {
        System.out.println(

                "            _,.-\"T\n" +
                "      _.--{~    :l\n" +
                "    c\"     `.    :I\n" +
                "    |  .-\"~-.\\    l     .--.\n" +
                "    | Y_r--. Y) ___I ,-\"(~\\ Y\n" +
                "    |[__L__/ j\"~=__]~_~\\.\" _/\n" +
                " ___|  \\.__.r--<~__.T T/ \"~/\n" +
                "'--cl___/\\ ( () ).,_L_]}--{\n" +
                "   `--'   `-^--^\\ /___\"(~\\ Y\n" +
                "                 \"~7/ \\ \" `/\n" +
                "                  // //]--[\n" +
                "                 /> oX |: L\n" +
                "                //  /  `| o\\\n" +
                "               //. /    I  [\n" +
                "              / \\]/     l: |\n" +
                "             Y.//       `|_I\n" +
                "             I_Z         L :]\n" +
                "            /\".-7        [n]l\n" +
                "           Y / /         I //\n" +
                "           |] /         /]\"/\n" +
                "           L:/         //./\n" +
                "          [_7      _  // /\n" +
                "            _  ,-=\"_\"^K_/ \n" +
                "           [ ][.-~\" ~\"-.]\n" +
                "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("An AT-ST Walker is in the middle of the foyer.");
        System.out.println("He sees you! What are you going to do?");
        System.out.println();
        System.out.println("1. Fight");
        System.out.println();
        System.out.println("2. Run");

        choice = myScanner.nextInt();

        if(choice==1) {
            fight();
        } else {
            chambers();
        }
    }

    public void fight() {
        System.out.println("" +
                "       ________________\n" +
                "     |'-.--._ _________:\n" +
                "     |  /    |  __    __\\\n" +
                "     | |  _  | [\\_\\= [\\_\\\n" +
                "     | |.' '. \\.........|\n" +
                "     | ( <)  ||:       :|_\n" +
                "      \\ '._.' | :.....: |_(o\n" +
                "       '-\\_   \\ .------./\n" +
                "       _   \\   ||.---.||  _\n" +
                "      / \\  '-._|/\\n~~\\n' | \\\n" +
                "     (| []=.--[===[()]===[) |\n" +
                "     <\\_/  \\_______/ _.' /_/\n" +
                "     ///            (_/_/\n" +
                "     |\\\\            [\\\\\n" +
                "     ||:|           | I|\n" +
                "     |::|           | I|\n" +
                "     ||:|           | I|\n" +
                "     ||:|           : \\:\n" +
                "     |\\:|            \\I|\n" +
                "     :/\\:            ([])\n" +
                "     ([])             [|\n" +
                "      ||              |\\_\n" +
                "     _/_\\_            [ -'-.__\n" +
                "snd <]   \\>            \\_____.>\n" +
                "      \\__/");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("AT-ST HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println();
        System.out.println("2: Drink Jabba Juice - +1 HP ("+ potions +" left)");
        System.out.println();
        System.out.println("3: Run like a coward");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1) {
            attack();
        } else if (choice==2) {
            addHP();
        }else {
            chambers();
        }
    }

    public void addHP (){
        int monsterDamage = 0;
        monsterDamage = new java.util.Random().nextInt(2);
        if ( monsterDamage == 0) {
            System.out.println("The AT-ST missed!");
        } else {
            System.out.println("The AT-ST attacked you and did " + monsterDamage + " damage.");
        }

        playerHP = playerHP - monsterDamage;

        if (playerHP < initialPlayerHP && potions >= 1) {
            playerHP += 1;
            potions -= 1;
            System.out.println("Drank a Jabba Juice! Gained +1 HP.");
            fight();
        } else if (potions == 0) {
            System.out.println("You have no Jabba Juice left.");
            fight();
        } else {
            System.out.println("You are at full health already... cheater");
            fight();
        }
    }

    public void attack() {
        int playerDamage = 0;

        if(playerWeapon.equals("Blaster")) {
            playerDamage = new java.util.Random().nextInt(5);
        }

        monsterHP = monsterHP - playerDamage;

        if(monsterHP < 1) {
            System.out.println("You defeated the AT-ST!");
            ending();
        } else if (monsterHP > 0){
            int monsterDamage = 0;
            monsterDamage = new java.util.Random().nextInt(2);
            if ( monsterDamage == 0) {
                System.out.println("The AT-ST missed!");
            } else {
                System.out.println("The AT-ST attacked you and did " + monsterDamage + " damage.");
            }
            if ( playerDamage == 0) {
                System.out.println("You missed! Get better noob!");
            } else {
                System.out.println("You attacked the AT-ST and did " + playerDamage + " damage.");
            }

            playerHP = playerHP - monsterDamage;

            if ( playerHP < 1) {
                dead();
            } else if (playerHP > 0) {
                fight();
            }
        }
    }

    public void chambers(){
        System.out.println(
                "                       .-.\n" +
                "                      |_:_|\n" +
                "                     /(_Y_)\\\n" +
                ".                   ( \\/M\\/ )\n" +
                " '.               _.'-/'-'\\-'._\n" +
                "   ':           _/.--'[[[[]'--.\\_\n" +
                "     ':        /_'  : |::\"| :  '.\\\n" +
                "       ':     //   ./ |oUU| \\.'  :\\\n" +
                "         ':  _:'..' \\_|___|_/ :   :|\n" +
                "           ':.  .'  |_[___]_|  :.':\\\n" +
                "            [::\\ |  :  | |  :   ; : \\\n" +
                "             '-'   \\/'.| |.' \\  .;.' |\n" +
                "             |\\_    \\  '-'   :       |\n" +
                "             |  \\    \\ .:    :   |   |\n" +
                "             |   \\    | '.   :    \\  |\n" +
                "             /       \\   :. .;       |\n" +
                "            /     |   |  :__/     :  \\\\\n" +
                "           |  |   |    \\:   | \\   |   ||\n" +
                "          /    \\  : :  |:   /  |__|   /|\n" +
                "      snd |     : : :_/_|  /'._\\  '--|_\\\n" +
                "          /___.-/_|-'   \\  \\\n" +
                "                         '-'");

        System.out.println("Darth Vader captured you, you shouldn't have been a coward...");
    }

    public void ending() {
        System.out.println("Good job soldier, now leave, may the force be with you!");
        System.out.println("" +
                "                    ____\n" +
                "                 _.' :  `._\n" +
                "             .-.'`.  ;   .'`.-.\n" +
                "    __      / : ___\\ ;  /___ ; \\      __\n" +
                "  ,'_ \"\"--.:__;\".-.\";: :\".-.\":__;.--\"\" _`,\n" +
                "  :' `.t\"\"--.. '<@.`;_  ',@>` ..--\"\"j.' `;\n" +
                "       `:-.._J '-.-'L__ `-- ' L_..-;'\n" +
                "         \"-.__ ;  .-\"  \"-.  : __.-\"\n" +
                "             L ' /.------.\\ ' J\n" +
                "              \"-.   \"--\"   .-\"\n" +
                "             __.l\"-:_JL_;-\";.__\n" +
                "          .-j/'.;  ;\"\"\"\"  / .'\\\"-.\n" +
                "        .' /:`. \"-.:     .-\" .';  `.\n" +
                "     .-\"  / ;  \"-. \"-..-\" .-\"  :    \"-.\n" +
                "  .+\"-.  : :      \"-.__.-\"      ;-._   \\\n" +
                "  ; \\  `.; ;                    : : \"+. ;\n" +
                "  :  ;   ; ;                    : ;  : \\:\n" +
                " : `.\"-; ;  ;                  :  ;   ,/;\n" +
                "  ;    -: ;  :                ;  : .-\"'  :\n" +
                "  :\\     \\  : ;             : \\.-\"      :\n" +
                "   ;`.    \\  ; :            ;.'_..--  / ;\n" +
                "   :  \"-.  \"-:  ;          :/.\"      .'  :\n" +
                "     \\       .-`.\\        /t-\"\"  \":-+.   :\n" +
                "      `.  .-\"    `l    __/ /`. :  ; ; \\  ;\n" +
                "        \\   .-\" .-\"-.-\"  .' .'j \\  /   ;/\n" +
                "         \\ / .-\"   /.     .'.' ;_:'    ;\n" +
                "          :-\"\"-.`./-.'     /    `.___.'\n" +
                "                \\ `t  ._  / \n" +
                "                 \"-.t-._:'");
    }

    public void dead() {
        System.out.println("You Died.");
    }
}
