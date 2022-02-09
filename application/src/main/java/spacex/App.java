package main.java.spacex;

import java.io.IOException;

import main.java.spacex.controller.helper.HelperClockTime;
import main.java.spacex.view.indexs.Home;

public class App {

    public static void main(String[] args) throws IOException {
        new Home();
       HelperClockTime.setInterval(()->{System.out.println("test");},100, -10);
    }
}
