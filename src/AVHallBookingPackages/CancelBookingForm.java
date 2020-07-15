/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 212704598
 */
public class CancelBookingForm extends javax.swing.JFrame {

    BookingHandler myBHObj = BookingHandler.createBHObj();
    DatabaseHandler databaseHandler = DatabaseHandler.createDBHObj();
    
    /**
     * Creates new form CancelBookingForm
     */
    public CancelBookingForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cancelDateLabel = new com.toedter.calendar.JDateChooser();
        cancelButton = new javax.swing.JButton();
        cancelAllButton = new javax.swing.JButton();
        SignOutLabel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DATE:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        cancelDateLabel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(cancelDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 190, -1));

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        cancelAllButton.setBackground(new java.awt.Color(0, 102, 153));
        cancelAllButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelAllButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelAllButton.setText("CANCEL ALL MY BOOKINGS");
        cancelAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAllButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        SignOutLabel.setBackground(new java.awt.Color(255, 51, 51));
        SignOutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignOutLabel.setText("SIGN OUT");
        SignOutLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutLabelActionPerformed(evt);
            }
        });
        jPanel2.add(SignOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/realCancel.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 300, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/BACKiCONnEW.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Date date = cancelDateLabel.getDate();
        if (date == null) {
            JOptionPane.showMessageDialog(this, "ENTER DATE TO BE CANCELLED");
        }
        else
        {
            //boolean isCancelled = myBHObj.cancelBooking(date);
            boolean isCancelled = databaseHandler.cancelBooking(date);
            if(isCancelled)
            {
                JOptionPane.showMessageDialog(this, "BOOKING IS CANCELLED");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "NO BOOKING ON SUCH DATE");   
            }
            cancelDateLabel.setCalendar(null);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cancelAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAllButtonActionPerformed
        //boolean isCancelled = myBHObj.cancelAllBooking();
        boolean isCancelled = databaseHandler.cancelAllBooking();
        if(isCancelled)
        {
            JOptionPane.showMessageDialog(this, "ALL BOOKINGS CANCELED ON YOUR NAME");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "NO BOOKINGS ON YOUR NAME");
        }
        cancelDateLabel.setCalendar(null);
    }//GEN-LAST:event_cancelAllButtonActionPerformed

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
    private javax.swing.JButton SignOutLabel;
    private javax.swing.JButton cancelAllButton;
    private javax.swing.JButton cancelButton;
    private com.toedter.calendar.JDateChooser cancelDateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
