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
public class Menu {
    Scanner sc=new Scanner(System.in);
    
    public void crearMenu(){
       System.out.println("Desea realiazar el pedido:");
        System.out.println("1. inciar pedido");
       System.out.println("2. salir del sistema");  
       int opcion=sc.nextInt();
       
       while (opcion==1){
            Factura f=new Factura();
        f.generarFactura();
        
        
         System.out.println("\n\nContinuar Vendiendo:");
        System.out.println("1. inciar pedido");
       System.out.println("2. salir del sistema");  
       opcion=sc.nextInt();
       }
       System.exit(0);
         
    }
}
