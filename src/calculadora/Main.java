/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Calculadoraguivista.Inicial;
import Calculadoraguivista.CalculadoraBasica;
import javax.swing.SwingUtilities;

/**
 *
 * @author ALUMNEDAM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Inicial inicial = new Inicial();
                inicial.setVisible(true);
            }
        });


    }

}
