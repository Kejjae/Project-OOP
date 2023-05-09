import java.awt.*;
import javax.swing.*;

public class Frame9 extends javax.swing.JFrame {
    public Frame9() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_delPF = new javax.swing.JButton();
        lb_pic = new javax.swing.JLabel();
        bt_changePF1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_name = new javax.swing.JTextField();
        tf_lastname = new javax.swing.JTextField();
        tf_unsername = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_tel = new javax.swing.JTextField();
        lb_headPF = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_lastname = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_point = new javax.swing.JLabel();
        lb_tel = new javax.swing.JLabel();
        bt_back = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();
        lb_score = new javax.swing.JLabel();
        lb_address = new javax.swing.JLabel();
        tf_address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_delPF.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        bt_delPF.setText("Delete Profile Picture");
        bt_delPF.setAlignmentY(0.0F);
        bt_delPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delPFActionPerformed(evt);
            }
        });
        jPanel1.add(bt_delPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 172, 35));

        lb_pic.setText("[ PIC ]");
        lb_pic.setIconTextGap(10);
        jPanel1.add(lb_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        bt_changePF1.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        bt_changePF1.setText("Change Profile Picture");
        bt_changePF1.setAlignmentY(0.0F);
        bt_changePF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changePF1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_changePF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 172, 35));

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tf_name.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        tf_name.setForeground(new java.awt.Color(102, 102, 102));
        tf_name.setText(" Sodka");
        tf_name.setBorder(null);
        tf_name.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tf_name.setEnabled(false);
        tf_name.setSelectionColor(new java.awt.Color(153, 153, 255));
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        tf_lastname.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        tf_lastname.setForeground(new java.awt.Color(102, 102, 102));
        tf_lastname.setText(" Yakmeterpenfan");
        tf_lastname.setBorder(null);
        tf_lastname.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tf_lastname.setEnabled(false);
        tf_lastname.setSelectionColor(new java.awt.Color(153, 153, 255));
        tf_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lastnameActionPerformed(evt);
            }
        });

        tf_unsername.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        tf_unsername.setForeground(new java.awt.Color(102, 102, 102));
        tf_unsername.setText(" im_a_single_lady");
        tf_unsername.setBorder(null);
        tf_unsername.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tf_unsername.setEnabled(false);
        tf_unsername.setSelectionColor(new java.awt.Color(153, 153, 255));
        tf_unsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_unsernameActionPerformed(evt);
            }
        });

        tf_email.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        tf_email.setForeground(new java.awt.Color(102, 102, 102));
        tf_email.setText(" eiei_inwza555@gmail.com");
        tf_email.setBorder(null);
        tf_email.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tf_email.setEnabled(false);
        tf_email.setSelectionColor(new java.awt.Color(153, 153, 255));
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });

        tf_tel.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        tf_tel.setForeground(new java.awt.Color(102, 102, 102));
        tf_tel.setText(" 0123456789");
        tf_tel.setBorder(null);
        tf_tel.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tf_tel.setEnabled(false);
        tf_tel.setSelectionColor(new java.awt.Color(153, 153, 255));

        lb_headPF.setFont(new java.awt.Font("supermarket", 0, 24)); // NOI18N
        lb_headPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_headPF.setText("PROFILE");

        lb_name.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_name.setText("Name :");
        lb_name.setPreferredSize(null);

        lb_lastname.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_lastname.setText("Lastname :");
        lb_lastname.setPreferredSize(null);

        lb_username.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_username.setText("Username :");

        lb_email.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_email.setText("E-mail :");
        lb_email.setPreferredSize(null);

        lb_point.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_point.setForeground(new java.awt.Color(0, 0, 153));
        lb_point.setText("Your point :");
        lb_point.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lb_tel.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_tel.setText("Phome Number :");

        bt_back.setBackground(new java.awt.Color(79, 69, 186));
        bt_back.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(255, 255, 255));
        bt_back.setText("Back");
        bt_back.setAlignmentY(0.0F);
        bt_back.setBorder(null);
        bt_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_edit.setBackground(new java.awt.Color(96, 87, 192));
        bt_edit.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        bt_edit.setForeground(new java.awt.Color(255, 255, 255));
        bt_edit.setText("Edit");
        bt_edit.setAlignmentY(0.0F);
        bt_edit.setBorderPainted(false);
        bt_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_edit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bt_editMouseDragged(evt);
            }
        });
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });

        lb_score.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_score.setForeground(new java.awt.Color(0, 0, 153));
        lb_score.setText("999999999");
        lb_score.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lb_address.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        lb_address.setText("Address :");
        lb_address.setPreferredSize(null);

        tf_address.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        tf_address.setForeground(new java.awt.Color(102, 102, 102));
        tf_address.setText(" nai jai ter");
        tf_address.setBorder(null);
        tf_address.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tf_address.setEnabled(false);
        tf_address.setSelectionColor(new java.awt.Color(153, 153, 255));
        tf_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_headPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_tel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_username)
                            .addComponent(lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_unsername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(lb_point)
                .addGap(18, 18, 18)
                .addComponent(lb_score, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_email, tf_lastname, tf_name, tf_tel, tf_unsername});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_back, bt_edit});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lb_headPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_unsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_score, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_point, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_email, tf_lastname, tf_name, tf_tel, tf_unsername});

        lb_score.getAccessibleContext().setAccessibleParent(lb_score);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(766, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_delPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_delPFActionPerformed

    private void tf_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_lastnameActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_unsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_unsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_unsernameActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
        tf_name.setEnabled(true);
        tf_lastname.setEnabled(true);
        tf_unsername.setEnabled(true);
        tf_address.setEnabled(true);
        tf_email.setEnabled(true);
        tf_tel.setEnabled(true);
    }//GEN-LAST:event_bt_editActionPerformed

    private void bt_editMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_editMouseDragged

    private void bt_changePF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changePF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_changePF1ActionPerformed

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void tf_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_addressActionPerformed

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
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_changePF1;
    private javax.swing.JButton bt_delPF;
    private javax.swing.JButton bt_edit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_address;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_headPF;
    private javax.swing.JLabel lb_lastname;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_pic;
    private javax.swing.JLabel lb_point;
    private javax.swing.JLabel lb_score;
    private javax.swing.JLabel lb_tel;
    private javax.swing.JLabel lb_username;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_tel;
    private javax.swing.JTextField tf_unsername;
    // End of variables declaration//GEN-END:variables
}
