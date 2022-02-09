package main.java.spacex.controller.helper;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;


import main.java.spacex.controller.bussines.logs.BussinesLog;

public class HelperClockTime {

   static BussinesLog LOGGER = new BussinesLog(HelperClockTime.class);

    public static void setInterval(Runnable function, int delay, int repeat) {
        if (repeat<0) {
            LOGGER.infor("Repeat menor que 0");
        }
        while (repeat > 0) {
            taskl(function, delay, repeat);
            repeat = repeat -1;
        }

    }

    private static void taskl(Runnable function, int delay, int repeat) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                function.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();

    }

}
