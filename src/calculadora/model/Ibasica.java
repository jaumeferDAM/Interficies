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
public interface Ibasica {

    /**
     * Realitza la suma de oper1 mes oper2.
     *
     * @param op1 primer operador que introdueix l'usuari
     * @param op2
     * @return
     */
    double suma(double op1, double op2);

    /**
     * Realitza la resta de oper1 menys oper2.
     *
     * @param op1
     * @param op2
     * @return
     */
    double resta(double op1, double op2);

    /**
     * Realitza la multiplicacio de oper1 per oper2.
     *
     * @param op1
     * @param op2
     * @return
     */
    double multiplicacio(double op1, double op2);

    /**
     * Realitza la divisió de oper1 entre oper2.
     *
     * @param op1
     * @param op2
     * @return
     */
    double divisio(double op1, double op2);
}
