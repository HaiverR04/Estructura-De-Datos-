/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio1arreglos;

/**
 *
 * @author USER
 */
public class Laboratorio1Arreglos {

    public static void main(String[] args) {
        int[] edades = {18, 22, 25, 30, 45};
        
        System.out.println("el arreglo tiene" + edades.length + "elementos.");
        System.out.println("primer valor:" + edades[4]);
        System.out.println("valor en la posicion 3:" + edades[3]);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("posicion" + (i +1) + ":" + edades[1]);
        }
        
        System.out.println("\nrecorrido con for-each");
        for (int edad : edades) {
            System.out.println(edad);
        }
    
    
    int [][] matriz = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
 };
   //System.out.prinl=tln(matriz[1][2]);//
       // for (int[] matriz1 : matriz) {
           // for (int j = 0; j < matriz1.length; j++) {
           //     System.out.println(matriz1[j] + " ");
           // }
        //}
        for (int fila=0; fila < matriz.length; fila++) {
            int sumarFila = 0;
            
            for (int columna = 0 ; columna<matriz[fila].length;columna ++){
                sumarFila +=matriz[fila][columna];
            }
            System.out.println("suma fila" + fila + " :" + sumarFila);
        }
         for (int columna = 0; columna< matriz [0].length;columna ++){
             int sumaColumna = 0;
             
            for (int[] matriz1 : matriz) {
                sumaColumna += matriz1[columna];
            }
             System.out.println("suma columna" + columna + " :" + sumaColumna);
         }
    }
}
    


