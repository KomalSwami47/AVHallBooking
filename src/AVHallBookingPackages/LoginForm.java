/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 212704598
 */
public class LoginForm extends javax.swing.JFrame {

    private BookingHandler myBHObj = BookingHandler.createBHObj();
    private DatabaseHandler databaseHandler = DatabaseHandler.createDBHObj();

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        databaseHandler.setDatabaseConnection();
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
        UserNameLabelText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhNumLabelText = new javax.swing.JTextField();
        DoneButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserNameLabelText.setBackground(new java.awt.Color(204, 204, 204));
        UserNameLabelText.setBorder(null);
        UserNameLabelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameLabelTextActionPerformed(evt);
            }
        });
        jPanel2.add(UserNameLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PHONE NUMBER:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        PhNumLabelText.setBackground(new java.awt.Color(204, 204, 204));
        PhNumLabelText.setBorder(null);
        PhNumLabelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhNumLabelTextActionPerformed(evt);
            }
        });
        PhNumLabelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhNumLabelTextKeyPressed(evt);
            }
        });
        jPanel2.add(PhNumLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 170, 30));

        DoneButton.setBackground(new java.awt.Color(102, 204, 255));
        DoneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DoneButton.setText("SIGN IN");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/a4x2a-lc06u.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 140));

        jLabel1.setBackground(new java.awt.Color(255, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("SIGN IN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVHallBookingPackages/cmritIcon.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 120));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("USERNAME:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        PasswordField.setBackground(new java.awt.Color(204, 204, 204));
        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameLabelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameLabelTextActionPerformed

    }//GEN-LAST:event_UserNameLabelTextActionPerformed

    private void PhNumLabelTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhNumLabelTextKeyPressed
        // TODO add your handling code here:
        String phNumber = PhNumLabelText.getText();
        int length = phNumber.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                PhNumLabelText.setEditable(true);
            } else {
                PhNumLabelText.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                PhNumLabelText.setEditable(true);
            } else {
                PhNumLabelText.setEditable(false);
            }
        }
    }//GEN-LAST:event_PhNumLabelTextKeyPressed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed

        String nameLabel = UserNameLabelText.getText().trim();
        String phoneNumber = PhNumLabelText.getText().trim();
        char[] password = PasswordField.getPassword();

        if (nameLabel.isEmpty() || phoneNumber.isEmpty()  || password.length==0) {
            JOptionPane.showMessageDialog(this, "ENTER SUITABLE DATA");
        } else if (phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(this, "ENTER APPROPRIATE PHONE NUMBER");
            PhNumLabelText.setText("");
        } else {
            //myBHObj.createUser(nameLabel, phoneNumber);
            databaseHandler.createUser(nameLabel, phoneNumber);
            dispose();
            WelcomeForm wbf = new WelcomeForm();
            wbf.setVisible(true);
        }
       UserNameLabelText.setText("");
       PhNumLabelText.setText("");
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void PhNumLabelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhNumLabelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhNumLabelTextActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PhNumLabelText;
    private javax.swing.JTextField UserNameLabelText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
