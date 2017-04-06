package Zad1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        List<Speakable> animals = new ArrayList<Speakable>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        Speakable myCat = new Cat();

        for(Speakable animal : animals){
            animal.giveVoice();
        }

    }
}
