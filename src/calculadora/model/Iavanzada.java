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
public interface Iavanzada {

    /**
     * Metode per calcular la potencia de oper1 elevado a oper2
     *
     * @param oper1 primer numero ingresado por el usuario
     * @param oper2 segundo número ingresado por el usuario
     * @return
     */
    double potencia(double oper1, double oper2);

    /**
     * Método para calcular el Máximo Común Divisor.
     *
     * @param oper1 primer numero ingresado por el usuario
     * @param oper2 segundo número ingresado por el usuario
     * @return mcd que es el Máximo Común Divisor entre num1 y num2
     */
    int maxim(double oper1, double oper2);

    /**
     * Método para calcular el Mínimo Común Múltiplo
     *
     * @param oper1 primer número ingresado por el usuario
     * @param oper2 segundo número ingresado por el usuario
     * @return mcm que es el Mínimo Común Múltiplo entre num1 y num2
     */
    double minim(double oper1, double oper2);

    /**
     * Metode para calcular el modulo de dos numeros.
     * @param oper1 primer número ingresado por el usuario
     * @param oper2 segundo número ingresado por el usuario
     * @return 
     */
    double modul(double oper1, double oper2);
}
