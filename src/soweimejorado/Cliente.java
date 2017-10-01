/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soweimejorado;

import java.util.Scanner;

/**
 *
 * @author JODAMU
 */
public class Cliente {
  String nombre;
   int edad;
   double  precioSanduche;
   Scanner sc=new Scanner(System.in);
   public void solicitarDatos(){
       System.out.println("****Escriba el nombre del cliente*****"); 
       nombre=sc.nextLine();
       System.out.println("****Escriba la edad del cliente*****"); 
       edad=sc.nextInt();
   }
   
 
   
   public String retornarNombre(){
       return nombre;
   }
   public int retornarEdad(){
       return edad;
   }
   
   
}
