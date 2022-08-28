package com.sanvalero.fabricadecoches;

public class Main {
    public static void main(String[] args) {
    Turismo coche1 = new Turismo("7894LKJ");
    coche1.setClimatizador("no");
    coche1.setAutomatico("SI");
    coche1.setColor("Rojo");
    coche1.setDescapotable("no");
    coche1.setAsientosCuero("Si");

        System.out.println("Turismo con " + coche1.isClimatizador() + " " + coche1.isAutomatico()
                + " " + coche1.isDescapotable() + " y " + coche1.isAsientosCuero());
        System.out.println(coche1.getColor());
    }
}
