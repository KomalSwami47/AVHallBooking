/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author 212704598
 */
public class ShowBookingForm extends javax.swing.JFrame {

    BookingHandler myBHObj = BookingHandler.createBHObj();
    DatabaseHandler databaseHandler = DatabaseHandler.createDBHObj();

    public ShowBookingForm() {
        initComponents();
        bookedDateList.setListData(new String[]{"YOUR BOOKINGS WILL BE DISPLAYED HERE"});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ShowDatesButton = new javax.swing.JButton();
        dateListParent = new javax.swing.JScrollPane();
        bookedDateList = new javax.swing.JList<>();
        SignOutLabel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShowDatesButton.setBackground(new java.awt.Color(255, 255, 255));
        ShowDatesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowDatesButton.setText(" CHECK  BOOKINGS");
        ShowDatesButton.setBorder(null);
        ShowDatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDatesButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ShowDatesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, 40));

        bookedDateList.setToolTipText("");
        bookedDateList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookedDateListKeyPressed(evt);
            }
        });
        dateListParent.setViewportView(bookedDateList);

        jPanel2.add(dateListParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        SignOutLabel.setBackground(new java.awt.Color(255, 51, 51));
        SignOutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignOutLabel.setText("SIGN OUT");
        SignOutLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutLabelActionPerformed(evt);
            }
        });
        jPanel2.add(SignOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/listPaper3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/realreview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 280, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/BACKiCONnEW.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowDatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDatesButtonActionPerformed

        //ArrayList<String> bookedDates = myBHObj.getBookings();
       ArrayList<String> bookedDates = databaseHandler.getBookings();
        if (bookedDates == null || bookedDates.size() == 0) {
            JOptionPane.showMessageDialog(this, "NO BOOKiNG PRESENT");
        } else {
            bookedDateList.setListData(bookedDates.toArray(new String[bookedDates.size()]));
        }
        //dateListParent.setVisible(true);  //try this
    }//GEN-LAST:event_ShowDatesButtonActionPerformed

    private void bookedDateListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookedDateListKeyPressed
       
    }//GEN-LAST:event_bookedDateListKeyPressed

    private void SignOutLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutLabelActionPerformed
       databaseHandler.signOut();
        dispose();
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
    }//GEN-LAST:event_SignOutLabelActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
        WelcomeForm wbf = new WelcomeForm();
        wbf.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShowDatesButton;
    private javax.swing.JButton SignOutLabel;
    private javax.swing.JList<String> bookedDateList;
    private javax.swing.JScrollPane dateListParent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
