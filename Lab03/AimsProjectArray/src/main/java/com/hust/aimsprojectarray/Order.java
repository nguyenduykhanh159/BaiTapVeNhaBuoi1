/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.aimsprojectarray;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 3;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full");
        } else {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("The disc has been added");
        }
    }
    
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsOrdered[i]) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[--qtyOrdered] = null;
                System.out.println("The disc has been removed");
                return 1;
            }
        }
        System.out.println("The disc you want to delete does not exist");
        return 0;
    }
    
    public float totalCost() {
        float cost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }
}