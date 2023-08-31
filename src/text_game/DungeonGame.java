package text_game;

import java.util.*;

public class DungeonGame {
    public static String playADungeonGame() {
        // System objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Game variables
        String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin "};
        int maxEnemyHealth = 75;
        int enemyAttackDaamge = 25;

        // Player variables
        int health = 100;
        int attackDamage = 50;
        int numberOfHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;

        boolean running = true;

        System.out.println("Welcome to the Dungeon!");

        GAME:
        while (running) {
            System.out.println("--------------------------------------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");
            
            while(enemyHealth > 0) {
            }
            System.out.println("\tYour HP " + health);
            System.out.println("\t" + enemy + "'s HP " + enemyHealth);
            System.out.println("\n\tWhat would you like to do? ");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink health potion");
            System.out.println("\t3. Run!");

        }




        return "\nEnjoy";
    }
}
