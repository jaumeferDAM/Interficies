/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.control;

import Calculadoraguivista.CalculadoraAvanzada;
import calculadora.model.OperacionsAvançades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jaume
 */
public class GestioCalculadoraAvanzada implements ActionListener {

    private CalculadoraAvanzada ig;
    private OperacionsAvançades opers;

    public GestioCalculadoraAvanzada(CalculadoraAvanzada ig) {
        this.ig = ig;
        opers = new OperacionsAvançades();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String accio = e.getActionCommand();

        switch (accio) {
            case "Potencia":
                Potencia();
                break;
            case "mcd":
                mcd();
                break;
            case "mcm":
                mcm();
                break;
            case "Modul":
                Modul();
                break;
        }
    }

    private void Potencia() {
        ig.setResultat(opers.potencia(ig.getNumero1(), ig.getNumero2()));

    }

    private void mcd() {
        ig.setResultat(opers.maxim(ig.getNumero1(), ig.getNumero2()));

    }

    private void mcm() {
        ig.setResultat(opers.minim(ig.getNumero1(), ig.getNumero2()));

    }

    private void Modul() {
        ig.setResultat(opers.modul(ig.getNumero1(), ig.getNumero2()));

    }


}
