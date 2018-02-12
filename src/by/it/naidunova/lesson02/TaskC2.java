package by.it.naidunova.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите число a");
        a= in.nextInt();
        System.out.println("Введите число b");
        b= in.nextInt();
        c = a + b;
        System.out.print("DEC");
        System.out.print(" ");
        System.out.println(a + "+" + b + "=" + c);

        // Бинарный формат числа
        String a1 = Integer.toBinaryString(a);
        String b1 = Integer.toBinaryString(b);
        String c1 = Integer.toBinaryString(c);
        System.out.print ("BIN");
        System.out.print(" ");
        System.out.println(a1 + "+" + b1 + "=" + c1);

        // Шеснадцатиричная форма
        String a2 = Integer.toHexString(a);
        String b2 = Integer.toHexString(b);
        String c2 = Integer.toHexString(c);
        System.out.print ("HEX");
        System.out.print(" ");
        System.out.println(a2 + "+" + b2 + "=" + c2);


       // Восьмиричная форма
        String a3 = Integer.toOctalString(a);
        String b3 = Integer.toOctalString(b);
        String c3 = Integer.toOctalString(c);
        System.out.print("OCT");
        System.out.print(" ");
        System.out.println(a3 + "+" + b3 + "=" + c3);


}}

