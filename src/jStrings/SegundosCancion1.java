package jStrings;

import libs.Input;

public class SegundosCancion1 {

    public static void main(String[] args)
    {
        System.out.println("Dame la duracion de la canción en segundos :");
        int duracion = Input.get_int();
        int minutos = duracion/60;
        int segundos = duracion%60;

        System.out.println("La cancion dura " +minutos + " minutos y " +segundos + " segundos");

    }
}
