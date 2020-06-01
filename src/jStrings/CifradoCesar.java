package jStrings;

import libs.Input;

import java.sql.SQLOutput;

public class CifradoCesar {

    public static void main(String[] args) {

        System.out.println("Introduce el mensaje:");
        String mensaje = Input.get_string();

        System.out.println("Introduce la clave:");
        int clave = Input.get_int();
        clave%=26;
        System.out.println("Mensaje Cifrado: ");
        for(int i=0; i<mensaje.length();i++){
            if(mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z'){
                char actual = mensaje.charAt(i);
                int suma = actual + clave;
                if (suma > 90){
                    suma = suma - 26;
                }
                char desencripta = ((char) suma);
                System.out.print(desencripta);
            }
            else{
                System.out.print(mensaje.charAt(i));
            }
        }
    }
}
