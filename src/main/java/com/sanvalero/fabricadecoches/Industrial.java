package com.sanvalero.fabricadecoches;

import java.util.Scanner;

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

    //Capacidad de carga
    public void seleccionarCapacidadCarga() {
        Scanner sn = new Scanner(System.in);

        do {
            System.out.println("1. 450Kg \n2. 750Kg \n3. 3.500Kg");
            System.out.print("Elegir capacidad de carga: ");
            capacidadCarga = sn.nextInt();


            switch (capacidadCarga) {
                case 1:
                    System.out.println("450Kg");
                    break;
                case 2:
                    System.out.println("750Kg");
                    break;
                case 3:
                    System.out.println("3.500Kg");
                    break;
                default:
                    System.out.println("Solo números del 1 al 3");
            }
        } while (capacidadCarga!=1 && capacidadCarga!=2 && capacidadCarga!=3);

    }

    public String getCapacidadCarga() {
        if (capacidadCarga == 1) {
            return "Capacidad de carga de 450Kg";
        }
        if (capacidadCarga == 2) {
            return "Capacidad de carga de 750kg";
        }
        if (capacidadCarga == 3) {
            return "Capacidad de carga de 3.500Kg";
        } else {
            return "Capacidad de carga de SERIE";
        }

    }
}
