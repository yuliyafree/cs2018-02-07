package by.it.lipatava.lesson02;

import java.sql.SQLOutput;
import java.util.Scanner;

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
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        String dec = String.format("DEC:%d+%d=%d", a, b, sum);
        System.out.println(dec);
        String bin = String.format("BIN:%s+%s=%s",
                Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(sum));
        System.out.println(bin);
        String hex = String.format("HEX:%x+%x=%x", a, b, sum);
        System.out.println(hex);
        String oct = String.format("OCT:%o+%o=%o", a, b, sum);
        System.out.println(oct);

    }


}
