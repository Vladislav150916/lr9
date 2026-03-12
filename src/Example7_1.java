import java.util.ArrayList;
import java.util.Scanner;

public class Example7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество человек:");
        int N = in.nextInt();

        ArrayList<Integer> people = new ArrayList<>(N);

        for(int i = 1; i <= N; i++){
            people.add(i);
        }

        int i = 0;
        while (people.size() > 1){
            i = (i + 1) % people.size();
            people.remove(i);
        }
        System.out.println("Остался человек с номером " + people.get(0));
    }
}
