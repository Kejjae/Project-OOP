package main;

import SWING.ScrollBarCustom;

public class cs_frame3_2 extends javax.swing.JFrame {

    public cs_frame3_2() {
        initComponents();
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_head = new javax.swing.JPanel();
        tf_searchbar = new javax.swing.JTextField();
        tf_searchbook = new javax.swing.JTextField();
        ic_cart = new javax.swing.JLabel();
        bt_return = new javax.swing.JButton();
        ic_profile = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pn_bookshow2 = new main.pn_bookshow();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YHA LUEM KHEAN");

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        pn_head.setBackground(new java.awt.Color(239, 239, 239));
        pn_head.setPreferredSize(new java.awt.Dimension(1000, 100));

        tf_searchbar.setFont(new java.awt.Font("supermarket", 0, 16)); // NOI18N
        tf_searchbar.setText("Search Bar");
        tf_searchbar.setSelectionColor(new java.awt.Color(103, 103, 238));

        tf_searchbook.setFont(new java.awt.Font("supermarket", 0, 16)); // NOI18N
        tf_searchbook.setText("Search Book");
        tf_searchbook.setSelectionColor(new java.awt.Color(103, 103, 238));
        tf_searchbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchbookActionPerformed(evt);
            }
        });

        ic_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/shopping-cart (1).png"))); // NOI18N
        ic_cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ic_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ic_cartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ic_cartMouseExited(evt);
            }
        });

        bt_return.setFont(new java.awt.Font("supermarket", 0, 16)); // NOI18N
        bt_return.setText("return");
        bt_return.setToolTipText("Return books");
        bt_return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ic_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user (3).png"))); // NOI18N
        ic_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ic_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ic_profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ic_profileMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_headLayout = new javax.swing.GroupLayout(pn_head);
        pn_head.setLayout(pn_headLayout);
        pn_headLayout.setHorizontalGroup(
            pn_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_headLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tf_searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(tf_searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ic_cart)
                .addGap(34, 34, 34)
                .addComponent(bt_return)
                .addGap(33, 33, 33)
                .addComponent(ic_profile)
                .addContainerGap())
        );
        pn_headLayout.setVerticalGroup(
            pn_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_headLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pn_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_return)
                        .addComponent(ic_cart)
                        .addComponent(ic_profile)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 100));
        jScrollPane2.setViewportView(pn_bookshow2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_head, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pn_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_searchbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchbookActionPerformed

    private void ic_cartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_cartMouseEntered
        ic_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/shopping-cart (2).png"))); // NOI18N:
    }//GEN-LAST:event_ic_cartMouseEntered

    private void ic_profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_profileMouseEntered
        ic_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user (6).png"))); // NOI18N
    }//GEN-LAST:event_ic_profileMouseEntered

    private void ic_profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_profileMouseExited
        ic_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user (3).png"))); // NOI18N
    }//GEN-LAST:event_ic_profileMouseExited

    private void ic_cartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_cartMouseExited
        ic_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/shopping-cart (1).png")));
    }//GEN-LAST:event_ic_cartMouseExited

    private void ic_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_profileMouseClicked
        cs_profile profile = new cs_profile();
        profile.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        profile.setVisible(true);
        
    }//GEN-LAST:event_ic_profileMouseClicked

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
            java.util.logging.Logger.getLogger(cs_frame3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cs_frame3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cs_frame3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cs_frame3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cs_frame3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_return;
    private javax.swing.JLabel ic_cart;
    private javax.swing.JLabel ic_profile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private main.pn_bookshow pn_bookshow2;
    private javax.swing.JPanel pn_head;
    private javax.swing.JTextField tf_searchbar;
    private javax.swing.JTextField tf_searchbook;
    // End of variables declaration//GEN-END:variables
}
