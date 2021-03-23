/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.aimsprojectarraylist;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 3;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public Order() {
        
    }

    public ArrayList<DigitalVideoDisc> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<DigitalVideoDisc> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        this.getItemsOrdered().add(disc);
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        this.getItemsOrdered().remove(disc);
    }
    
    public void totalCost() {
        if (this.getItemsOrdered().size() > MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full");
        } else {
            System.out.println("The disc has been added");
            float totalCost = 0.0f;
            for (int i = 0; i < this.getItemsOrdered().size(); i++) {
                totalCost += this.getItemsOrdered().get(i).getCost();
            }
            System.out.println("Total cost is : " + totalCost);
        }
    }
}
