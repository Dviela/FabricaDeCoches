package com.sanvalero.fabricadecoches;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte opcion=0;
        Menu menu = new Menu();

        do { //Menú de opciones
            opcion=Byte.parseByte(JOptionPane.showInputDialog("MENÚ PRINCIPAL\n"
                    + "1. Crear nuevo vehículo TURISMO\n"
                    + "2. Crear nuevo vehículo INDUSTRIAL\n"
                    + "3. Ver vehiculos fabricados\n"
                    + "4. Salir\n" + "Elija la opción deseada"));


        switch(opcion){
            case 1:
                menu.crearTurismo();
                JOptionPane.showMessageDialog(null,"¡Vehiculo creado con exito! " + menu.getMatricula());  //Crear Turismo
                break;
            case 2:
                menu.crearIndustrial();
                JOptionPane.showMessageDialog(null,"¡Vehiculo creado con exito! " + menu.getMatricula());  //Crear Industrial
                break;
            case 3:
                JOptionPane.showMessageDialog(null,menu.getMatricula());  //Ver matricula de vehículo creado
                break;
            case 4:
                opcion=4;
                JOptionPane.showMessageDialog(null,"Saliendo"); //Opción para salir
                break;
            default:JOptionPane.showMessageDialog(null,"Opción invalida. Solo numeros del 1 al 4");
        }
        } while (opcion!=4);
        System.exit(0);



    }

}
/* PRUEBAS
     Turismo coche1 = new Turismo("7894LKJ");
    Turismo coche2 = new Turismo("7894LKJ");

    Industrial furgoneta1 = new Industrial("4659LXP");

    coche1.setClimatizador("no");
    coche1.setAutomatico("SI");
    coche1.setColor("Rojo");
    coche1.setDescapotable("no");
    coche1.setAsientosCuero("Si");

    furgoneta1.setBolaRemolque("si");
    furgoneta1.setClimatizador("si");
    furgoneta1.setAutomatico("no");
    furgoneta1.seleccionarCapacidadCarga();

    //Pruebas Turismo
        System.out.println("Turismo con " + coche1.isClimatizador() + ", " + coche1.isAutomatico()
                + ", " + coche1.isDescapotable() + " y " + coche1.isAsientosCuero());
        System.out.println(coche1.getColor());

    //Pruebas Industrial
        System.out.println("Vehiculo Industrial con " + furgoneta1.isBolaRemolque()
                + ", " + furgoneta1.isAutomatico() + ", " +  furgoneta1.isClimatizador());
        System.out.println("Vehiculo con " + furgoneta1.getCapacidadCarga());

        if (coche1.equals(coche2)){
            System.out.println("Es el mismo coche");
        }else {
            System.out.println("No es el mismo coche");
        }*/