/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.sun.xml.internal.ws.api.pipe.NextAction;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FamilyValdez
 */
public class Menu extends Cliente{
    
   public static void menu(int test) throws IOException{
       
   switch(test){
       
       case 1:
           System.out.println("~..........................~");
           System.out.println("~.........City Bank........~");
           System.out.println("~..........................~");
           Cliente cl = new Cliente();
           Scanner tarjeta = new Scanner(System.in);
           System.out.println("~.......Introduzca su numero tarjeta......~");
           int tarjeta2 = Integer.parseInt(tarjeta.next());
           
           System.out.println("~......Introduzca su Pin........~");
           int pin2 = Integer.parseInt(tarjeta.next());
           if (cl.logeo(tarjeta2,pin2)) {
                System.out.println("Bienvenido a City Bank");
               Menu.yalogeado(1);
                
           }else{
           
             System.out.println("Su tarjeta o pin es incorrecto");
           }
           
           break;
     
   
   }
   
   
   
   }
   
          public static void menu2(){  
              Scanner retiro = new Scanner(System.in);
     System.out.println("~..........................~");
     System.out.print("Elige una opcion\n"); 
     
     System.out.print("1.- Retirar Balance\n" ); 
     
     System.out.print("2.- Consurtal Balance\n" );
     
     System.out.print("3.- Salir\n" ); 
 System.out.println("~..........................~");
          String in = retiro.nextLine();
         int  entrada = Integer.parseInt(in);
          if(entrada == 1){
          Menu.yalogeado(1);
          
          }
          if(entrada ==2){
          
          Menu.yalogeado(2);
          
          }
          if(entrada ==3){
            int n = 0;
          
          System.exit(n);
          }}
   
   public static void yalogeado(int test2) {
     
             Scanner retiro = new Scanner(System.in);
                Cliente cl = new Cliente();
                
       
 
     switch(test2){ 
     case(1): 
     System.out.print("introduzca la cantidad que desea retirar" );
     
     String cantidad = retiro.nextLine();
     
     int total= Integer.parseInt(cantidad); 
     
     Cliente.balance = Cliente.balance - total;
     Bank.entrada(cantidad);
            
    




     break;  
     
     case(2): 
         
     System.out.print(Cliente.balance); 

     break; 
     
 


} }
    
   public static void main(String[]args){
        try {
            Menu.menu(1);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
   
   
   }  
}



  
   
       


   
  
