package gui;

import java.awt.*;
import javax.swing.*;

public class AdminGUI {
    private AdminMenu menu;
    private static JFrame frame;
    private static JPanel pa_center;
    private JPanel pa_search, pa_borrowNreturn, pa_history, pa_book;

    public AdminGUI() {
        frame = new JFrame("Library System");
        menu = new AdminMenu();
        menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        
        pa_center = new JPanel();
        pa_search = new AdminSearch();
        pa_borrowNreturn = new AdminBorrowNreturn();
        pa_history = new AdminHistory();
        pa_book = new AdminBook();
        
        pa_center.setLayout(new CardLayout());
        pa_center.add(pa_search, "panel_search");
        pa_center.add(pa_borrowNreturn, "panel_borrowNreturn");
        pa_center.add(pa_history, "panel_history");
        pa_center.add(pa_book, "panel_book");

        frame.add(menu, BorderLayout.WEST);
        frame.add(pa_center, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void getCenterPanel(String panel_name){
        CardLayout card = (CardLayout)(pa_center.getLayout());
        card.show(pa_center, panel_name);
        System.out.println("Change to " + panel_name);
    }

    public static void logout() {
        frame.dispose();
        new LoginForm().setVisible(true);
    }

    public static void main(String[] args) {
        new AdminGUI();
    }
    
    
//    public static void main(String[] args) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new LoginForm().setVisible(true);
//            }
//        });
//    }
//
//    public static void initLoginForm() {
//        LoginForm loginform = new LoginForm();
//        loginform.setVisible(true);
//        loginform.pack();
//        loginform.setLocationRelativeTo(null);
//        loginform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        System.out.println("Init LoginForm...");
//    }
//    
//    public static void initRegisterForm() {
//        RegisterForm registerform = new RegisterForm();
//        registerform.setVisible(true);
//        registerform.pack();
//        registerform.setLocationRelativeTo(null);
//        registerform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        System.out.println("Init RegisterForm...");
//    }
//    
//    public static void initAdminGUI() {
//        AdminGUI admingui = new AdminGUI();
//        admingui.setVisible(true);
//        admingui.pack();
//        admingui.setLocationRelativeTo(null);
//        admingui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        System.out.println("Init AdminGUI...");
//    }
//    
//    public static void initUserGUI() {
//        UserGUI usergui = new UserGUI();
//        usergui.setVisible(true);
//        usergui.pack();
//        usergui.setLocationRelativeTo(null);
//        usergui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        System.out.println("Init UserGUI...");
//    }
}
