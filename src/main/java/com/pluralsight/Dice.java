package com.pluralsight;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        //int rolled = roll();
        int roll1;
        int roll2;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.printf("Roll %d: %d - %d Sum: %d%n", i + 1, roll1, roll2, sum);
            if (sum == 2) {
                twoCounter += 1;
            } else if (sum == 4) {
                fourCounter += 1;
            } else if (sum == 6) {
                sixCounter += 1;
            } else if (sum == 7) {
                sevenCounter += 1;
            }

        }
        display(twoCounter);
        display(fourCounter);
        display(sixCounter);
        display(sevenCounter);
    }

    public static int roll(){
        int radomNumber = (int)(Math.random() * (6)) + 1;
        return radomNumber;
    }
    public static void display(int counter){
        System.out.println(counter);
    }

}
