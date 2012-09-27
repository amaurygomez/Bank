/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author FamilyValdez
 */
public class Tarjetas_body extends Tarjetas{

   

    @Override
    public boolean mastercard(boolean status) {      
     status = false;
     return true;
    }

   

    @Override
    public boolean visa(boolean status) {
        status = false;
        return true;
    }

    @Override
    public boolean maestro(boolean status) {
         status = false;
        return true;
    }


    
}
