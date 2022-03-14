package com.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static int getRandomElement() {
        int max = 2;
        int min = 0;
        int choice =(int)(Math.random() * (max - min + 1) + min);
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choices[] = {"Rock", "Paper", "Scissors"};

        boolean flag = true;
        do{
            System.out.println("Enter your choice: ");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            int choice = sc.nextInt();
            choice = choice - 1;
            System.out.println("You chose " + choices[choice]);
            int computer = getRandomElement();
            System.out.println("Computer chose " + choices[computer]);
            if((choices[choice].equals("Rock") && choices[computer].equals("Scissors")) ||
                    (choices[choice].equals("Paper") && choices[computer].equals("Rock")) ||
                    (choices[choice].equals("Scissors") && choices[computer].equals("Paper"))){
                System.out.println("YOU WON!!!");
                flag = false;
            }
            if((choices[choice].equals("Scissors") && choices[computer].equals("Rock")) ||
                    (choices[choice].equals("Rock") && choices[computer].equals("Paper")) ||
                    (choices[choice].equals("Paper") && choices[computer].equals("Scissors"))){
                System.out.println("YOU LOST!!!");
                flag = false;
            }
        }while(flag);
    }
}
