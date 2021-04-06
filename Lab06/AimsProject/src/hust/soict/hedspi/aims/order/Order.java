/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author DuyKhanh
 */
public class Order {
    private List<Media> listOfItems = new ArrayList<Media>();
    public static final int MAX_NUMBERS_ORDERED_ITEMS = 3;
    public static final int MAX_LIMITTED_ORDERED = 1;
    private static int nbOrders = 0;
    private MyDate dateOrder;

    public Order(MyDate dateOrder) {
        nbOrders++;
        this.dateOrder = dateOrder;
    }
    
    public static boolean checknbOrders(){
        return nbOrders < MAX_LIMITTED_ORDERED; 
    }
    
    public int addMedia(Media item) {
        if (listOfItems.size() >= MAX_NUMBERS_ORDERED_ITEMS) {
            System.out.println("Add item unsuccessfully");
            return 0;
        }
        listOfItems.add(item);
        System.out.println("Add item successfully");
        return 1;
    }
    
    public int addMedia(List<Media> items) {
        int check = 0;
        for (int i = 0; i < items.size(); i++) {
            if (listOfItems.size() >= MAX_NUMBERS_ORDERED_ITEMS) {
                System.out.println("Add item unsuccessfully");
                check = 0;
            } else {
                listOfItems.add(items.get(i));
                System.out.println("Add item successfully");
                check = 1;
            }
        }
        return check;
    }
    
    public int removeItem(Media item) {
        int check = 0;
        if (listOfItems.contains(item) == false) {
            System.out.println("Item not exist");
            return 0;
        }
        listOfItems.remove(item);
        return 1;
    }
    
    public int removeItemByTitle(String title) {
        int check = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getTitle().equals(title)) {
                listOfItems.remove(listOfItems.get(i));
                System.out.println("Delete successfully");
                check = 1;
            } else {
                check = 0;
            }
        }
        if (check == 0) {
            System.out.println("The item has title "+title+" not exist");
        }
        return check;
    }
    
    public float totalCost() {
        float cost = 0.0f;
        for (int i = 0; i < listOfItems.size(); i++) {
            cost += listOfItems.get(i).getCost();
        }
        return cost;
    }
    
    public void printOrdered() {
        System.out.println("***********************Order***********************");
        System.out.print("Date : "); dateOrder.print();
        System.out.println("Order Items : ");
        for (int i = 0; i < listOfItems.size(); i++) {
            System.out.println((i + 1) + ". " + listOfItems.get(i).printInfor());
        }
        System.out.println("Total cost : " + totalCost() + "$");
        System.out.println("***************************************************");
    }
    
    public Media luckyItem() {
        Random random = new Random();
        return listOfItems.get(random.nextInt(listOfItems.size()));
    }
    
    public float totalCostWithLuckyItem() {
        float cost = 0.0f;
        Media luckyItem = luckyItem();
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).equals(luckyItem) == false) {
                cost += listOfItems.get(i).getCost();
            }
        }
        return cost;
    }
    
    public void printOrderedWithLuckyItem() {
        Media luckyItem = luckyItem();
        int j = 1;

        System.out.println("***********************Order***********************");
        System.out.print("Date : "); dateOrder.print();
        System.out.println("A lucky and free item is : " + luckyItem.printInfor());
        System.out.println("Order Items : ");
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).equals(luckyItem) == false) {
                System.out.println(j++ + ". " + listOfItems.get(i).printInfor());
            }
        }
        System.out.println("Total cost : " + totalCostWithLuckyItem() + "$");
        System.out.println("***************************************************");
    }
}
