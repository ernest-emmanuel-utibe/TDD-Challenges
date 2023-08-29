package conditional_statements;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        int choice;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n------Syntax Generator for -------");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for");
            System.out.println("    6. Exit the program");
            System.out.println("    Choose one:");
            choice = sc.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("The if:\n");
                    System.out.println("if(condition) statement;");
                    System.out.println("else statement;");
                }
                case 2 -> {
                    System.out.println("The switch:\n");
                    System.out.println("switch(expression) {");
                    System.out.println("  case constant:");
                    System.out.println("    statement sequence");
                    System.out.println("  break;");
                    System.out.println("  // ...");
                    System.out.println("}");
                }
                case 3 -> {
                    System.out.println("The while:\n");
                    System.out.println("while(condition) statement;");
                }
                case 4 -> {
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println("  statement;");
                    System.out.println("} while (condition);");
                }
                case 5 -> {
                    System.out.println("The for:\n");
                    System.out.print("for(init; condition; iteration)");
                    System.out.println(" statement;");
                }
                case 6 -> {
                    return;
                }
            }
        }
    }
}
