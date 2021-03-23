/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.aimsproject;

/**
 *
 * @author Administrator
 */
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 3;
    public static final int MAX_LIMITTED_ORDERED = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private static int nbOrdered = 0;
    
    public Order() {
        nbOrdered++;
        Order.nbOrdered = nbOrdered;
    }
    
    public static boolean checknbOrdered() {
        return nbOrdered < MAX_LIMITTED_ORDERED;
    }
//    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
//        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
//            System.out.println("The order is almost full");
//        } else {
//            itemsOrdered[qtyOrdered++] = disc;
//            System.out.println("The disc has been added");
//        }
//    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("The order is almost full");
            } else {
                itemsOrdered[qtyOrdered++] = dvdList[i];
                System.out.println("The disc has been added");
            }
        }
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The disc list has not been added is : ");
            for (int j = MAX_NUMBERS_ORDERED; j < dvdList.length; j++) {
                System.out.println(dvdList[j].getTitle());
            }
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
    
    public void printOrdered(MyDate dateOrdered) {
        System.out.println("***********************Order***********************");
        System.out.print("Date : "); dateOrdered.print();
        System.out.println("Order Items : ");
        for (int i = 0; i < itemsOrdered.length; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].getTitle() + " : " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost : " + totalCost() + "$");
        System.out.println("***************************************************");
    }
}
