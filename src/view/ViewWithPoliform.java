/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Roland
 */
public abstract class ViewWithPoliform extends ViewWithPoliformForController{
    public abstract void init();
    public abstract void addController(ViewWithPoliformForController controller);
    public abstract void showNumber(boolean uj, int szam);
    @Override
    protected void doIgenyel(){}
}
