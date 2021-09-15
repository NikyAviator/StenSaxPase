package com.company;

import java.util.Scanner;

public class TheActualGame {
    Scanner input = new Scanner(System.in); //scanner class for players choice
    String playerMove = "";  //initializing value for playerMove, also this is where "move" is returned as a String

    void game() {   //method for the game
        GameMechanics gameMechanics = new GameMechanics();  //creates an object of the class GameMechanics

        System.out.println("What do you chose? ");  //Prints message for our options
        System.out.println("1. Rock 2. Paper 3. Scissor");  //here are the options
        int playChoice = input.nextInt();  // saves the value that we chose as 'playChoice'
        switch (playChoice) { //switch case for all the RPS-values
            case 1:
                setPlayerMove(1);  //invokes setPlayerMove() method sends value '1'.    1.
                gameMechanics.comparer(getPlayerMove());  // I invoke method comparer() and send the String value from getPlayerMove(), witch decides who wins and who loses, results are saved in history
                break;
            case 2:
                setPlayerMove(2);
                gameMechanics.comparer(getPlayerMove());                    //5.
                break;
            case 3:
                setPlayerMove(3);
                gameMechanics.comparer(getPlayerMove());
                break;
            default:
                System.out.println("Invalid Input");
                game();
                break;
        }
    }
    public String determineValue(int playChoice) {  //method that determines our 1-3 input into a RPS-value    3.
        String move = "";   //String is empty in the beginning

        if (playChoice == 1) {   //sets '1' to 'Rock'
            move = "Rock";
        } else if (playChoice == 2) {  //sets '2' to 'Paper'
            move = "Paper";
        } else if (playChoice == 3) {  //sets '3' to 'Scissor'
            move = "Scissor";
        }

        return move;  //returns the String value
    }
    //set the playerMove through determineValue method
    void setPlayerMove(int playChoice) {   //                                             2.
        playerMove = determineValue(playChoice);  //saves our input (1-3) as playerMove and is sent to determineValue() method as an argument
    }
    String getPlayerMove() {  //getplayerMove() returns the RPS-value as a String.      4.
        return playerMove;
    }
}
