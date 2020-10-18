package com.pattern.facade;

public class HomeTheaterFacade {

    Light light;
    Screen screen;
    DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Light light, Screen screen, DvdPlayer dvdPlayer) {
        this.light = light;
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        light.off();
        screen.down();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        light.on();;
        screen.up();
        dvdPlayer.off();
    }
}
