/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.aimsproject;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 72, 36.11f);
        anOrder.addDigitalVideoDisc(dvd4);
        
//        System.out.println(anOrder.getItemsOrdered().size());
        anOrder.removeDigitalVideoDisc(dvd4);
        anOrder.totalCost();
    }
}
