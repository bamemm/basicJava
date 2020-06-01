package gNumericTypes;

import libs.Input;

public class BotellasAgua {

    public static int get_positive_int()
    {
        int n;
        do
        {
            System.out.print("Proporciona por favor el numero de minutos que duras bañandote: ");
            n = Input.get_int();
        }
        while (n <= 0);
        return n;
    }
    public static void main(String[] args) {
        int minutos = get_positive_int();
        System.out.println("El número de botellas de agua que consumes al bañarte es de:"+ minutos * 12);
    }
}
