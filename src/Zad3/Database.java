package Zad3;

//Zosia pracuje nad implementacja zapisywania do bazy danych
public class Database implements Savable{

    @Override
    public void save() {
        System.out.println("Zapisuje do bazy danych");
    }
}
