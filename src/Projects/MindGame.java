package Projects;

import java.util.Random;
import java.util.Scanner;

public class MindGame {

    public static void main(String[] args) {

        Random obj = new Random();
        int randomNum = obj.nextInt(0, 100);
//        System.out.println(randomNum);

        int attempt = 0;

        System.out.println("Enter a number:");

        while (true) {

            int userInput = new Scanner(System.in).nextInt();
            attempt++;

            if (userInput == randomNum) {

                System.out.println("Congratulation!!!");
                System.out.println("You are correct!!!");
                if (attempt <= 10) {
                    System.out.println("(God!!)");
                } else if (attempt <= 20) {
                    System.out.println("(Excellent!!)");
                } else if (attempt <= 30) {
                    System.out.println("(Nice!!)");
                } else if (attempt <= 40) {
                    System.out.println("(Cool!!)");
                } else if (attempt <= 50) {
                    System.out.println("(Good..)");
                } else if (attempt <= 60) {
                    System.out.println("(Not Bad...)");
                } else if (attempt <= 80) {
                    System.out.println("(Dumb Ass!!)");
                } else if (attempt <= 100) {
                    System.out.println("(Stupid!!)");
                }
                break;

            } else {

                System.out.println("Oops! You are wrong, try again");
                System.out.println("Enter a number: ");

            }

            if (userInput < randomNum) {
                System.out.println("*The answer is greater than yours*");
            } else if (userInput > randomNum) {
                System.out.println("*The answer is less than yours*");
            }

        }
    }
}
