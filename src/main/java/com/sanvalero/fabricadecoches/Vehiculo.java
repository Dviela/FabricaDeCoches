package com.sanvalero.fabricadecoches;

abstract class Vehiculo {

    private int neumaticos, largo, ancho, motor, pesoPlataforma;
    private String matricula;
    private boolean climatizador, automatico;


    //Medidas y características comunes de todos los vehiculos de la fábrica
    public Vehiculo(String matricula) {
        this.matricula=matricula;
        neumaticos = 4;
        largo = 4450;
        ancho = 1880;
        motor = 1600;
        pesoPlataforma = 450;
    }
    //TODO getter y setter para establecer extras
    //Getter y setter del climatizador
    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
    public String isClimatizador() {
        if(climatizador == true){
            return "CLIMATIZADOR";
        }else{
            return "AIRE ACONDICIONADO";
        }
    }
    //Getter y setter de caja de cambios
    public void setAutomatico(String automatico) {
        if (automatico.equalsIgnoreCase("si")) {
            this.automatico = true;
        } else {
            this.automatico = false;
        }
    }
    public String isAutomatico() {
        if(automatico == true){
            return "CAMBIO AUTOMATICO";
        }else{
            return "CAMBIO MANUAL";
        }
    }

    //TODO metodo Equals para evitar dos vehiculos con la misma matricula

}