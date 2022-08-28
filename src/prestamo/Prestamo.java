/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class Prestamo {

    public static void main(String[] args) {
        VentanaPrestamo v = new VentanaPrestamo();
        v.setVisible(true);
        /*ArrayList<ArrayPrestamos> proyecto = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuál es el capital inicial?: ");
        Double capitalInicial = teclado.nextDouble();
        System.out.println("Cuál es la tasa de interés?: ");
        Double tasaInteres = teclado.nextDouble() / 100;
        System.out.println("Cuál es la cantidad de días del préstamo?: ");
        Integer diasPrestamo = teclado.nextInt();
        */
        /*System.out.println("MODELO DEL PROGRAMA.");
        Double cuotaSecundaria = ((tasaInteres * capitalInicial) + capitalInicial) / diasPrestamo;
        System.out.println("Cuota Secundaria: " + cuotaSecundaria);
        ArrayPrestamos prestamo; //Definimos el funcionamiento del préstamo.
        */
        /*for (int i = 1; i <= diasPrestamo; i++) {
            
            //Si es el primer día se trabaja con el capital inicial
            if (i == 1) {
                prestamo = new ArrayPrestamos(tasaInteres, capitalInicial, diasPrestamo, i);
                prestamo.generarPrestamosAutomaticos();
                prestamo.mostrarCuotas();
                proyecto.add(prestamo);
                System.out.println("_______________________________________________-");
            }
            else {
                prestamo = new ArrayPrestamos(tasaInteres, cuotaSecundaria, diasPrestamo, i);
                prestamo.generarPrestamosAutomaticos();
                prestamo.mostrarCuotas();
                proyecto.add(prestamo);
                System.out.println("_______________________________________________-");
            }
        }*/
    }
    
}
