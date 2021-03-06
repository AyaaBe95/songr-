package songr.example.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int length;
    private int trackNumber;

    @ManyToOne
    private  Album album;


    //constructor
    public Song(String title, int length, int trackNumber,Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album=album;
    }

    public Song(){

    }

    //setters and getters
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

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}


