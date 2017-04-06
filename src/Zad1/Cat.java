package Zad1;

public class Cat extends Animal implements Speakable{


    @Override
    public void giveVoice(){
        System.out.println("miau miau");
    }
}
