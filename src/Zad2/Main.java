package Zad2;

public class Main {

    /*Zdefiniuj klasę Person, oraz klasę dziedziczącą Employee, zaimplementuj interfejs Comparable I skorzystaj z metody
     Sort w Collection*/

    public static void main(String[] args) {
        Person adam = new Person("Adam", "Kowalski", 21);
        Person zosia = new Person("Zofia", "Rutowicz", 53);
        zosia.setAge(-5);

        System.out.println(zosia);

        int a = 10;
        int b =20;
        b=a;
        a=14;
        System.out.println("Zmienna a wynosi "+ a + "a zmienna b to" + b);

        zosia = adam;
        adam.setName("Zdzisław");
        System.out.println("Zmienna adam to"+ adam+ "zmienna zosia to"+ zosia);

        Person[] people = new Person[5];
        people[0] = new Person("Adam", "Kowalski", 21);
        people[1] = new Employee("Wiesława", "Zaborowska", 18,25000.21);
        people[2] = new User("Justyna", "Kondej", 16, "justynos", "misia19");
        people[3] = new Employee("Magdalena", "Kondej", 16,2012.21);
        people[4] = new User("Zdzisław", "Python", 16, "zdzisiek","ala1234");

        for(Person person:people){
            if (person instanceof Employee){ //rzutowanie na employee
                Employee employee = (Employee) person;
                System.out.println(employee.getSalary());
            }
            else {
                System.out.println(person);
            }
        }

    }
}
