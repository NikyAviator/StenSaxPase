package com.company;

import java.util.Scanner;

public class AfterGameMenu {
    Scanner input = new Scanner(System.in);

    void afterMatchMenu() {
        MainMenu mainMenu = new MainMenu();  //create an object of class MainMenu so that we can go back
        TheActualGame theActualGame = new TheActualGame(); //create an object of class TheActualGame so we can return to game()
        System.out.println("1. Menu 2. Play again 3. Close the game");
        int afterGameMenuChoice = input.nextInt();
        switch (afterGameMenuChoice) {
            case 1:             //case1 getting back to MainMenu
                mainMenu.Menu();
                break;
            case 2:             //case2 Play again!
                theActualGame.game();
                break;
            case 3:             //Closes the game

                break;
        }
    }
}
