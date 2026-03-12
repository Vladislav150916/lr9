
import java.util.LinkedList;
import java.util.Scanner;

public class Example7_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество человек:");
        int N = in.nextInt();

        LinkedList<Integer> people = new LinkedList<>();

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

/*
Доступ по индексу в ArrayList выполняется быстрее, чем в LinkedList, потому что:

ArrayList хранит элементы в обычном массиве. Обращение по индексу — это прямая операция чтения ячейки массива за константное время O(1).

LinkedList хранит элементы в виде связанных узлов. Чтобы получить элемент по индексу, нужно пройти по цепочке от начала или конца до нужной позиции, что занимает время O(n). Чем больше список, тем больше шагов требуется.

Таким образом, для операции get(index) ArrayList всегда быстрее благодаря структуре данных с произвольным доступом.
 */