/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakt;

/**
 *
 * @author hp
 */
public class konversi {
    double Celcius(){
        return(main.suhuAwal);
    }
    double rumusFahrenheit(){
        return(main.suhuAwal*1.8+32);
    }
    double rumusReamur(){
        return(main.suhuAwal*0.8);
    }
    double rumusKelvin(){
        return(main.suhuAwal+273.15);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}