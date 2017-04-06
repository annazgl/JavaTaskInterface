package Zad1;

import java.util.ArrayList;

public class Main {

    /*Zdefiniuj inteface Głos z metodą dajGlos. Stwórz 2 klasy Kot i Pies implementujące dany interfejs, zdefiniuj
     przykładowe dane. Stwórz ArrayListę zwierząt, wywołaj metodę dajGłos.*/

    public static void main(String[] args) {
        ArrayList<Animal>animals = new ArrayList<Animal>();

        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());

        for(Animal animal : animals){
            animal.giveVoice();

        }

    }
}
