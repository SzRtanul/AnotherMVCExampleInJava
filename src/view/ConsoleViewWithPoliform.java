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
public class ConsoleViewWithPoliform extends ViewWithPoliform{
    Scanner sc = new Scanner(System.in);
    ViewWithPoliformForController controller;
    
    public void addController(ViewWithPoliformForController controller){
        this.controller = controller;
    }
    
    public ConsoleViewWithPoliform(){
        super();
        this.controller = this;
    }
    
    @Override
    public void showNumber(boolean uj, int szam) {
        System.out.print(uj ? "\u001B[31mEz egy új szám: "+ szam : String.format("\u001B[31m" + "Ez a régi szám: %d", szam));
        sc.nextLine();
        controller.doIgenyel();
    }

    @Override
    public void init() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
