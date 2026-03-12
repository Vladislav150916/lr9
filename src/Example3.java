import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер создаваемого массива:");
        int length = in.nextInt();


        int[] array = new int[length];

        System.out.println("Введите " + length + " элементов массива:");
        setArray(array, length - 1, in);
        System.out.println("Ваш массив:");
        printArray(array, length - 1);
        in.close();
    }

    static void setArray(int[] arr, int maxIndex, Scanner sc){
        if (maxIndex > 0){
            setArray(arr, maxIndex - 1, sc);
        }
        arr[maxIndex] = sc.nextInt();
    }

    static void printArray(int[] arr, int maxIndex){
        if (maxIndex > 0){
            printArray(arr, maxIndex - 1);
        }
        System.out.print(arr[maxIndex] + " ");
    }
}
