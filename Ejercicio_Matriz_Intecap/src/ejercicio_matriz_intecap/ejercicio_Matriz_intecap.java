
package ejercicio_Matriz_intecap;

import java.util.Scanner;


public class ejercicio_Matriz_intecap {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[5][4];
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {

                Scanner sp= new Scanner(System.in);
                System.out.println("Ingrese 20 NUMEROS");
                int dato = sp.nextInt();
                matriz1[j] = dato;
            }
        }

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j]);
            }
            System.out.println();
        }

	}

}
