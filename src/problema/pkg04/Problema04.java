/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg04;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Convertidor de grados Celcius a grados Farenheit
        double celcius, farenheit;
        celcius = pedirCelcius();
        farenheit = calcularFarenheit(celcius);
        mostrarResultado(celcius, farenheit);
    }
    
    public static double pedirCelcius(){
        double celcius;
        System.out.println("Introduce la cantidad de grados celcius:");
        Scanner entradaCelcius = new Scanner(System.in);
        celcius = entradaCelcius.nextDouble();
        return celcius;
    }    
    
    public static double calcularFarenheit(double celcius){
        double farenheit;
        farenheit = ((1.8*celcius)+32);
        return farenheit;
    }
    public static void mostrarResultado(double celcius, double farenheit){
        System.out.println(celcius + " grados Celcius equivale a:" + farenheit + " grados Farenheit");
    }
}