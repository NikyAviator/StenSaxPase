package com.company;

public class Main {

    public static void main(String[] args) { //main method that we start the program from
        System.out.println("Welcome to ROCK PAPER SCISSORS!"); //initial greeting
        MainMenu mainMenu = new MainMenu();  //created a new object of MainMenu class
        mainMenu.Menu();  //invoking Menu method

    }
}
