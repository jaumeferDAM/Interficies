/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.control;

import Calculadoraguivista.CalculadoraBasica;
import calculadora.model.OperacionsBasiques;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ALUMNEDAM
 */
public class GestioCalculadoraGui implements ActionListener {

    private CalculadoraBasica ig;
    private OperacionsBasiques opers;

    public GestioCalculadoraGui(CalculadoraBasica ig) {
        this.ig = ig;
        opers = new OperacionsBasiques();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String accio = e.getActionCommand();

        switch (accio) {
            case "+":
                suma();
                break;
            case "-":
                resta();
                break;
            case "*":
                multiplicacio();
                break;
            case "/":
                divisio();
                break;
        }
    }

    private void suma() {
        ig.setResultat(opers.suma(ig.getNumero1(), ig.getNumero2()));

    }

    private void resta() {
        ig.setResultat(opers.resta(ig.getNumero1(), ig.getNumero2()));

    }

    private void multiplicacio() {
        ig.setResultat(opers.multiplicacio(ig.getNumero1(), ig.getNumero2()));

    }

    private void divisio() {
        ig.setResultat(opers.divisio(ig.getNumero1(), ig.getNumero2()));

    }

}
