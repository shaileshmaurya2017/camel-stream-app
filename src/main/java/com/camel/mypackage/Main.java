package com.camel.mypackage;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList emp = new ArrayList<>();
        emp.add(new Employee(
            "shailesh",
                    30
        ));
        emp.add(new Employee(
                "ajay",
                35
        ));
        emp.add(new Employee(
                "ganpat",
                24
        ));


        List<String> al =  Arrays.asList("s","a","ed","dede","jkl");
        al.stream().filter((data)->data.equals("s")).forEach(x->System.out.println(x));
        al.stream().sorted((x,y)->y.compareTo(x)).forEach(x->System.out.println(x));
        al.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
        emp.stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach((x)->System.out.println(x.toString())); //.forEach(x->System.out.println(x));
        emp.stream().sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(x->System.out.println(x.toString()));
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
