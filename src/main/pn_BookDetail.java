package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author USER
 */
public class pn_BookDetail extends javax.swing.JPanel {

    /**
     * Creates new form BookPanel
     */
    public pn_BookDetail() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic_book = new javax.swing.JLabel();
        lb_book = new javax.swing.JLabel();
        lb_author = new javax.swing.JLabel();
        lb_cate = new javax.swing.JLabel();
        bt_addtocart = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 252, 252));
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(155, 315));

        pic_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic_book.setText("[ book cover  ]");
        pic_book.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pic_book.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pic_book.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pic_book.setVerifyInputWhenFocusTarget(false);

        lb_book.setFont(new java.awt.Font("supermarket", 1, 16)); // NOI18N
        lb_book.setText("[ Book name ]");

        lb_author.setFont(new java.awt.Font("supermarket", 0, 15)); // NOI18N
        lb_author.setText("  โดย: ");

        lb_cate.setFont(new java.awt.Font("supermarket", 0, 15)); // NOI18N
        lb_cate.setText("  หมวดหมู่: ");

        bt_addtocart.setBackground(new java.awt.Color(7, 84, 28));
        bt_addtocart.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        bt_addtocart.setForeground(new java.awt.Color(255, 255, 255));
        bt_addtocart.setText("Add to cart");
        bt_addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addtocartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_addtocart)
                .addGap(0, 0, 0))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_book, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(pic_book, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lb_cate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(lb_author, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pic_book, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lb_author, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lb_cate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lb_book, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(bt_addtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addtocartActionPerformed
        if(evt.getSource().equals(bt_addtocart)){
            cs_BookView bookView = new cs_BookView();
        }
    }//GEN-LAST:event_bt_addtocartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addtocart;
    private javax.swing.JLabel lb_author;
    private javax.swing.JLabel lb_book;
    private javax.swing.JLabel lb_cate;
    private javax.swing.JLabel pic_book;
    // End of variables declaration//GEN-END:variables
}
