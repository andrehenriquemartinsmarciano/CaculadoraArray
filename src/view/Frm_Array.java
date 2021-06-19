/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Frei André Henrique
 */
public class Frm_Array extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Array
     */
    public Frm_Array() {
        initComponents();
        this.setTitle("Array - Vetor de String");
        //Posicionar o formulário no centro da tela
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEntradaDados = new javax.swing.JTextField();
        txtVetorSoImpar = new javax.swing.JTextField();
        txtVetorInvertido = new javax.swing.JTextField();
        txtQtNoPares = new javax.swing.JTextField();
        txtNoElementos = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Calculadora Array");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Exemplo Entrada de Dados:2/35/6/8/9");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Entrada de Dados:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Vetor só impar:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Vetor invertido:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Qt.No.pares:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("No.Elementos:");

        txtEntradaDados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEntradaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaDadosActionPerformed(evt);
            }
        });

        txtVetorSoImpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVetorSoImpar.setEnabled(false);
        txtVetorSoImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVetorSoImparActionPerformed(evt);
            }
        });

        txtVetorInvertido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVetorInvertido.setEnabled(false);
        txtVetorInvertido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVetorInvertidoActionPerformed(evt);
            }
        });

        txtQtNoPares.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQtNoPares.setEnabled(false);
        txtQtNoPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtNoParesActionPerformed(evt);
            }
        });

        txtNoElementos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNoElementos.setEnabled(false);
        txtNoElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoElementosActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcular.setText("calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEntradaDados, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txtVetorSoImpar)
                    .addComponent(txtVetorInvertido)
                    .addComponent(txtQtNoPares)
                    .addComponent(txtNoElementos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVetorSoImpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVetorInvertido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtNoPares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNoElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addComponent(btnCalcular)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVetorSoImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVetorSoImparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVetorSoImparActionPerformed

    private void txtVetorInvertidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVetorInvertidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVetorInvertidoActionPerformed

    private void txtNoElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoElementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoElementosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       //1.Inicializar as variáveis
        String Snumeros[]=this.txtEntradaDados.getText().split("/");
        int noElementos = Snumeros.length;
        String vetorSoImpar="";
        String vetorInvertido="";
        int qtNoPares=0;
        int ct=0;
        //2.Calculos
        //Criar vetor de números
        int[] numeros = new int[noElementos];
        for (ct=0;ct<noElementos;ct++){
            numeros[ct]=Integer.valueOf(Snumeros[ct]);
        }
        //Quantidade de números pares
        for (ct=0;ct<noElementos;ct++){
            if((numeros[ct]%2)==0)
                qtNoPares++;
        }
        //Vetor só ímpar
        for (ct=0;ct<noElementos;ct++){
            if((numeros[ct]%2)!=0)
                //Se for ímpar
                vetorSoImpar=vetorSoImpar+String.valueOf(numeros[ct])+"/";
            else
                //Se for par
                vetorSoImpar=vetorSoImpar+"0/";
        }
        //Vetor invertido
        for (ct=(noElementos-1);ct>=0;ct--){
            vetorInvertido=vetorInvertido+String.valueOf(numeros[ct])+"/";
        }
        //3.Exibir os resultados
        this.txtVetorSoImpar.setText(vetorSoImpar);
        this.txtVetorInvertido.setText(vetorInvertido);
        this.txtQtNoPares.setText(String.valueOf(qtNoPares));
        this.txtNoElementos.setText(String.valueOf(noElementos));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtEntradaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaDadosActionPerformed

    private void txtQtNoParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtNoParesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtNoParesActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEntradaDados;
    private javax.swing.JTextField txtNoElementos;
    private javax.swing.JTextField txtQtNoPares;
    private javax.swing.JTextField txtVetorInvertido;
    private javax.swing.JTextField txtVetorSoImpar;
    // End of variables declaration//GEN-END:variables
}
