package com.sanvalero.fabricadecoches;

public class Turismo extends Vehiculo {

    private boolean descapotable, asientosCuero;
    private String color;


    //Constructor con características específicas de los Turismos
    public Turismo(String matricula, boolean descapotable, boolean asientosCuero, String color) {
        super(matricula);
        this.descapotable = descapotable;
        this.asientosCuero = asientosCuero;
        this.color = color;
    }
    public Turismo(String matricula){
        super(matricula);
    }
        //TODO Getter y Setter para cambiar y poder ver color y extras


    }

