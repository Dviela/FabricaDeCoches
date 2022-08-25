package com.sanvalero.fabricadecoches;

public class Industrial extends Vehiculo{

    private boolean bolaRemolque;
    private int capacidadCarga;


    //Constructor con características específicas de los vehiculos industriales
    public Industrial(boolean bolaRemolque, int capacidadCarga) {
        this.bolaRemolque = bolaRemolque;
        this.capacidadCarga = capacidadCarga;

        //TODO Getter para datos del vehiculo
    }
}
