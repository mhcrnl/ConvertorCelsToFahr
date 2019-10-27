/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertorcelstofahr;

import java.util.Scanner;
/**
 *
 * @author mhcrnl@gmail.com
 */
public class ConvertorCelsToFahr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahr;
        System.out.println("Acest program converteste temperatura celius"
                + " in fahrenheit. Introduceti temperatura celsius :");
        
        Scanner cels = new Scanner(System.in);
        double celsius = cels.nextDouble();
        
        System.out.println("Temperatura Celsius este: " + celsius);
        //tf=tc X 9/5 +32
        System.out.println("Temp Fahr: " + ((celsius * 9/5) + 32)) ; 
        
        
        
    }
    
}
