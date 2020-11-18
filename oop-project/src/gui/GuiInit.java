package gui;

import javax.swing.JFrame;

public class GuiInit {

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    public static void initLoginForm() {
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        loginform.pack();
        loginform.setLocationRelativeTo(null);
        loginform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Init LoginForm...");
    }
    
    public static void initRegisterForm() {
        RegisterForm registerform = new RegisterForm();
        registerform.setVisible(true);
        registerform.pack();
        registerform.setLocationRelativeTo(null);
        registerform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Init RegisterForm...");
    }
    
    public static void initAdminGUI() {
        AdminGUI admingui = new AdminGUI();
        admingui.setVisible(true);
        admingui.pack();
        admingui.setLocationRelativeTo(null);
        admingui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Init AdminGUI...");
    }
    
    public static void initUserGUI() {
        UserGUI usergui = new UserGUI();
        usergui.setVisible(true);
        usergui.pack();
        usergui.setLocationRelativeTo(null);
        usergui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Init UserGUI...");
    }
}
