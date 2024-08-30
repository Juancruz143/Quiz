package org.example;

import java.util.List;

public class Pregunta {
    private String preguntas;
    private List<String> respuestas;
    private int respuestaCorrecta;

    public Pregunta(String preguntas, List<String> respuestas, int respuestaCorrecta) {
        this.preguntas = preguntas;
        this.respuestas = respuestas;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void mostrarPregunta() {
        System.out.println(preguntas);
        for (String respuestas : respuestas) {
            System.out.println(respuestas.indexOf(respuestas) + 1 + ". " + respuestas);
        }
    }
}


