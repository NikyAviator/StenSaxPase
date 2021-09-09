package com.company;

import java.util.Scanner;

public class MainMenu {
    Scanner input = new Scanner(System.in); //Created the first scanner class
    int menuChoice = 0;
    void Menu() {    //created a method for Class
        TheActualGame theActualGame = new TheActualGame(); //created a new object of TheActualGame called theActualGame

        System.out.println("Choose one of the following alternatives and press ENTER: ");  //Initial text for choice
        System.out.println("1. New Match 2. History 3. Close the game");
        menuChoice = input.nextInt();  //the choices we make are saved in menuChoice
        switch (menuChoice) {    //a switch for players choice in the Menu
            case 1:
                theActualGame.game();
                break;
            case 2:
                //TODO HISTORY
                break;

            case 3:
                //TODO AVSLUTA SPELET
                break;
        }

    }


}
