/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallervector;

import javax.swing.JOptionPane;

/**
 *
 * @author coste
 */
public class EjercicioUno extends javax.swing.JFrame {

    /**
     * Creates new form EjercicioUno
     */
    double v[];
    double acum = 0, acum1 = 1, ma, me;

    public EjercicioUno() {
        initComponents();
        txtL.requestFocusInWindow();
        cmdLM.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdM.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtL = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdM = new javax.swing.JButton();
        cmdC = new javax.swing.JButton();
        cmdLM = new javax.swing.JButton();
        cmdB = new javax.swing.JButton();
        cmdLA = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Longitud del vector", 0, 0, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLKeyTyped(evt);
            }
        });
        jPanel2.add(txtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", 0, 0, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdM.setText("Mostrar");
        cmdM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMActionPerformed(evt);
            }
        });
        jPanel3.add(cmdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        cmdC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdC.setText("Crear");
        cmdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCActionPerformed(evt);
            }
        });
        jPanel3.add(cmdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        cmdLM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLM.setText("Llenar Manualmente");
        cmdLM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLMActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        cmdB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdB.setText("Borrar");
        cmdB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBActionPerformed(evt);
            }
        });
        jPanel3.add(cmdB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        cmdLA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLA.setText("Llenar Automaticamente");
        cmdLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLAActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 170, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", 0, 0, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtR.setEditable(false);
        txtR.setColumns(20);
        txtR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 163, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < v.length; i++) {
            txtR.append("" + v[i] + "\n");
        }
        txtR.append("Sumatoria: " + acum + "\n");
        txtR.append("Productoria: " + acum1 + "\n");
        txtR.append("Número mayor: " + ma + "\n");
        txtR.append("Número menor: " + me + "\n");
        txtL.setEditable(false);
        cmdC.setEnabled(false);
        cmdLM.setEnabled(false);
        cmdM.setEnabled(false);
    }//GEN-LAST:event_cmdMActionPerformed

    private void cmdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBActionPerformed
        // TODO add your handling code here:
        txtL.setText("");
        txtR.setText("");
        v = null;
        txtL.requestFocusInWindow();
        txtL.setEditable(true);
        cmdLM.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdM.setEnabled(false);
        cmdC.setEnabled(true);
    }//GEN-LAST:event_cmdBActionPerformed

    private void cmdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCActionPerformed
        // TODO add your handling code here:
        int longitud;
        txtR.setText("");
        if (txtL.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longitud del vector", "Error", JOptionPane.ERROR_MESSAGE);
            txtL.requestFocusInWindow();
        } else if (txtL.getText().trim().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(this, "La longitud debe ser mayor que cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtL.requestFocusInWindow();
        } else {
            longitud = Integer.parseInt(txtL.getText());
            v = new double[longitud];
            longitud = Integer.parseInt(txtL.getText());
            v = new double[longitud];

            JOptionPane.showMessageDialog(this, "Vector creado satisfactoriamente");
            txtL.setEditable(false);

            cmdC.setEnabled(false);
            cmdLA.setEnabled(true);
            cmdLM.setEnabled(true);
            cmdM.setEnabled(false);
        }
    }//GEN-LAST:event_cmdCActionPerformed

    private void txtLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtLKeyTyped

    private void cmdLMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLMActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posición " + i));
            v[i] = n;
            acum = acum + v[i];
            acum1 = acum1 * v[i];
        }

        for (int i = 0; i < v.length; i++) {
            if (i == 0) {
                ma = v[0];
                me = v[0];
            }
            if (v[i] > ma) {
                ma = v[i];
            }
            if (v[i] < me) {
                me = v[i];
            }
        }

        txtL.setEditable(false);
        cmdC.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdLM.setEnabled(false);
        cmdM.setEnabled(true);
    }//GEN-LAST:event_cmdLMActionPerformed

    private void cmdLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLAActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) {
            n = (int) (Math.random() * 20 + 1);
            v[i] = n;
            acum = acum + v[i];
            acum1 = acum1 * v[i];
        }

        for (int i = 0; i < v.length; i++) {
            ma = v[0];
            me = v[0];

            if (v[i] > ma) {
                ma = v[i];
            }
            if (v[i] < me) {
                me = v[i];
            }
        }

        JOptionPane.showMessageDialog(this, "Vector llenado satisfactoriamente");
        cmdC.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdLM.setEnabled(false);
        cmdM.setEnabled(true);
        txtL.setEditable(false);
    }//GEN-LAST:event_cmdLAActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioUno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdB;
    private javax.swing.JButton cmdC;
    private javax.swing.JButton cmdLA;
    private javax.swing.JButton cmdLM;
    private javax.swing.JButton cmdM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
