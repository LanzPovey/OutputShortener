/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package outputshortener;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class OutputShortener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
     //============================Code Shorteners===============================
 /**
 * A shortened JOPtionPane.showMessageDialog, as to help condense the code.
 * As it is the only type of possible output, it's generic name suits it well.
 * @param text the text to be displayed from the JOptionPane.showMessageDialog.
 */
 public static void output(String text) 
 {
 JOptionPane.showMessageDialog(null, text);
 JOptionPane.showMessageDialog(null, text);
 }
 
 /**
 * A method that sets the color for futureJOptionPane messages
 * (By future, I'm referring to every single JOptionPane message in the future)
 */
 public static void outputc()
 {
 UIManager um = new UIManager();
 um.put("OptionPane.messageForeground", Color.blue);
 um.put("Panel.background", Color.white);
 JOptionPane.showMessageDialog(null,"Loading...","Set Color",
 JOptionPane.PLAIN_MESSAGE);
 //isMouseWithinComponent();
 }
}
