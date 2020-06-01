package iLoops;

import libs.Input;

public class GatosDeMario1 {
    public static void main(String[] args) {
        dibujarPiramide(4);//5,3,10
    }

    public static void dibujarPiramide(int altura) {
        for (int i=1; i<=altura; i++){
            int numGatitos = i;
            int numEspacios = altura - numGatitos;
            dibujarLinea(numEspacios,numGatitos);
        }
    }

    public static void dibujarLinea(int numEspacios, int numGatitos) {
        for (int i = 0; i<numEspacios; i++){
            Input.print(" ");
        }
        for (int i=0; i<numGatitos;i++){
            Input.print("#");
        }
        for(int i=0;i<2;i++){
            Input.print(" ");
        }
        for(int i=0;i<numGatitos;i++){
            Input.print("#");
        }
        System.out.println();
    }
}
