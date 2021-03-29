/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

/**
 *
 * @author DuyKhanh
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

    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full");
            return 0;
        }
        this.itemsOrdered.add(disc);
        System.out.println("The disc has been added");
        return 1;
    }

    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < this.getItemsOrdered().size(); i++) {
            if (this.itemsOrdered.get(i).equals(disc) == true) {
                this.itemsOrdered.remove(this.itemsOrdered.get(i));
                System.out.println("Remove successfully");
                return 1;
            }
        }
        System.out.println("Remove not successfully");
        return 0;
    }

    public float totalCost() {
        float totalCost = 0.0f;
        for (int i = 0; i < this.getItemsOrdered().size(); i++) {
            totalCost += this.getItemsOrdered().get(i).getCost();
        }
        return totalCost;
    }
}
