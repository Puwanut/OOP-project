
import gui.LoginForm;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author IsilenceT
 */
public class RunApp {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try (InputStream in = RunApp.class.getResourceAsStream("/fonts/Kanit.ttf");) {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, in));
        } catch (IOException | FontFormatException ex) {
            Logger.getLogger(RunApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        new LoginForm();
    }
    
//    public static void setAppFont(){
//        try (InputStream in = this.getClass().getResourceAsStream("/fonts/Kanit.ttf");) {
//            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, in));
//        } catch (IOException | FontFormatException ex) {
//            Logger.getLogger(RunApp.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
