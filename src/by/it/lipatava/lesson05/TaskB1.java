package by.it.lipatava.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);

        for (int i = 0; i < 5; i++) {
            list.add("String" + (i + 1));
        }

        System.out.println(list.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
