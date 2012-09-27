/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.*;

public class Bank {
    
public static boolean entrada(String input){
         try
         {
             int cantidad = Integer.parseInt(input);
             
            return  true;
         }
         catch(NumberFormatException e)
             
         {
              System.out.println("el valor no es numerico");
              return false;
         }}
    
    public static void dinero() {
         Scanner lee = new Scanner(System.in);
         
         int[] billetes = {0,0,0,0,0};
         int cien=2;
         int dosciento=2;
         int quiniento=3;
         int mil= 5;
         int dosmil=3;
         
         System.out.print("ingrese: ");
         String input = lee.next();
         
         if(entrada(input))
         {
          
            int cantidad = Integer.parseInt(input);

            if(cantidad%100==0)
            {

               while(cantidad>=2000 && dosmil!=0)
               {
                   billetes[4]++;
                   cantidad -= 2000;
                   dosmil--;
                   System.out.println(dosmil);
               }

               while(cantidad>=1000 && mil!=0)
               {
                   billetes[3]++;
                   cantidad -= 1000;
                   mil--;
               }
               while(cantidad>=500 && quiniento!=0){
                    billetes[2]++;
                    cantidad -=500;
                    quiniento--;
               
               }
               while(cantidad>=200 && dosciento!=0){
               billetes[1]++;
               cantidad -=200;
               dosciento--;
               }
               while(cantidad>=100 && cien!=0){
               billetes[0]++;
               cantidad -=100;
               cien--;
               
               }
               
               if(cantidad!=0)
               {
                   System.out.println("no hay cuarto");
                   mil+=billetes[3];
                   dosmil+=billetes[4];
                   quiniento+=billetes[2];
                   dosciento+=billetes[1];
                   cien+=billetes[0];
                   billetes[4]=0;
                   billetes[3]=0;
                   billetes[2]=0;
                   billetes[1]=0;
                   billetes[0]=0;
                   
                   
                   
               }
               
            }
            else
            {
                System.out.println("el valor debe ser multiplo de 100");
            }
         }
         
         
         if(billetes[4]!=0)
         {
             System.out.println("billetes de dosmil "+ billetes[4]);
         }
         if(billetes[3]!=0)
         {
             System.out.println("billetes de mil "+ billetes[3]);
         }
         if(billetes[2]!=0){
         System.out.println("billetes de quinientos "+ billetes[2]);
         }
         if(billetes[2]!=0){
         System.out.println("billetes de dosciento "+ billetes[1]);
         }
         if(billetes[2]!=0){
         System.out.println("billetes de cien "+ billetes[01]);
         }
         
    }     
    
}
