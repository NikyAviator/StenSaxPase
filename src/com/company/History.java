package com.company;

import java.util.ArrayList;

public class History {

    static ArrayList<String> history = new ArrayList<>();  //creating a static (so victories etc are saved in the list while the program is running)
    void history(){
        System.out.println("Showing History: ");
        for (int i = 0; i < history.size(); i++) {  //the loop counts all the history added when you have played
            System.out.println( history.get(i));  //prints the history list
        }
    }
}
