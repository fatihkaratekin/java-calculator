/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yenideneme;

import java.util.Scanner;

/**
 *
 * @author Fatih Karatekin
 */
public class Yenideneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       while(true){
        int hesaplama; 
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("please enter the fırst number");
        int fırstnumber = scanner.nextInt(); 
        System.out.println("please enter the second number"); 
        int secondnumber = scanner.nextInt();
        System.out.println("please enter the thirt number"); 
        int thirtnumber = scanner.nextInt(); 
         
        System.out.println(" THIS APPLICATION NAME IS CALCULATOR IF YOU READY START ??? \n IF THİS NUMBERS PLUS ENTER THE ONE \n"
                + "IF THİS NUMBERS SUBTERACTİON ENTER THE TWO \n IF THİS NUMBERS MULTIPLICATION ENTER THE THREE PLEASE");
        hesaplama = scanner.nextInt();
     
        if(hesaplama == 1){
            hesaplama = (fırstnumber + secondnumber + thirtnumber); 
            System.out.println("this numbers plus : " + hesaplama);
            
            
            
        }
        
        else if(hesaplama == 2){
            hesaplama = (fırstnumber - secondnumber - thirtnumber); 
             System.out.println("this numbers subteraction : " + hesaplama);
           
            
        }
        else if(hesaplama == 3){
             hesaplama = (fırstnumber * secondnumber * thirtnumber); 
             System.out.println("this numbers multiplication : " + hesaplama);
          
        }
        
        
        
        
        
    }
    
}
}