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

    //Setter y getter para cambiar color de un Turimo
    public void setColor(String colorCoche) {
        color = colorCoche;
    }

    public String getColor() {
        return "color del vehiculo: " + color;
    }

    //Setter y getter para extra descapotable
    public void setDescapotable(String descapotable) {
        if (descapotable.equalsIgnoreCase("si")) {
            this.descapotable=true;
        }else{
            this.descapotable=false;
        }
    }
    public String isDescapotable(){
        if (descapotable) {
            return "DESCAPOTABLE";
        }else {
            return "Capota SERIE";
        }
    }

    //Setter y getter para extra asientos de cuero
    public void setAsientosCuero(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero=true;
        }else{
            this.asientosCuero=false;
        }
    }
    public String isAsientosCuero() {
        if(asientosCuero){
            return "Asientos CUERO";
        }else{
            return "Asientos TELA";
        }
    }
}

