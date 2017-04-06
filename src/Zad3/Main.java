package Zad3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    /*Stwórz klasę Person, która będzie zawierała metodę save(metoda ta zapisuje informację do bazy danych). Zaprojektuj
    ją tak,aby w przyszłości jej implementacja mogłaby być dostarczona przez zewnętrzną klasę i metodę. Tzn. początkowo
    zakładamy,że dane będą zapisywane do baz danych, natomiast w przyszłości może okazać się, że lepiej będzie Cachować
     dane. Stwórz przykładowe klasy do Bazy Danych i Cachowania.*/

    public static void main(String[] args) {
        LinkedHashMap<String,String>linkedHashMap = new LinkedHashMap<>();
        Word(linkedHashMap);

        System.out.println(linkedHashMap);
    }
    private static void Word (Map<String,String> map){
        map.put("kot", "cat");
        map.put("pies","dog");
        map.put("krowa","cow");
        map.put("świnia","pig");
    }
}
