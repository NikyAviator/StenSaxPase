package com.company;

import java.util.Scanner;

public class TheActualGame {
    Scanner input = new Scanner(System.in); //scanner class for players choice
    String playerMove = "";  //initializing value for playerMove
    //String computerMove = "";  //initializing value for computerMove

    void game() {   //method for the game
        GameMechanics gameMechanics = new GameMechanics();

        System.out.println("What do you chose? ");  //what does the player chose
        System.out.println("1. Rock 2. Paper 3. Scissor");
        int playChoice = input.nextInt();  //saves our playerChoice (rock, paper or scissors)
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
        String move = "";

        if (playChoice == 1) {
            move = "Rock";
        } else if (playChoice == 2) {
            move = "Paper";
        } else if (playChoice == 3) {
            move = "Scissor";
        }

        return move;
    }
    //set the playerMove through determineValue method
    void setPlayerMove(int playChoice) {
        playerMove = determineValue(playChoice);  //changes the value of playerMove to an approriate RPS-value
    }
    String getPlayerMove() {  //method to display the playerMove
        return playerMove;
    }
}
