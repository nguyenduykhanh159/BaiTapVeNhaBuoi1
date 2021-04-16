/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class DVDFactory implements AbstractItemFactory{
    @Override
    public Media createMediaItemFromConsole() {
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter title : ");
        dvd.setTitle(input.nextLine());
        System.out.print("Enter category : ");
        dvd.setCategory(input.nextLine());
        System.out.print("Enter cost : ");
        dvd.setCost(input.nextFloat());
        System.out.print("Enter length : ");
        dvd.setLength(input.nextInt());
        input.nextLine();
        System.out.print("Enter director : ");
        dvd.setDirector(input.nextLine());
        
        return dvd;
    }
}
