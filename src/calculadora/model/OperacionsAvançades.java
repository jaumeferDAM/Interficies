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
public class OperacionsAvançades implements Iavanzada {

    @Override
    public double potencia(double oper1, double oper2) {
        return Math.pow(oper1, oper2);
    }

    @Override
    public int maxim(double oper1, double oper2) {
        int mcd = 0;
        int a = (int) Math.max(oper1, oper2);
        int b = (int) Math.min(oper1, oper2);
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }

    @Override
    public double minim(double oper1, double oper2) {
        int mcm = 0;
        int a = (int) Math.max(oper1, oper2);
        int b = (int) Math.min(oper1, oper2);
        mcm = (a / maxim(a, b)) * b;
        return mcm;
    }

    @Override
    public double modul(double oper1, double oper2) {
        return oper1 % oper2;
    }

}
