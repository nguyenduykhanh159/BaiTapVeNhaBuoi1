/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplelab01;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Example5 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered : ";
        
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number : ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
