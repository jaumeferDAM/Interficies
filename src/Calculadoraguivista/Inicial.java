/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadoraguivista;

/**
 *
 * @author j
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        this.setLocationRelativeTo(null);// centra el formulari en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonPantalla2 = new javax.swing.JButton();
        jButtonPantalla1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar Calculadora");

        jButtonPantalla2.setText("Avanzada");
        jButtonPantalla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPantalla2ActionPerformed(evt);
            }
        });

        jButtonPantalla1.setText("Basica");
        jButtonPantalla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPantalla1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPantalla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonPantalla1)
                .addGap(18, 18, 18)
                .addComponent(jButtonPantalla2)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPantalla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPantalla2ActionPerformed
        CalculadoraAvanzada ca = new CalculadoraAvanzada();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPantalla2ActionPerformed

    private void jButtonPantalla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPantalla1ActionPerformed
        CalculadoraBasica p1 = new CalculadoraBasica();
        p1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPantalla1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPantalla1;
    private javax.swing.JButton jButtonPantalla2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
