/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaldlc;

import javax.swing.JOptionPane;

/**
 *
 * @author laura.tascon
 */
public class Insertar extends javax.swing.JFrame {
    
    /**
     * Creates new form Insertar
     */
    public Insertar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datoD = new javax.swing.JTextField();
        alInicio = new javax.swing.JButton();
        enOrden = new javax.swing.JButton();
        alFinal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        datoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoDActionPerformed(evt);
            }
        });

        alInicio.setText("Al inicio");
        alInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alInicioActionPerformed(evt);
            }
        });

        enOrden.setText("En orden");
        enOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enOrdenActionPerformed(evt);
            }
        });

        alFinal.setText("Al final");
        alFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alFinalActionPerformed(evt);
            }
        });

        jLabel1.setText("Insertar el dato:");

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(alInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(datoD, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(volver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(datoD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alInicio)
                    .addComponent(enOrden)
                    .addComponent(alFinal))
                .addGap(18, 18, 18)
                .addComponent(volver)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alInicioActionPerformed
    try{    
        String dato = datoD.getText(); 
        Menu.lista.insertarPrimero(Integer.parseInt(dato));
        datoD.setText("");
        datoD.requestFocus();
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Debe ingresar un numero");
    }   

        
    }//GEN-LAST:event_alInicioActionPerformed

    private void enOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enOrdenActionPerformed
    
    try{
        String dato = datoD.getText();
        Menu.lista.insertar(Integer.parseInt(dato));
        datoD.setText("");
        datoD.requestFocus();
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Debe ingresar un numero");
    }     
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_enOrdenActionPerformed

    private void alFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alFinalActionPerformed
 
    try{
        String dato = datoD.getText();
        Menu.lista.insertarUltimo(Integer.parseInt(dato));
        datoD.setText("");
        datoD.requestFocus();
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Debe ingresar un numero");
    }    

        
        
// TODO add your handling code here:
    }//GEN-LAST:event_alFinalActionPerformed

    private void datoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoDActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alFinal;
    private javax.swing.JButton alInicio;
    private javax.swing.JTextField datoD;
    private javax.swing.JButton enOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
