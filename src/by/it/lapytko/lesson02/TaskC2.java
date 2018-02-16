package by.it.lapytko.lesson02;

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
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int result=i+j;
        System.out.print("DEC:34+26=");
        System.out.println(result);
            System.out.print("BIN:");
        System.out.print(Integer.toBinaryString(i)+"+"+Integer.toBinaryString(j)+"=");
        System.out.println(Integer.toBinaryString(result));
        System.out.print("HEX:");
        System.out.print(Integer.toHexString(i)+"+"+Integer.toHexString(j)+"=");
        System.out.println(Integer.toHexString(result));
        System.out.print("OCT:");
        System.out.print(Integer.toOctalString(i)+"+"+Integer.toOctalString(j)+"=");
        System.out.println(Integer.toOctalString(result));



    }


}
