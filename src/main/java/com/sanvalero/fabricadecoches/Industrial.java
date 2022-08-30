package com.sanvalero.fabricadecoches;

public class Industrial extends Vehiculo {

    private boolean bolaRemolque;
    private int capacidadCarga;


    //Constructor con características específicas de los vehiculos industriales
    public Industrial(String matricula, int capacidadCarga) {
        super(matricula);
        this.capacidadCarga = capacidadCarga;
    }

    public Industrial(String matricula) {
        super(matricula);
    }
    //TODO Getter para datos del vehiculo

    //Getter y setter para bola de remolque
    public void setBolaRemolque(String bolaRemolque) {
        if (bolaRemolque.equalsIgnoreCase("si")) {
            this.bolaRemolque = true;
        } else {
            this.bolaRemolque = false;
        }
    }

    public String isBolaRemolque() {
        if (bolaRemolque == true) {
            return "BOLA DE REMOLQUE";
        } else {
            return "SERIE";
        }
    }

}
