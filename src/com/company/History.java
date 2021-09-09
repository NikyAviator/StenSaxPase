package com.company;

import java.util.ArrayList;

public class History {

    static ArrayList<String> history = new ArrayList<>();
    void history(){
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
    }
}
