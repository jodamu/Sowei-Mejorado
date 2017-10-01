/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soweimejorado;

import java.util.Random;

/**
 *
 * @author JODAMU
 */
public class Factura {
   final double PORCENTAJE_DESCUENTO = 0.02;
    public void generarFactura(){
        
   
        Random r = new Random();
       int numFactura = r.nextInt(901);
        Preparacion Pre=new Preparacion();
        Cliente Cl=new Cliente();
        double  totalAPagar;
        double  descuento;
        Pre.crear();
        Cl.solicitarDatos();
        
        
         if (Cl.retornarEdad() >= 65) {
            descuento = Pre.valor() * PORCENTAJE_DESCUENTO;
        } else {
            descuento = 0;
        }
         totalAPagar = (Pre.valor() - descuento);
        //imprimo mensaje para que el usuario sepa que se le esta generando la factura
        System.out.println("\n\nGenerando Factura...\n\n");
        
        //imprimo la factura
        System.out.println("=======================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tNúmero de factura " + numFactura);
        System.out.println("\n\t\t\t\t\tSOWEI MEDELLIN" + "\n\nPEDIDO CLIENTE " + Cl.retornarNombre());
        System.out.println("\n"+Pre.nombrePan+"\t"+ Pre.nombreCarne +"\t"+ Pre.nombreAcomp + "\t\t\t$" + Pre.valor());
        System.out.println("\n\t\t\t\t\tDescuento (2%) \t\t\t$" +descuento);
        System.out.println("\nTOTAL A PAGAR.................................................. " + "\t$" + totalAPagar);
        System.out.println("=======================================================================================");

        
    }
}
