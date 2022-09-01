package com.sanvalero.fabricadecoches;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    private String matricula;

    public void crearTurismo(){ //Metodo para crear Turismos

        matricula= JOptionPane.showInputDialog("Introduzca la matricula del nuevo TURISMO");
        ArrayList <Turismo> listaTurismos=new ArrayList<Turismo>();
        listaTurismos.add(new Turismo(matricula));
    }
    public void crearIndustrial(){ //Metodo para crear v. Industriales

        matricula= JOptionPane.showInputDialog("Introduzca la matricula del nuevo vehiculo INDUSTRIAL");
        Industrial furgoneta = new Industrial(matricula);
    }

    public String getMatricula() { //Get para devolver matricula de vehiculo creado
        return "Matricula: " + matricula;
    }





}
