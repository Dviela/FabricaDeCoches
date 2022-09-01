package com.sanvalero.fabricadecoches;

import java.util.Objects;

abstract class Vehiculo {

    private final int neumaticos,  motor, pesoPlataforma;
    private final float largo, ancho;
    private final String matricula;
    private boolean climatizador, automatico;


    //Medidas y características comunes de todos los vehiculos de la fábrica
    public Vehiculo(String matricula) {
        this.matricula=matricula;
        neumaticos = 4;
        largo = 4.45f;
        ancho = 1.88f;
        motor = 1600;
        pesoPlataforma = 450;
    }

    //Getter y setter del climatizador
    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
    public String isClimatizador() {
        if(climatizador){
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
        if(automatico){
            return "CAMBIO AUTOMATICO";
        }else{
            return "CAMBIO MANUAL";
        }
    }

    //Metodo Equals para evitar dos vehiculos con la misma matricula

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return matricula.equals(vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}