package by.it.danschikova.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
   /* import java.rmi.registry.LocateRegistry;
    import java.text.DecimalFormat;
    import java.util.Locale;
    import java.util.Scanner;
    */
class TaskC3 {
/*
    static double getWeight(int weight)
    {
        double gm = 3.86;
        double ge = 9.81;

        double getWeight =(gm/ge)*weight;
        long temp = Math.round(getWeight * 100);
        return (double) temp / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        double weightOnMars = getWeight(weight);

        System.out.println(weightOnMars);
    }
}
*/
/*
Locale locale = new Locale("en");
        Locale.setDefault(locale);
 String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(25.0000);
        System.out.println(format);

 */
}