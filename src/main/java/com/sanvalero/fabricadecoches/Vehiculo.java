package com.sanvalero.fabricadecoches;

abstract class Vehiculo {

    private int neumaticos, largo, ancho, motor, pesoPlataforma;
    private String matricula;
    private boolean climatizador, automatico;


    //Medidas y características comunes de todos los vehiculos de la fábrica
    public Vehiculo() {
        neumaticos = 4;
        largo = 4450;
        ancho = 1880;
        motor = 1600;
        pesoPlataforma = 450;

        //TODO getter y setter para establecer matricula y extras



        //TODO metodo Equals para evitar dos vehiculos con la misma matricula
    }
}