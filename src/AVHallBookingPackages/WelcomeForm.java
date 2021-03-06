/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

/**
 *
 * @author 212704598
 */
public class WelcomeForm extends javax.swing.JFrame {
    DatabaseHandler databaseHandler = DatabaseHandler.createDBHObj();
    /**
     * Creates new form BookingForm
     */
    public WelcomeForm() {
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

        jPanel2 = new javax.swing.JPanel();
        BookButton = new javax.swing.JButton();
        CheckButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookButton.setBackground(new java.awt.Color(255, 255, 255));
        BookButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BookButton.setText(" NEW BOOKING");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        CheckButton.setBackground(new java.awt.Color(255, 255, 255));
        CheckButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CheckButton.setText(" CHECK BOOKING");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CheckButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        UpdateButton.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateButton.setText(" UPDATE BOOKING");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        CancelButton.setBackground(new java.awt.Color(255, 255, 255));
        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelButton.setText("CANCEL BOOKING");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        signOutButton.setBackground(new java.awt.Color(255, 51, 51));
        signOutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signOutButton.setText("SIGN OUT");
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/menuOnCardboard.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 210, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        BookingForm bkf= new BookingForm();
        bkf.setVisible(true);
    }//GEN-LAST:event_BookButtonActionPerformed

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ShowBookingForm sbf= new ShowBookingForm();
        sbf.setVisible(true);
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        UpdateBookingForm ubf= new UpdateBookingForm();
        ubf.setVisible(true);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        CancelBookingForm cbf= new  CancelBookingForm();
        cbf.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        databaseHandler.signOut();
        dispose();
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
    }//GEN-LAST:event_signOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CheckButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton signOutButton;
    // End of variables declaration//GEN-END:variables
}
