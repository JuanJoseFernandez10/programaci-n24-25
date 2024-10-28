/*
 * Boletin5_Ejercicio5ºº
 * Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante su
   combinación secreta, que está formado por una combinación de dígitos del uno al cinco.
   El jugador especificará cuál es la longitud de la combinación, a mayor longitud mayor
   será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación
   secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para
   cada dígito de la combinación introducido por el jugador,
 */
package boletin5_ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuarioDAW
 */
public class Boletin5_ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud de la contraseña de la tabla, que sera la dificultad del juego");
        int longitud = sc.nextInt();
        int[] tabla_intento = new int[longitud];
        //tabla secreta
        int[] tabla_secreta = CrearTablaSecreta(longitud);
        //buclñe tabla de intentos
        for(int i = 0 ; i < tabla_intento.length;i++){
        System.out.println("Dime cual seria la contraseña de la camara");
        tabla_intento[i] = sc.nextInt();
        }
           System.out.println(Arrays.toString(tabla_intento));
           System.out.println(Arrays.toString(tabla_secreta));
      //bucle para adivinar contraseña
        while(!Arrays.equals(tabla_intento, tabla_secreta)){
            //bucle para encontrar similitudes entre Arrays
           for(int n= 0; n < longitud; n++){
            //condicion de posicion 3
            if(tabla_intento[n] > tabla_secreta[n]){
                System.out.print(">");
                
            }else if(tabla_intento[n] < tabla_secreta[n]){
                System.out.print("<");
                
            }else{
                System.out.print("=");
                
            }
            
           }//fin bucle for para enconrta similitudes en la Arrays
        }//fin bucle principal while
    }
    
    public static int[]CrearTablaSecreta(int longitud){
    
        int[] tabla = new int [longitud];
        for(int i = 0; i < tabla.length; i++){
           tabla[i] = (int)(Math.random()*5) + 1;         
        }
        return tabla;
    }
    
}
