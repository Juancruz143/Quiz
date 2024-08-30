package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> respuesta1 = new ArrayList<String>();
        respuesta1.add("Negro");
        respuesta1.add("Verde");
        respuesta1.add("Blanco");
        respuesta1.add("Ninguno");
        Pregunta pregunta1 =
                new Pregunta("De que color era el caballo blanco de san martin",
                        respuesta1,3);
        quiz.agregarPregunta(pregunta1);

        pregunta1.mostrarPregunta();

    }
}