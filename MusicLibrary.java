package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicLibrary {


    private String title;
    private String artist;
    private int tracks;
    private double time;

    public MusicLibrary(String titleName, String artistName, int numTracks, double playTime){

        title = titleName;
        artist = artistName;
        tracks = numTracks;
        time = playTime;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }





    public String toString(){

        return "Album: " + title + "\nArtist: " + artist + "\nTracks: " + tracks + "\nTotal Play time: " + title + "\n";

    }


    public static void main(String[] args){

       // Albums myLibrary = new Albums();

        ArrayList<MusicLibrary> library = new ArrayList<MusicLibrary>();
        Scanner input = new Scanner(System.in);



        MusicLibrary album1 = new MusicLibrary("One", "BTS", 10, 42.5);
        MusicLibrary album2 = new MusicLibrary("Two", "BTS", 12, 12);
        MusicLibrary album3 = new MusicLibrary("Three", "BTS", 7, 102.2);


        library.add(album1);
        library.add(album2);
        library.add(album3);


     /*

        int idx2 = library.indexOf(album2);


        System.out.println(idx);
        System.out.println(idx2);

    */

        int idx = 0;

        System.out.println("Which album are you looking for?");
        String targetAlbumName = input.nextLine();



        for (int i = 0; i < library.size(); i++){

            if (album1.getTitle().contains(targetAlbumName)){
                 idx = library.indexOf(album1);
            }

            else if (album2.getTitle().contains(targetAlbumName)){
                idx = library.indexOf(album2);
            }

            else if (album3.getTitle().contains(targetAlbumName)){
                idx = library.indexOf(album3);
            }

        }

        System.out.println(idx);






    }
}
