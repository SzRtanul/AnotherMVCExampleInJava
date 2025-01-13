/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ControllerWithInterface;
import controller.ControllerWithPoliform;
import controller.ControllerWithoutInterfaceJustALittlePoliform;
import model.RandomNumber;
import view.ConsoleViewWithInterface;
import view.ConsoleViewWithJustLittlePoliform;
import view.ConsoleViewWithPoliform;
import view.GUIViewWithInterface;
import view.GUIViewWithPoliform;
import view.ViewWithPoliform;

/**
 *
 * @author Roland
 */
public class AnotherMVCExampleIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new ControllerWithPoliform(new RandomNumber(), new ConsoleViewWithPoliform());
        // new ControllerWithInterface(new RandomNumber(), new GUIViewWithInterface());
        // new ControllerWithInterface(new RandomNumber(), new ConsoleViewWithInterface());
        new ControllerWithoutInterfaceJustALittlePoliform(new RandomNumber(), new ConsoleViewWithJustLittlePoliform());
    }
    
}
