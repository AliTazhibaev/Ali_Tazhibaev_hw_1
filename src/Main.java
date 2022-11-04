import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String yourName;
        final int NUM = 706206006;
        String word = "Hello ";
        yourName = "Arstan";
        System.out.println(word + " " + yourName + ", the replenishment of the balance was successful to the number " + NUM);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner in =new Scanner(System.in);
        System.out.println("введите ваше имя:");
       String name = in.nextLine();
        System.out.println("привет "+ name+ " ты лучший");

    }


}

