/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.RandomNumber;
import view.ConsoleViewWithJustLittlePoliform;

/**
 *
 * @author Roland
 */
public final class ControllerWithoutInterfaceJustALittlePoliform extends ConsoleViewWithJustLittlePoliform{
    RandomNumber model;
    ConsoleViewWithJustLittlePoliform view;
    
    public ControllerWithoutInterfaceJustALittlePoliform(RandomNumber model, ConsoleViewWithJustLittlePoliform view){
        this.model = model;
        this.view = view;
        view.addController(this);
        doIgenyel();
    }
    
    @Override
    public void doIgenyel(){
        view.showNumber(model.doIgenyel(), model.getKapottSzam());
    }
}
