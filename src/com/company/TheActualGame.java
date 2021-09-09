package com.company;

import java.util.Scanner;

public class TheActualGame {
    Scanner input = new Scanner(System.in); //scanner class for players choice
    String playerMove = "";  //initializing value for playerMove

    void game() {   //method for the game
        GameMechanics gameMechanics = new GameMechanics();  //creates an object of the class GameMechanics

        System.out.println("What do you chose? ");  //what does the player chose
        System.out.println("1. Rock 2. Paper 3. Scissor");
        int playChoice = input.nextInt();  //TODO reads the playerchoice as an int and then calls method setPlayerMove
        switch (playChoice) {
            case 1:
                setPlayerMove(1);
                gameMechanics.comparer(getPlayerMove());
                break;
            case 2:
                setPlayerMove(2);
                gameMechanics.comparer(getPlayerMove());
                break;
            case 3:
                setPlayerMove(3);
                gameMechanics.comparer(getPlayerMove());
                break;
        }
    }
    public String determineValue(int playChoice) {  //method that determines our 1-3 input into a RPS-value
        String move = "";   //String is empty in the beginning

        if (playChoice == 1) {   //sets '1' to 'Rock'
            move = "Rock";
        } else if (playChoice == 2) {  //sets '2' to 'Paper'
            move = "Paper";
        } else if (playChoice == 3) {  //sets '3' to 'Scissor'
            move = "Scissor";
        }

        return move;  //returns the String values
    }
    //set the playerMove through determineValue method
    void setPlayerMove(int playChoice) {
        playerMove = determineValue(playChoice);  //changes the value of playerMove to an approriate RPS-value
    }
    String getPlayerMove() {  //method to display the playerMove
        return playerMove;
    }
}
