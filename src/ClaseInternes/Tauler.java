/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseInternes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author Jaume
 */
public class Tauler {

    private Casella[][] tauler;

    public Tauler(int files, int columnes) {
        tauler = new Casella[files][columnes];
    }

//    Casella c = new Casella(Boolean.FALSE, Color.GREEN);
    Scanner lector = new Scanner(System.in);

//    Casella[][] caselles = new Casella[5][5];
    public void menuInicial() {
        System.out.println("MENU PRINCIPAL \n"
                + "1. Veure tauler \n"
                + "2. Modificar una casella");
        RespostaMenu();
    }

    /**
     * for (Fitxa fitxa : fitxesJugades) { tauler.append(" |");
     * tauler.append(fitxa.getValors()[0]); tauler.append(":");
     * tauler.append(fitxa.getValors()[1]); tauler.append("| "); }
     * System.out.println(tauler);
     *
     */
    class Casella {

        public Casella() {
            this.estat = false;
            this.c = Color.GREEN;
        }

        Boolean estat;
        Color c;

        public Boolean getEstat() {
            return estat;
        }

        public void setEstat(Boolean estat) {
            this.estat = estat;
        }

        public Color getC() {
            return c;
        }

        public void setC(Color c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return " [ " + "  ] ";
        }
    }

    public void IniciarArrays() {

        System.out.println("Introdueix la quantitat de files");
        int files = lector.nextInt();
        System.out.println("Introdueix la quantitat de columnes");
        int columnes = lector.nextInt();
        lector.nextLine();

        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                tauler[i][j] = new Casella();
            }
        }
           menuInicial();
    }

    public void imprimirTauler() {
//        if (c.getC() == Color.RED && c.getEstat() == Boolean.FALSE) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                System.out.print(tauler[i][j].getC() + " ");
            }
            System.out.println("");

//        }
        }
    }

    

    public void modificarCasella() {
        System.out.println("Introdueix la poscio de la casella (X,Y): ");
        int X = lector.nextInt();
        int Y = lector.nextInt();
        System.out.println("Introdueix l'estat de la casella");
        tauler[X][Y].setEstat(lector.nextBoolean());

    }

    public void RespostaMenu() {
     
        System.out.println("");
        int accio = lector.nextInt();
       
        do {
            switch (accio) {
                case 1:
                    imprimirTauler();
                    break;

                case 2:
                    modificarCasella();
                    break;
            }

        } while (true);
    }
}
