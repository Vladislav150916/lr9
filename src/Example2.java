import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = in.nextInt();

        System.out.println("Число " + number + " в двоичной системе: " + toBin(number));
    }

    static String toBin(int number){
        if (number < 0) {
            return "-" + toBin(-number);
        }

        if (number < 2) {
            return Integer.toString(number);
        }

        return toBin(number / 2) + (number % 2);
    }
}



