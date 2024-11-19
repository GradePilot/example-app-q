package org.example;

import java.time.LocalDate;

public class App{

    public int add(int x, int y){
        return x+y;
    }

    public static void main(String[]args){
        App app = new App();
        app.add(2,3);
    }
}
