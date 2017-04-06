package Zad2;

public class User extends Person{
    private String username;
    private String password;

    public User(String name, String surname, int age, String username, String password) {
        super(name, surname, age);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString()+"User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}