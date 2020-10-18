package com.pattern.facade;

public class HomeTheaterFacadeTest {

    public static void main(String[] args) {
        Light light = new Light();
        Screen screen = new Screen();
        DvdPlayer dvdPlayer = new DvdPlayer();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(light, screen, dvdPlayer);

        homeTheaterFacade.watchMovie("The Graduate");
        homeTheaterFacade.endMovie();
    }
}
