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
            switch (sum){
                case 2 -> twoCounter+=1;
                case 4 -> fourCounter+=1;
                case 6 -> sixCounter+=1;
                case 7 -> sevenCounter+=1;
            }
        }
        display("The number of sums equals to two is: " ,twoCounter);
        display("The number of sums equals to four is: ", fourCounter);
        display("the number of sums equals to six is: ", sixCounter);
        display("The number of sums euquals to seven is: ", sevenCounter);
    }

    public static int roll(){
        int radoNumber = (int)(Math.random() * (6-1+1)) + 1;
        return radoNumber;
    }
    public static void display(String name, int counter) {
        System.out.println(name + counter);
    }

}
