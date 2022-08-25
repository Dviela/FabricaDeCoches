package com.sanvalero.fabricadecoches;

public class Turismo extends Vehiculo {

    private boolean descapotable, asientosCuero;
    private String color;

    
    //Constructor con características específicas de los Turismos
    public Turismo(boolean descapotable, boolean asientosCuero, String color) {
        this.descapotable = descapotable;
        this.asientosCuero = asientosCuero;
        this.color = color;

        //TODO Getter y Setter para cambiar y poder ver color y extras
    }
}
