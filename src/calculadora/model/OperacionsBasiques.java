/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.model;

/**
 *
 * @author ALUMNEDAM
 */
public class OperacionsBasiques implements Ibasica {

    @Override
    public double suma(double op1, double op2) {
        return op1 + op2;
    }

    @Override
    public double resta(double op1, double op2) {
        return op1 - op2;
    }

    @Override
    public double multiplicacio(double op1, double op2) {
        return op1 * op2;
    }

    @Override
    public double divisio(double op1, double op2) {
        return op1 / op2;
    }

}
