package com.sanvalero.fabricadecoches;

public class Main {
    public static void main(String[] args) {

    Turismo coche1 = new Turismo("7894LKJ");
    Industrial furgoneta1 = new Industrial("4659LXP");

    coche1.setClimatizador("no");
    coche1.setAutomatico("SI");
    coche1.setColor("Rojo");
    coche1.setDescapotable("no");
    coche1.setAsientosCuero("Si");

    furgoneta1.setBolaRemolque("si");
    furgoneta1.setClimatizador("si");
    furgoneta1.setAutomatico("no");

    //Pruebas Turismo
        System.out.println("Turismo con " + coche1.isClimatizador() + ", " + coche1.isAutomatico()
                + ", " + coche1.isDescapotable() + " y " + coche1.isAsientosCuero());
        System.out.println(coche1.getColor());

    //Pruebas Industrial
        System.out.println("Vehiculo Industrial con " + furgoneta1.isBolaRemolque()
                + ", " + furgoneta1.isAutomatico() + ", " +  furgoneta1.isClimatizador());
    }
}
