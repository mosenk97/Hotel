/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_eigen;

/**
 *
 * @author johan
 */
public class Buchungsabschluss extends javax.swing.JFrame {

    /**
     * Creates new form Buchungsabschluss
     */
    public Buchungsabschluss() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonregistrierung = new javax.swing.JButton();
        jButtonzimmer = new javax.swing.JButton();
        jButtonkunde = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jkundennachname = new javax.swing.JTextField();
        jkundenvornam = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jkundennachname1 = new javax.swing.JTextField();
        jkundennachname2 = new javax.swing.JTextField();
        jkundennachname3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 238, 248));
        jPanel1.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(91, 142, 206));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(91, 142, 206));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Hier könnte schon \nbald ihre \nFunktionalität \nentstehen...");
        jTextArea1.setMaximumSize(new java.awt.Dimension(90, 88));
        jTextArea1.setMinimumSize(new java.awt.Dimension(90, 88));
        jScrollPane1.setViewportView(jTextArea1);

        jButton7.setBackground(new java.awt.Color(91, 142, 206));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(222, 238, 248));
        jButton7.setText("Sperren/Stornieren");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton7.setPreferredSize(new java.awt.Dimension(128, 28));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(91, 142, 206));

        jLabel1.setBackground(new java.awt.Color(222, 238, 206));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 238, 248));
        jLabel1.setText("Buchungsübersicht");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 218, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(91, 142, 206));

        jButtonregistrierung.setBackground(new java.awt.Color(91, 142, 206));
        jButtonregistrierung.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonregistrierung.setForeground(new java.awt.Color(222, 238, 248));
        jButtonregistrierung.setText("Registrierung");
        jButtonregistrierung.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonregistrierung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregistrierungActionPerformed(evt);
            }
        });

        jButtonzimmer.setBackground(new java.awt.Color(91, 142, 206));
        jButtonzimmer.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonzimmer.setForeground(new java.awt.Color(222, 238, 248));
        jButtonzimmer.setText("Zimmer");
        jButtonzimmer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonzimmer.setPreferredSize(new java.awt.Dimension(128, 28));
        jButtonzimmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonzimmerActionPerformed(evt);
            }
        });

        jButtonkunde.setBackground(new java.awt.Color(91, 142, 206));
        jButtonkunde.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButtonkunde.setForeground(new java.awt.Color(222, 238, 248));
        jButtonkunde.setText("Kunde");
        jButtonkunde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButtonkunde.setPreferredSize(new java.awt.Dimension(128, 28));
        jButtonkunde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonkundeActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(91, 142, 206));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(222, 238, 248));
        jButton4.setText("Buchung");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));
        jButton4.setPreferredSize(new java.awt.Dimension(128, 28));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButtonzimmer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonkunde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonregistrierung)
                .addGap(51, 51, 51)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonregistrierung)
                    .addComponent(jButtonzimmer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonkunde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(222, 238, 248));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 142, 206));
        jLabel4.setText("Rabatt ");

        jLabel5.setBackground(new java.awt.Color(222, 238, 248));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(91, 142, 206));
        jLabel5.setText("Anzahl Personen");

        jLabel6.setBackground(new java.awt.Color(222, 238, 248));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(91, 142, 206));
        jLabel6.setText("Gebuchte(s) Zimmer");

        jkundennachname.setBackground(new java.awt.Color(222, 238, 248));
        jkundennachname.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jkundennachname.setForeground(new java.awt.Color(91, 142, 206));
        jkundennachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkundennachnameActionPerformed(evt);
            }
        });

        jkundenvornam.setBackground(new java.awt.Color(222, 238, 248));
        jkundenvornam.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jkundenvornam.setForeground(new java.awt.Color(91, 142, 206));
        jkundenvornam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkundenvornamActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(222, 238, 248));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(91, 142, 206));
        jButton6.setText("Zurück");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 142, 206), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(222, 238, 248));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(91, 142, 206));
        jButton5.setText("Abschließen");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 142, 206), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(222, 238, 248));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(91, 142, 206));
        jLabel7.setText("Aufenthaltszeitraum");

        jLabel8.setBackground(new java.awt.Color(222, 238, 248));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(91, 142, 206));
        jLabel8.setText("Kosten gesamt");

        jkundennachname1.setBackground(new java.awt.Color(222, 238, 248));
        jkundennachname1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jkundennachname1.setForeground(new java.awt.Color(91, 142, 206));
        jkundennachname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkundennachname1ActionPerformed(evt);
            }
        });

        jkundennachname2.setBackground(new java.awt.Color(222, 238, 248));
        jkundennachname2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jkundennachname2.setForeground(new java.awt.Color(91, 142, 206));
        jkundennachname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkundennachname2ActionPerformed(evt);
            }
        });

        jkundennachname3.setBackground(new java.awt.Color(222, 238, 248));
        jkundennachname3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jkundennachname3.setForeground(new java.awt.Color(91, 142, 206));
        jkundennachname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkundennachname3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5)
                                        .addGap(57, 57, 57))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jkundennachname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jkundenvornam, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jkundennachname1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jkundennachname2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jkundennachname3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jkundenvornam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jkundennachname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jkundennachname1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jkundennachname2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jkundennachname3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(97, 97, 97))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonregistrierungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregistrierungActionPerformed
        Kundenregistrierung refGui = new Kundenregistrierung();
        refGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonregistrierungActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jkundennachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkundennachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkundennachnameActionPerformed

    private void jkundenvornamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkundenvornamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkundenvornamActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jkundennachname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkundennachname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkundennachname1ActionPerformed

    private void jkundennachname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkundennachname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkundennachname2ActionPerformed

    private void jkundennachname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkundennachname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkundennachname3ActionPerformed

    private void jButtonzimmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonzimmerActionPerformed
        zimmer_auswahl refGui = new zimmer_auswahl();
        refGui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonzimmerActionPerformed

    private void jButtonkundeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonkundeActionPerformed
        kunden_daten refGui = new kunden_daten();
        refGui.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonkundeActionPerformed

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
            java.util.logging.Logger.getLogger(Buchungsabschluss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buchungsabschluss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buchungsabschluss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buchungsabschluss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buchungsabschluss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonkunde;
    private javax.swing.JButton jButtonregistrierung;
    private javax.swing.JButton jButtonzimmer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jkundennachname;
    private javax.swing.JTextField jkundennachname1;
    private javax.swing.JTextField jkundennachname2;
    private javax.swing.JTextField jkundennachname3;
    private javax.swing.JTextField jkundenvornam;
    // End of variables declaration//GEN-END:variables
}
