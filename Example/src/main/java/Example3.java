
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
// Example 3 : HelloNameDialog.java
public class Example3 {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name :");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
