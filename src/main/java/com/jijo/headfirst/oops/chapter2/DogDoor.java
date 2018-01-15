package com.jijo.headfirst.oops.chapter2;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor(){
        this.open = false;
        this.allowedBarks = new LinkedList();
    }

    public void open(){
        System.out.println("The dog door opens");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        },5000);
    }

    public void close(){
        System.out.println("The dog door closes");
        open = false;
    }
    public boolean isOpen(){
        return this.open;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void addAllowedBarks(Bark bark) {
        this.allowedBarks.add(bark);
    }
}
