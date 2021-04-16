/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author DuyKhanh
 */
public class Track implements Playable{
    private String title;
    private int length;

    public Track() {
        
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Track{" + "title=" + title + ", length=" + length + '}';
    }
    
    @Override
    public void play() {
        System.out.println("Playing track : " + this.getTitle());
        System.out.println("Track length : " + this.getLength());
    }
}
