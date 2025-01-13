/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import view.InterfaceForControllers;

/**
 *
 * @author Roland
 */
public interface InterfaceForViews{
    public void addController(InterfaceForControllers controller);
    public void init();
    public void showNumber(boolean uj, int szam);
}
