package com.company;

import java.util.Scanner;

public class MainMenu {
    Scanner input = new Scanner(System.in); //Created the first object of the Scanner class
    int menuChoice = 0;
    History history = new History();  //Create an object of the class 'History'
    void Menu() {    //created a method for Class
        TheActualGame theActualGame = new TheActualGame(); //created a new object of TheActualGame called theActualGame

        System.out.println("Choose one of the following alternatives and press ENTER: ");  //Initial text for choice
        System.out.println("1. New Match 2. History 3. Close the game");  //printing our options
        menuChoice = input.nextInt();  //the choices we make are saved in menuChoice
        switch (menuChoice) {    //a switch for players choice in the Menu
            case 1:
                theActualGame.game();   //invokes the game() method from TheActualGame class
                break;
            case 2:
                history.history(); //invokes the history () method from the History class
                Menu();
                break;

            case 3:
                System.out.println("Quitting game");  //If we press '3' we terminate the game with a String that is printed
                break;
            default:
                System.out.println("Invalid Input");  //if we press anything else than 1-3 we get a text and we invoke Menu() method.
                Menu();
                break;
        }

    }


}
