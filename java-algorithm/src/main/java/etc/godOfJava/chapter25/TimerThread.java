package etc.godOfJava.chapter25;

import java.util.Date;

public class TimerThread extends Thread {
    public void run() {
        printCurrentTime();
    }

    public void reduceTimeGap() {
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime % 1000;
        try {
            Thread.sleep(1000 - timeMod);
        } catch (Exception e) {

        }
    }

    public void printCurrentTimeFirst() {
        try {
            for (int i = 0; i < 10; i++) {
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime) + " " + currentTime);
                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }

    public void printCurrentTime() {
        try {
            for (int i = 0; i < 10; i++) {
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime) + " " + currentTime);
                Thread.sleep(900);
                reduceTimeGap();
            }
        } catch (Exception e) {

        }
    }
}
