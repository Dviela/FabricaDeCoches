package com.sanvalero.fabricadecoches;

public class Main {
    public static void main(String[] args) {
    Turismo coche1 = new Turismo("7894LKJ");
    coche1.setClimatizador("no");
    coche1.setAutomatico("si");
    coche1.setColor("Rojo");

        System.out.println("Turismo con " + coche1.isClimatizador() + " y " + coche1.isAutomatico());
        System.out.println(coche1.getColor());
    }
}
