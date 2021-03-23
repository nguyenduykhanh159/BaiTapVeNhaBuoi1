/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.example;

import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Example3 {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name :");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
