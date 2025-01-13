/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class ConsoleViewWithJustLittlePoliform {
    Scanner sc = new Scanner(System.in);
    ConsoleViewWithJustLittlePoliform controller;
    
    public ConsoleViewWithJustLittlePoliform() {
        controller = this;
    }
    
    public void addController(ConsoleViewWithJustLittlePoliform controller){
        this.controller = controller;
    }

    //View függvények
    public void showNumber(boolean uj, int szam){
        System.out.print(uj ? 
            "\u001B[32mEz egy új szám: %d".formatted(szam) :
            "\u001B[32mEz a régi szám: %d".formatted(szam));
        sc.nextLine();
        controller.doIgenyel();
    }
    
    //Controller függvények
    protected void doIgenyel(){} 
}
