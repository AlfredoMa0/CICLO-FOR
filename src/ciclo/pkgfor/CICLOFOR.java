/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class CICLOFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Suma();    
    factorial();
    factorialPorteclado(); 
    Lamedia();
    EJERCICIO5();
    EJERCICIO6();
    EJERCICIO7();
    EJERCICIO8();
    }
    public static void Suma(){
        System.out.println("--------EJERCICIO 1----------");
        
       int suma=0;
       int valor= 0;
        for (int i = 0; i <=10; i++) {
            suma += valor ; 
            valor++;
            System.out.println(" LA SUMA ES: " + suma);
            
        }
    } 
    public static void factorialPorteclado(){
        System.out.println("------EJERCICIO 3---------");
        
        int factorial =1;
        Scanner Leer =new Scanner(System.in);
        System.out.println(" INGRESA UN  VALOR: ");
        int k = Leer.nextInt();
        for (int i = 1; i <= k; i++) {
            factorial = factorial * i;
            System.out.println(" EL FATORIAL ES " + k + " ES: " + factorial);
        }
         
}
    public static void factorial() {
        System.out.println("------EJERCICIO 2--------");
        Scanner Leer =new Scanner(System.in);
        System.out.println(" INGRESA UN NUMERO DEL 1 AL 10: ");
       
        int numero = Leer.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            System.out.println(" EL FATORIAL DE " + numero + " ES: " + factorial);
        }
}
public static void Lamedia(){
    System.out.println("---------EJERCICIO 4-------");
    int numeroI = 0;
    int suma = 0;
    int media =0;
    Scanner Leer = new Scanner(System.in);
    System.out.println("INGRESA UN NUMERO: ");
    int numero = Leer.nextInt();
    
    for (int i=1; i <=numero; i++) {
        System.out.print("Nº" + i + ": ");
        numeroI = Leer.nextInt();
        suma = suma + numeroI;
    }
    media =(suma / numero);
    System.out.println("LA MEDIA ES:  " + media);
    }    
  
   public static void EJERCICIO5(){
   Scanner teclado= new Scanner(System.in);
        int x[],mayor,menor;
        int promedio;
        int n;
        int suma=0;
        int distancia=0;
        System.out.println("CANTIDAD DE NUMEROS:");
        n= teclado.nextInt();    
        x= new int[n];
         System.out.println("LOS NUMEROS SON:");
         for(int i=0;i<n;i++){
             System.out.print("Nº" + i + ": ");
             x[i]= teclado.nextInt();
         }
         mayor=menor=x[0];
         for(int i=0;i<n;i++)
             if(x[i]>mayor)
                 mayor=x[i];
         else
                 if(x[i]<menor)
                     menor=x[i];
         for(int i=0;i<n;i++)
             suma= x[i]+suma;
             promedio= suma/n;
             distancia = n;
         System.out.println("LA SUMA ES :" + suma); 
         System.out.println("EL PROMEDIO ES: " + promedio);
         System.out.println("NUMERO MAYOR ES :" + mayor);
         System.out.println("NUMERO MENOR ES :" + menor);
         System.out.println("LA DISTANCIA ES : " + distancia);
                                                                                            
    }  
   
public static void EJERCICIO6(){
    System.out.println("--------EJERCICIO 6-----------");
    int i;
  String Cadena = "Lunes Martes Miercoles Jueves Viernes Sabado Domingo";
   String[] Dias = Cadena.split(" ");
    for (i = 0; i < Dias.length; i++) {
        System.out.println("POSICION["+i+"]: " + Dias[i]);
        
    }
    
    
}
 public static void EJERCICIO7(){
     System.out.println("------------EJERCICIO 7------------");
  
    String[][] Personajes = new String[3][3];
    Personajes[0][0]="Darth Vader";
    Personajes[0][1]="Luke Skywalker";
    Personajes[0][2]="Yoda";
    Personajes[1][0]="Chewbacca";
    Personajes[1][1]="R2-D2";
    Personajes[1][2]="Obi-Wan Kenobi";
    Personajes[2][0]="Anakin Skywaler";
    Personajes[2][1]="Obi-Wan Kenobi";
    Personajes[2][2]="Anakin Skywaler";
     for (int i = 0; i < Personajes.length; i++) {
         for (int j = 0; j < Personajes.length; j++) {
          System.out.println("PERSONAJE " + i + "  " +j+" : " + Personajes[i][j]);       
         }
     } 
 }  
 public static void EJERCICIO8(){
     System.out.println("---------EJERCICIO 8-----------");
     int matriz [][]= new int[3][3];
     matriz [0][0]=9;
     matriz [0][1]=8;
     matriz [0][2]=6;
     matriz [1][0]=1;
     matriz [1][1]=5;
     matriz [1][2]=2;
     matriz [2][0]=7;
     matriz [2][1]=0;
     matriz [2][2]=4;
     for (int i = 0; i < 16; i++) {
         for (int j = 0; j < 3; j++) {   
         }
     }
     System.out.println("MATIZ DE 3X3: ");
     System.out.println("|" + matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + "|");
     System.out.println("|" + matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + "|");
     System.out.println("|" + matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + "|");
     }
 
}
