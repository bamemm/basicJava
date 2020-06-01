package jStrings;

import libs.Input;

public class SegundoCancion
{
    public static void main(String[] args) {

        do {
            System.out.println("Dame la duracion de la canción en formato (mm:ss) :");
            String duracion = Input.get_string();

            int mins = 0;
            int segs = 0;

            String[] minutos = duracion.split(":");
            if (minutos.length == 2) {
                try {
                    mins = Integer.parseInt(minutos[0]);
                    segs = Integer.parseInt(minutos[1]);
                    if (segs < 0 || segs >= 60) {
                        System.out.println("Cantidad de segundo incorrecta");
                    } else {
                        System.out.println("La duracion total en segundo de esta cancion es :" + (mins * 60 + segs));
                        break;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Error en el formato, el formato correcto es mm:ss");
                }
            }
            else
                {
                    System.out.println("Formato incorrecto...");
                }

        } while (true);
    }
}
