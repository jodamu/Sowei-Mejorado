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
public class Preparacion { //declaro variables para almacenar la eleccion del sanduche en numeros
        int tipoPan, tipoCarne, acompanante;
        //declaro variables para almacenar la eleccion del sanduche en letras. Las inicializo con un valor vacio
        String nombrePan = "";
        String nombreCarne = "";
        String nombreAcomp = "";
        //declaro variables para almacenar los datos del cliente
        String nombre;
        int edad;
        // declaro variables para almacenar datos de la factura y precios
        
        double precioSanduche, totalAPagar;
        int numFactura;
        
       
    public void crear(){
       int continuar=1;

        System.out.println("\t\t\t******************SOWEI*******************");

        //imprimo el menu para el tipo de pan
        Scanner sc = new Scanner(System.in);
     do{
         if(tipoPan>2){
             System.out.println("OPCION NO VALIDA. INTENTE DE NUEVO");
         }
        System.out.println("\n==============================================================");
        System.out.println("\nTIPO DE PAN. Escriba el número del producto con el teclado.\n");
        System.out.println("==============================================================");
        System.out.println("\n1. Pan tradicional \n2. Pan con Orégano");
        //capturo el tipo de pan ingresado por teclado(numero) y lo almaceno en la variable tipoPan
         tipoPan = sc.nextInt();
         
     }while(tipoPan>2);
        
        //validaciones para saber el tipo de pan en letras
        switch (tipoPan) {
            case 1:
                nombrePan = "Pan Tradicional ";
                break;
            case 2:
                nombrePan = "Pan con Orégano ";
                break;
        }

        //imprimo el menu para el tipo de carne
        do{
         if(tipoCarne>3){
             System.out.println("OPCION NO VALIDA. INTENTE DE NUEVO");
         }
        System.out.println("==========================================================");
        System.out.println("\nCARNE. Escriba el número del producto con el teclado.\n");
        System.out.println("=========================================================");
        System.out.println("\n1. Jamón, \n2. Pollo, \n3. Pavo.");
        //capturo el tipo de carne ingresado por teclado(numero) y lo almaceno en la variable tipoCarne
        tipoCarne = sc.nextInt();

     }while(tipoCarne>3);
        
        //validaciones para saber el tipo de carne en letras
        switch (tipoCarne) {
            case 1:
                nombreCarne = "   Jamón ";
                break;
            case 2:
                nombreCarne = "   Pollo ";
                break;
            case 3:
                nombreCarne = "   Pavo ";
                break;
        }
         do{
         if(acompanante>3){
             System.out.println("OPCION NO VALIDA. INTENTE DE NUEVO");
         }
        //imprimo el menu para el tipo de acompañante
        System.out.println("=================================================================");
        System.out.println("\nACOMPAÑANTES. Escriba el número del producto con el teclado.\n");
        System.out.println("================================================================");
        System.out.println("\n1. Queso, \n2. Mayonesa, \n3. Verdura.");
        //capturo el tipo de acompanante ingresado por teclado(numero) y lo almaceno en la variable acompanante
        acompanante = sc.nextInt();

     }while(acompanante>3);
        //validaciones para saber el tipo de acompañante en letras 
        switch (acompanante) {
            case 1:
                nombreAcomp = "   Queso ";
                break;
            case 2:
                nombreAcomp = "   Mayonesa ";
                break;
            case 3:
                nombreAcomp = "   Verdura ";
                break;
        }
    }
    public double valor(){
        // Agrego condiciones paa conocer el precio del sanduche de acuerdo a las elecciones en numero
        if (tipoPan == 1 && tipoCarne == 1 && acompanante == 1) {
            precioSanduche = 8550;
        } else if (tipoPan == 1 && tipoCarne == 3 && acompanante == 2) {
            precioSanduche = 11000;
        } else {
            precioSanduche = 10800;
        }
       return precioSanduche;
    }
    
    
   
}
