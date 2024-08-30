package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Pregunta> preguntas;
    private int puntaje;
    private Scanner scanner = new Scanner(System.in);
    public Quiz() {
        preguntas = new ArrayList<Pregunta>();
        puntaje = 0;
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public void evaluarpregunta(int indicePregunta,int respuestaUsuario){
        if (preguntas.get(indicePregunta).getRespuestaCorrecta() == respuestaUsuario){
            puntaje++;
        }
    }

    public void mostrarPreguntas() {
        System.out.println("Su puntaje es: " + puntaje);
    }

    public void realizarPregunta(int indicePregunta){
       preguntas.get(indicePregunta).mostrarPregunta();
        System.out.println("Indique su  respuesta; ");
        int respuestaUsuario = Integer.parseInt(scanner.nextLine());
        evaluarpregunta(indicePregunta,respuestaUsuario);
        mostrarPuntaje();

    }

}



