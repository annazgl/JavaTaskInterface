package Zad1;

public abstract class Animal {

    public abstract void giveVoice();

}
//jeśli metoda jest abstrakcyjna to klasa też jest abstrakcyjna
//abstrakt - nie mogę tworzyć obiektu w danej klasie
//klasa abstrakcyjna może zawierać metode abstrakcyjna i metoda implementującą a w interface do wersji java 7 może tylko zawierac metode abstrakcyjna;
//od wersji java 8 mamy wartosc default(mozliwosc od razu tylko implementacji)