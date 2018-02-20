package by.it.lipatava.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs){

        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName()+" ");

        }
        System.out.println("");


    };
    static double averageAge(Dog[] dogs){
        double sum=0;
        for (int i = 0; i < dogs.length ; i++) {
            sum=sum+dogs[i].getAge();

        }
    return sum/ dogs.length;

    };
}
