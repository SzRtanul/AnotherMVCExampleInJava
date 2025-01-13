/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.InterfaceForViews;
import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class ConsoleViewWithInterface  implements InterfaceForViews{
    Scanner sc = new Scanner(System.in);
    InterfaceForControllers controller;
    
    public void addController(InterfaceForControllers controller){
        this.controller = controller;
    }
    
    @Override
    public void showNumber(boolean uj, int szam) {
        System.out.print(uj ? 
            "\u001B[32mEz egy új szám: %d".formatted(szam) :
            "\u001B[32mEz a régi szám: %d".formatted(szam));
        sc.nextLine();
        controller.doIgenyel();
    }

    @Override
    public void init() {

    }
}
