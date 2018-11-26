package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int secretvalue = 65;
        int guesscount = 10;

        while (guesscount > 0){

            System.out.println("Please guess a number between 1 to 100");
            System.out.println("you have" + guesscount + "guesses left");

            int usersGuess = getInput.nextInt();

            if(usersGuess == secretvalue){
                System.out.println("Congrats! you got it! :)");
                break;

            }
            guesscount--;


        }







    }
}
