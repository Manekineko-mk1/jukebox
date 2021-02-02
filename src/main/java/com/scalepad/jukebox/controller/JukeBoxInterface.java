package com.scalepad.jukebox.controller;

import com.scalepad.jukebox.model.Movie;
import com.scalepad.jukebox.model.Song;

public interface JukeBoxInterface {
    public void initJukebox();
    
    public void addSongs (Song song);

    public void addMovie (Movie movie);

    public boolean isValidMoney ();

    public void displayValidMedia();

    public void deductFund(double money);

    public void playSong(Song song);

    public void playMovie(Movie movie);
    
    public void returnRemainingMoney();

    public void rateMedia(double rating);
}
