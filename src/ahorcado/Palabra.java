/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Palabra {

    String Palabras[] = {"cacao", "dolor", "carne", "afecto", "nacer", "morir", "vivir", "obeso", "raton", "radio", "volar", "calvo", "soñar"};

    String palabraEscogida;
    String EscojerPalabra() {
        Random Aleatoria = new Random();
        int posicion = Aleatoria.nextInt(11);
        palabraEscogida= Palabras[posicion];
        return Palabras[posicion];
    }

    int numerodeceldas() {
         
        char letra=palabraEscogida.charAt(4);
         return palabraEscogida.length();
         
         
    }
}


