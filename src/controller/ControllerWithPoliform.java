/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.RandomNumber;
import view.GUIViewWithPoliform;
import view.ViewWithPoliform;
import view.ViewWithPoliformForController;

/**
 *
 * @author Roland
 */
public class ControllerWithPoliform extends ViewWithPoliformForController{
    RandomNumber model;
    ViewWithPoliform view;
    
    public ControllerWithPoliform(RandomNumber model, ViewWithPoliform view){
        this.model = model;
        this.view = view;
        view.showNumber(model.doIgenyel(), model.getKapottSzam());
    }

    @Override
    public void doIgenyel() {
        view.showNumber(model.doIgenyel(), model.getKapottSzam());
    }
}
