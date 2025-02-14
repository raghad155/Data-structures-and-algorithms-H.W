/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
public class PredatoryCreditCard extends CreditCard {
    // ...

    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if (!isSuccess) {
          
            super.chargePenalty(); 
        }
        return isSuccess;
    }
}