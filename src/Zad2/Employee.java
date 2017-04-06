package Zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee extends Person implements Comparable<Employee>{
    private double salary;

    public Employee(String name, String surname, int age, double salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        if(getSalary()== emp.getSalary()){
            return 0;
        }else if(getSalary()> emp.getSalary()){
            return 1;
        }else{
            return -1;
        }

        // lub return Double.compare(getSalary(),emp.getSalary());
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Adam", "Kowalski", 12, 10000));
        employeeList.add(new Employee("Piotr", "Nowak", 15, 5342.89));
        employeeList.add(new Employee("Magdalena", "Cieszyńska", 21, 2000));
        employeeList.add(new Employee("Wiesława", "Romaniuk", 19, 40000));
        employeeList.add(new Employee("Adam", "Kowal", 15, 6100));
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
