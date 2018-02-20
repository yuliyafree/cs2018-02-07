package by.it.lipatava.lesson06;

public class Dog {

    private int age;
    private String name;
    private int weight; //вес собаки
    private double power; //сила укуса собаки


    public Dog() {
    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кличка: "+name+". Возраст: "+age;
    }
}
