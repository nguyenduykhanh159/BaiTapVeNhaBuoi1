/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

/**
 *
 * @author DuyKhanh
 */
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 3;
    public static final int MAX_LIMITTED_ORDERED = 1;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private static int nbOrdered = 0;
    private MyDate dateOrdered;

    public Order(MyDate dateOrdered) {
        nbOrdered++;
        this.dateOrdered = dateOrdered;
    }

    public static boolean checknbOrdered() {
        return nbOrdered < MAX_LIMITTED_ORDERED;
    }

//    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
//        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//            System.out.println("The order is almost full");
//            return 0;
//        } else {
//            itemsOrdered[qtyOrdered++] = disc;
//            System.out.println("The disc has been added");
//            return 1;
//        }
//    }

    public int addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
        int check = 0;
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The order is almost full");
                check = 0;
            } else {
                itemsOrdered[qtyOrdered++] = dvdList[i];
                System.out.println("The disc has been added");
                check = 1;
            }
        }
        return check;
    }

    public void printDiscNotAdded(DigitalVideoDisc dvdList[]) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The disc list has not been added is : ");
            for (int j = MAX_NUMBERS_ORDERED; j < dvdList.length; j++) {
                System.out.println(dvdList[j].getTitle() + " ");
            }
        }
    }

    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc) == true) {
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

    public void printOrdered() {
        System.out.println("***********************Order***********************");
        System.out.print("Date : "); dateOrdered.print();
        System.out.println("Order Items : ");
        for (int i = 0; i < itemsOrdered.length; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost : " + totalCost() + "$");
        System.out.println("***************************************************");
    }
}
