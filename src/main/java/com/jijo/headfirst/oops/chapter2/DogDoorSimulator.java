package com.jijo.headfirst.oops.chapter2;

public class DogDoorSimulator {
    public static void main(String...args){
        DogDoor door = new DogDoor();
        door.addAllowedBarks(new Bark("rowlf"));
        door.addAllowedBarks(new Bark("rooowlf"));
        door.addAllowedBarks(new Bark("rawlf"));
        door.addAllowedBarks(new Bark("woof"));
        BarkingRecognizer recognizer = new BarkingRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Bruce starts barking");
        recognizer.recognize(new Bark("rowlf"));
        System.out.println("\nBruce has gone outside...");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("\nBruce's all done");
        System.out.println("...but he is stuck outside");

        Bark smallDogBark = new Bark("yip");
        System.out.println("\nA small dog starts barking");
        recognizer.recognize(smallDogBark);
        try{
            Thread.currentThread().sleep(5000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Bruce starts barking");
        recognizer.recognize(new Bark("rooowlf"));
        System.out.println("\nBruce's back inside");
    }
}
