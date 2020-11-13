/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author IsilenceT
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null); //set location Jframe Center
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pa_top = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        pa_center = new javax.swing.JPanel();
        lb_username = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        tf_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        pa_backtologin = new javax.swing.JPanel();
        lb_beforesignin = new javax.swing.JLabel();
        lb_signup = new javax.swing.JLabel();
        lb_password1 = new javax.swing.JLabel();
        pf_password1 = new javax.swing.JPasswordField();
        lb_firstname = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_surname = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        tf_firstname1 = new javax.swing.JTextField();
        tf_surname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setResizable(false);

        pa_top.setBackground(new java.awt.Color(245, 175, 39));
        pa_top.setToolTipText("");

        loginLabel.setFont(new java.awt.Font("Kanit", 0, 48)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Account Register");

        javax.swing.GroupLayout pa_topLayout = new javax.swing.GroupLayout(pa_top);
        pa_top.setLayout(pa_topLayout);
        pa_topLayout.setHorizontalGroup(
            pa_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        pa_topLayout.setVerticalGroup(
            pa_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pa_top, java.awt.BorderLayout.NORTH);

        pa_center.setBackground(new java.awt.Color(57, 62, 70));

        lb_username.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_username.setForeground(new java.awt.Color(255, 255, 255));
        lb_username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_username.setText("Username : ");

        lb_password.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_password.setText("Password : ");

        btn_login.setBackground(new java.awt.Color(82, 142, 177));
        btn_login.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Sign up");
        btn_login.setBorder(null);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        tf_username.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        tf_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_usernameMouseClicked(evt);
            }
        });
        tf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usernameActionPerformed(evt);
            }
        });

        pf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_passwordActionPerformed(evt);
            }
        });

        pa_backtologin.setBackground(pa_center.getBackground());

        lb_beforesignin.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        lb_beforesignin.setForeground(new java.awt.Color(204, 204, 204));
        lb_beforesignin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_beforesignin.setText("Already have an account?");

        lb_signup.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        lb_signup.setForeground(new java.awt.Color(102, 153, 255));
        lb_signup.setText("Sign in");
        lb_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_signupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pa_backtologinLayout = new javax.swing.GroupLayout(pa_backtologin);
        pa_backtologin.setLayout(pa_backtologinLayout);
        pa_backtologinLayout.setHorizontalGroup(
            pa_backtologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_backtologinLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lb_beforesignin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_signup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa_backtologinLayout.setVerticalGroup(
            pa_backtologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_backtologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lb_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lb_beforesignin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lb_password1.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_password1.setForeground(new java.awt.Color(255, 255, 255));
        lb_password1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_password1.setText("Confirm Password : ");

        pf_password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_password1ActionPerformed(evt);
            }
        });

        lb_firstname.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_firstname.setForeground(new java.awt.Color(255, 255, 255));
        lb_firstname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_firstname.setText("Firstname : ");

        lb_email.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_email.setForeground(new java.awt.Color(255, 255, 255));
        lb_email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_email.setText("Email : ");

        lb_surname.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_surname.setForeground(new java.awt.Color(255, 255, 255));
        lb_surname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_surname.setText("Surname : ");

        tf_email.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        tf_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_emailMouseClicked(evt);
            }
        });
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });

        tf_firstname1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        tf_firstname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_firstname1MouseClicked(evt);
            }
        });
        tf_firstname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_firstname1ActionPerformed(evt);
            }
        });

        tf_surname.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        tf_surname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_surnameMouseClicked(evt);
            }
        });
        tf_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_surnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_centerLayout = new javax.swing.GroupLayout(pa_center);
        pa_center.setLayout(pa_centerLayout);
        pa_centerLayout.setHorizontalGroup(
            pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pa_backtologin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pa_centerLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_centerLayout.createSequentialGroup()
                        .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_surname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_firstname1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pa_centerLayout.createSequentialGroup()
                        .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_password1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(pa_centerLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa_centerLayout.setVerticalGroup(
            pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_centerLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_firstname)
                    .addComponent(tf_firstname1))
                .addGap(26, 26, 26)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_surname)
                    .addComponent(tf_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_email)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_username)
                    .addComponent(lb_username))
                .addGap(29, 29, 29)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pa_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pf_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pa_backtologin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pa_center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameMouseClicked

    private void tf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameActionPerformed

    private void pf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_passwordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void pf_password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_password1ActionPerformed

    private void tf_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_emailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailMouseClicked

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void tf_firstname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_firstname1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_firstname1MouseClicked

    private void tf_firstname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_firstname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_firstname1ActionPerformed

    private void tf_surnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_surnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_surnameMouseClicked

    private void tf_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_surnameActionPerformed

    private void lb_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_signupMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lb_signupMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lb_beforesignin;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_firstname;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_password1;
    private javax.swing.JLabel lb_signup;
    private javax.swing.JLabel lb_surname;
    private javax.swing.JLabel lb_username;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel pa_backtologin;
    private javax.swing.JPanel pa_center;
    private javax.swing.JPanel pa_top;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_password1;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_firstname1;
    private javax.swing.JTextField tf_surname;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
