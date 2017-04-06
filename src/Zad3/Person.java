package Zad3;

//Klase Person implementuje Łukasz

public class Person {
    private Savable savable;

    public Savable getSavable() {
        return savable;
    }

    public void setSavable(Savable savable) {
        this.savable = savable;
    }

    public void save(){
        savable.save();

    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setSavable(new Database());
        person.save();
        person.setSavable(new Cache());
        person.save();
        //zmieniam tylko seter
    }
}

