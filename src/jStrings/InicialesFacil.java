package jStrings;

import libs.Input;

import java.sql.SQLOutput;

public class InicialesFacil {

    public static void main(String[] args)
    {
        String nombre;
        do{
            System.out.println("Indicame el Nombre del cual necesitas las iniciales: ");
            nombre = Input.get_string();
        } while (nombre==null);

        String[] nombreSep = nombre.split(" ");
        for(int i=0; i<nombreSep.length; i++){
            System.out.print(nombreSep[i].charAt(0));
        }
    }

}
