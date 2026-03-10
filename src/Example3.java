import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер создаваемого массива");
        int size = in.nextInt();
        in.close();


        System.out.println("Введите " + size + " элементов массива");
        setArray(size);
    }

    static int[] setArray(int size){

    }
}
