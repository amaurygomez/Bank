/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

            
            
            
            
/**
 *
 * @author FamilyValdez
 */
public class Cliente extends Tarjetas_body{
    
   static String nombre = "Pedro";
   static  String apellido = "Arias";
   static short id = 234;
    static int tarjeta = 4343;
   static int pin = 345;
   static int balance = 25000;
    
    public Cliente(){
    
    
    
    }
    public static void autentificacion(String nombre, String apellido,short id , long tarjeta){
    Cliente.nombre = nombre;
    Cliente.apellido = apellido;
    Cliente.id = id;
    Cliente.tarjeta = (int) tarjeta;
    Tarjetas_body tb = new Tarjetas_body();
    tb.maestro(true);
    
    }
    
    public static boolean logeo(int tarjeta, int pin){
        if(tarjeta == Cliente.tarjeta && pin == Cliente.pin){
      
        return true;
        }else{
          
        return false;
        }
        
    
         
    
    
    }

   public static void balance(){
    System.out.println("Su balance es"+  balance);
    
    }

   
    
    
    
    
}
