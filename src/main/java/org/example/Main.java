package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.File;
import java.io.FileNotFoundException
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<Quiz> preguntas = new ArrayList<>();
        try {
            File myObj = new File("src/main/resources/preguntas");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                preguntas.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
        for (String pregunta : preguntas) ;

        }
         Quiz.iniciarQuiz();
    }
}