package by.it.danschikova.lesson02;

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
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = i+j;
        System.out.println("DEC:"+i+ "+"+j+"="+ sum);

        String ib = Integer.toBinaryString(i);
        String jb = Integer.toBinaryString(j);
        String sumb = Integer.toBinaryString(sum);
        System.out.println("BIN:"+ib+ "+"+jb+"="+sumb);

        String ih = Integer.toHexString(i);
        String jh = Integer.toHexString(j);
        String sumh = Integer.toHexString(sum);
        System.out.println("HEX:"+ih+ "+"+jh+"="+sumh);

        String io = Integer.toOctalString(i);
        String jo = Integer.toOctalString(j);
        String sumo = Integer.toOctalString(sum);
        System.out.println("OCT:"+io+ "+"+jo+"="+sumo);
    }



        /*
        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number);
        System.out.println(convert);
    }
     */

}
