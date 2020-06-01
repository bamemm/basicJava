package jStrings;

import libs.Input;

public class InicialesDificil {

    public static void main(String[] args) {
        String nombre;
        String nombreNuevo="";
        int contador=0;

        do {
            System.out.println("Indicame el Nombre del cual necesitas las iniciales: ");
            nombre = Input.get_string();
        } while (nombre == null);

        for (int i=0;i<nombre.length();i++){
            char c=nombre.charAt(i);
            boolean isAlpha=Character.isAlphabetic(c);
            if(isAlpha){
                nombreNuevo= nombreNuevo+""+nombre.charAt(i);
                contador=0;
            }
            else
                if(nombre.charAt(i) ==' ' && contador==0) {
                    contador++;
                    nombreNuevo= nombreNuevo +""+nombre.charAt(i);

                }


            }
        System.out.println(nombreNuevo);
        String[] nombreFin = nombreNuevo.split(" ");
        for(int i=0; i<nombreFin.length; i++){
            System.out.print(nombreFin[i].charAt(0));
        }

    }

}

