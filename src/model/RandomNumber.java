/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Roland
 */
public final class RandomNumber {
    int szamigenyles;
    int kapottszam;
    
    public RandomNumber(){
        doNullaz();
        doIgenyel();
    }
    
    private void doNullaz(){
        szamigenyles = 0;
        szamigenyles = 0 + ((int)(Math.random() * 0x4) << 16);
    }
    
    public boolean doIgenyel(){
        boolean both = false;
        if((getIgenyles() ^ getSzuksegesIgenyles()) == 0){
            this.kapottszam = (int)(Math.random() * 0xFFFFFFF);
            doNullaz();
            both = true;
        }
        else{
            szamigenyles++;
        }
        return both;
    }
    
    private int getSzuksegesIgenyles(){
        return (szamigenyles >> 16) & ((1 << 16)-1);
    }
    
    public int getIgenyles(){
        return szamigenyles & ((1<<16) -1);
    }
    
    public int getKapottSzam(){
        return kapottszam;
    }
}
