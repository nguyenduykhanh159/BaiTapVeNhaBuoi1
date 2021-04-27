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
public class CDFactory implements AbstractItemFactory{
    @Override
    public Media createMediaItemFromConsole() {
        CompactDisc cd = new CompactDisc();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter title : ");
        cd.setTitle(input.nextLine());
        System.out.print("Enter category : ");
        cd.setCategory(input.nextLine());
        System.out.print("Enter cost : ");
        cd.setCost(input.nextFloat());
        input.nextLine();
        System.out.print("Enter director : ");
        cd.setDirector(input.nextLine());
        System.out.print("Enter artist : ");
        cd.setArtist(input.nextLine());
        System.out.print("Enter count of track : ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            input.nextLine();
            Track track = new Track();
            System.out.println("Enter track " + (i + 1) + " : ");
            System.out.print("Enter title of track : ");
            track.setTitle(input.nextLine());
            System.out.print("Enter length of track : ");
            track.setLength(input.nextInt());
            cd.addTrack(track);
        }
        
        return cd;
    }
}
