/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

/**
 *
 * @author DuyKhanh
 */
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> listOfTracks = new ArrayList<Track>();
    
    public CompactDisc() {
        
    }

    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Track> getListOfTracks() {
        return listOfTracks;
    }

    public void setListOfTracks(ArrayList<Track> listOfTracks) {
        this.listOfTracks = listOfTracks;
    }
    
    public int addTrack(Track track) {
        if (listOfTracks.isEmpty() || listOfTracks.contains(track) == false) {
            listOfTracks.add(track);
//            System.out.println("Add track successfully");
            return 1;
        }
//        System.out.println("Add track unsuccessfully");
        return 0;
    }
    
    public int removeTrack(Track track) {
        if (listOfTracks.contains(track) == false) {
            System.out.println("Remove track unsuccessfully");
            return 0;
        }
        listOfTracks.remove(track);
        System.out.println("Remove track successfully");
        return 1;
    }
    
    public int getTotalLength() {
        int sumLength = 0;
        for (int i = 0; i < listOfTracks.size(); i++) {
            sumLength += listOfTracks.get(i).getLength();
        }
        return sumLength;
    }
    
    @Override
    public String printInfor() {
        return "CompactDisc{" + "title=" + this.getTitle() + ", category=" + this.getCategory() + ", cost=" + this.getCost() + ", director=" + this.getDirector() + ", length=" + this.getTotalLength() + ", artist=" + this.getArtist() + ", track=" + listOfTracks.toString() + '}';
    }
    
    @Override
    public void play() {
        for (int i = 0; i < listOfTracks.size(); i++) {
            listOfTracks.get(i).play();
        }
    }
}
