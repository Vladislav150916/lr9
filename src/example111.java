import java.util.*;

public class example111 {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        SortedSet<Integer> treeSet1 = new TreeSet<>();

        for (int i = 0; i < 5_000_000; i++){
            arrayDeque1.add(i);
            arrayList1.add(i);
            treeSet1.add(i);
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5_000_000; i++){
            arrayList2.add(i);
        }


        System.out.println("Время выполнения операции добавления в начало arrayDeque1 = " + getTimeAddFirst(arrayDeque1));
        System.out.println("Время выполнения операции добавления в начало arrayList1 = " + getTimeAddFirst(arrayList1));
        System.out.println("Время выполнения операции добавления в начало treeSet1 = операция не поддерживается");

        System.out.println("Время выполнения операции добавления в конец arrayDeque1 = " + getTimeAddLast(arrayDeque1));
        System.out.println("Время выполнения операции добавления в конец arrayList1 = " + getTimeAddLast(arrayList1));
        System.out.println("Время выполнения операции добавления в конец treeSet1 = операция не поддерживается");

        System.out.println("Время выполнения операции добавления в середину arrayDeque1 = операция не поддерживается");
        System.out.println("Время выполнения операции добавления в середину arrayList1 = " + getTimeAddSeredina(arrayList1));
        System.out.println("Время выполнения операции добавления в середину treeSet1 = операция не поддерживается");

        System.out.println("Время выполнения операции удаления из начала arrayDeque1 = " + getTimeDeleteFirst(arrayDeque1));
        System.out.println("Время выполнения операции удаления из начала arrayList1 = " + getTimeDeleteFirst(arrayList1));
        System.out.println("Время выполнения операции удаления из начала treeSet1 = " + getTimeDeleteFirst(treeSet1));

        System.out.println("Время выполнения операции удаления из конца arrayDeque1 = " + getTimeDeleteLast(arrayDeque1));
        System.out.println("Время выполнения операции удаления из конца arrayList1 = " + getTimeDeleteLast(arrayList1));
        System.out.println("Время выполнения операции удаления из конца treeSet1 = " + getTimeDeleteLast(treeSet1));

        System.out.println("Время выполнения операции удаления из середины arrayDeque1 = операция не поддерживается");
        System.out.println("Время выполнения операции удаления из середины arrayList1 = " + getTimeDeleteSeredina(arrayList1));
        System.out.println("Время выполнения операции удаления из середины treeSet1 = операция не поддерживается");

        System.out.println("Время выполнения операции доступ по индексу arrayDeque1 = операция не поддерживается");
        System.out.println("Время выполнения операции доступ по индексу arrayList1 = " + getTimeGetIndex(arrayList1));
        System.out.println("Время выполнения операции доступ по индексу treeSet1 = операция не поддерживается");

    }

    private static long getTimeAddFirst(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++){
                ((ArrayDeque<Integer>) collection).addFirst(1);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayList<Integer>) collection).addFirst(1);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            System.out.println("Для TreeSet добавление в начало не поддерживается");
        }
        return end - start;
    }

    private static long getTimeAddLast(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayDeque<Integer>) collection).addLast(1);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayList<Integer>) collection).addLast(1);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            System.out.println("Для TreeSet добавление в конец не поддерживается");
        }
        return end - start;
    }

    private static long getTimeAddSeredina(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            System.out.println("Для ArrayDeque добавление в середину не поддерживается");
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayList<Integer>) collection).add(collection.size() / 2, 1);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            System.out.println("Для TreeSet добавление в середину не поддерживается");
        }
        return end - start;
    }

    private static long getTimeDeleteFirst(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayDeque<Integer>) collection).removeFirst();
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayList<Integer>) collection).removeFirst();
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((TreeSet<Integer>) collection).pollFirst();
            }
            end = System.currentTimeMillis();
        }
        return end - start;
    }

    private static long getTimeDeleteLast(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayDeque<Integer>) collection).removeLast();
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayList<Integer>) collection).removeLast();
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((TreeSet<Integer>) collection).pollLast();
            }
            end = System.currentTimeMillis();
        }
        return end - start;
    }

    private static long getTimeDeleteSeredina(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            System.out.println("Для ArrayDeque удаление из середины не поддерживается");
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++) {
                ((ArrayList<Integer>) collection).remove(collection.size() / 2);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            System.out.println("Для TreeSet удаление из середины не поддерживается (только по конкретному значению)");
        }
        return end - start;
    }

    private static long getTimeGetIndex(Collection<Integer> collection){
        long start = 0;
        long end = 0;
        if (collection.getClass() == ArrayDeque.class){
            System.out.println("Для ArrayDeque доступ по индексу не поддерживается");
        }
        if (collection.getClass() == ArrayList.class){
            start = System.currentTimeMillis();
            for(long i = 0; i < 5_000_000_000L; i++) {
                ((ArrayList<Integer>) collection).get(collection.size() / 2);
            }
            end = System.currentTimeMillis();
        }
        if (collection.getClass() == TreeSet.class){
            System.out.println("Для TreeSet доступ по индексу не поддерживается");
        }
        return end - start;
    }
}
