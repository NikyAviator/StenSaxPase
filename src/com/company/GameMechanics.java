package com.company;

import java.util.Random;

public class GameMechanics {
    Random random = new Random();  //creates a random Class that will random the computers choice (1-3)
    AfterGameMenu afterMatchMenu = new AfterGameMenu(); //creates an object of AfterGameMenu so that we have different choices
    History history = new History(); //objectet för history

    public void comparer(String playerMove) {
        String computerMove = setComputerMove();

        if (playerMove.equals(computerMove)) {  //IF EVEN
            System.out.println(" ");  //line for easier reading
            System.out.println("The game is even!");
            history.history.add("EVEN");
            System.out.println(" "); //creating an empty line for easier reading
            afterMatchMenu.afterMatchMenu();
        } else if (playerMove.equals("Rock") && computerMove.equals("Scissor")  //IF PLAYER WINS
                || playerMove.equals("Paper") && computerMove.equals("Rock")
                || playerMove.equals("Scissor") && computerMove.equals("Paper")) {
            System.out.println(" "); //line for easier reading
            System.out.println("You win!");
            history.history.add("WIN");
            System.out.println(" "); //creating an empty line for easier reading
            afterMatchMenu.afterMatchMenu();
        } else {                                                             //IF WE LOSE
            System.out.println(" ");  //line for easier reading
            System.out.println("YOU LOST!");
            history.history.add("LOSS");  //line for easier reading
            System.out.println(" ");  //line for easier reading
            afterMatchMenu.afterMatchMenu();
        }

    }
    String setComputerMove() {
        TheActualGame theActualGame = new TheActualGame();  //creating object of the class TheActual Game class, so we can determine computer value
        int computerChoice = 1 + random.nextInt(3); //1 + is that the computer does not random '0'
        return theActualGame.determineValue(computerChoice); //returns the move as a String
    }

}