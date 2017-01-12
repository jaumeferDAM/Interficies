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
    int files, columnes;
    boolean Estat = false;

    public Tauler() {
        this.tauler = tauler;
       IniciarArrays();
       RespostaMenu();
    }

//    Casella c = new Casella(Boolean.FALSE, Color.GREEN);
    Scanner lector = new Scanner(System.in);

//    Casella[][] caselles = new Casella[5][5];
//    public int menuInicial() {
//        System.out.println("MENU PRINCIPAL \n"
//                + "1. Veure tauler \n"
//                + "2. Modificar una casella");
//      
//        return lector.nextInt();
//    }
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
        tauler = new Casella[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                tauler[i][j] = new Casella();
            }
        }

    }

    public void imprimirTauler() {
//        if (c.getC() == Color.RED && c.getEstat() == Boolean.FALSE) {
        for (Casella[] tauler1 : tauler) {
            for (int j = 0; j < tauler.length; j++) {
                System.out.print(tauler1[j].getEstat()+ " ");
            }
            System.out.println("");

//        }
        }
    }

    public void modificarCasella() {
        System.out.println("Introdueix la poscio de la casella (X,Y): ");
        int X = lector.nextInt();
        int Y = lector.nextInt();

        tauler[X-1][Y-1].setEstat(!tauler[X][Y].getEstat());
        tauler[X-1][Y-1].setC(Color.RED);
        System.out.println("Estat cambiat correctament");
    }

    public void RespostaMenu() {

        int opcio;
        do {
            System.out.print("Escogeix una opcio\n"
                    + "1- Mostra tauler\n"
                    + "2- Modifica casella\n"
                    + "3- Sortir\n");

            opcio = lector.nextInt();
            switch (opcio) {
                case 1:
                    imprimirTauler();
                    break;

                case 2:
                    modificarCasella();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Selecciona una opcio valida!");
                    break;
            }
        } while (true);

    }
}
