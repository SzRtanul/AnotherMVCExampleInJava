/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.RandomNumber;
import view.InterfaceForControllers;

/**
 *
 * @author Roland
 */
public final class ControllerWithInterface implements InterfaceForControllers{
    InterfaceForViews view;
    RandomNumber model;
    
    public ControllerWithInterface(RandomNumber model, InterfaceForViews view){
        this.model = model;
        this.view = view;
        view.addController(this);
        view.init();
        doIgenyel();
    }
    
    
    @Override
    public void doIgenyel() {
        view.showNumber(model.doIgenyel(), model.getKapottSzam());
    }
    
}
