import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        int size = 3;
        Node head1 = createHead(size);
        Node head2 = createTail(size);

        int newValue = 9;
        System.out.print("Для первого списка:   ");
        head1 = AddFirst(head1, newValue);
        head1 = Insert(head1, newValue, 3);
        System.out.print("Для второго списка:   ");
        AddLast(head2, newValue);

        System.out.println("ToString. значения первого списка:");
        System.out.println(toString(head1));
        System.out.println("ToString. значения второго списка:");
        System.out.println(toString(head2));

        System.out.println("Для первого списка:");
        head1 = RemoveFirst(head1);
        System.out.println("ToString. значения первого списка:");
        System.out.println(toString(head1));
        RemoveLast(head1);
        System.out.println("ToString. значения первого списка:");
        System.out.println(toString(head1));
    }

    public static Node createHead(int count){
        Scanner in = new Scanner(System.in);
        Node head = new Node(0, null);
        Node ref = head;
        System.out.println("CreateHead. Введите " + count + " значений (от первого к последнему):");
        for (int i = 0; i < count; i++){
            int value = in.nextInt();
            if (i == 0){
                head.value = value;
            } else {
                ref.next = new Node(value, null);
                ref = ref.next;
            }
        }
        return head;
    }

    public static Node createTail(int count){
        Scanner in = new Scanner(System.in);
        Node head = new Node(0, null);
        System.out.println("CreateTail. Введите " + count + " значений (от последнего к первому):");
        for (int i = count; i > 0; i--){
            int value = in.nextInt();
            if (i == count){
                head.value = value;
            } else {
                head = new Node(value, head);
            }
        }
        return head;
    }

    public static String toString(Node head){
        StringBuilder sb = new StringBuilder();
        while (head.next != null){
            sb.append(head.value);
            head = head.next;
        }
        sb.append(head.value);
        return sb.toString();
    }

    public static Node AddFirst(Node head, int value){
        System.out.println("Добавляем в начало списка узел со значением " + value);
        return new Node(value, head);
    }

    public static void AddLast(Node head, int value){
        System.out.println("Добавляем в конец списка узел со значением " + value);
        while (head.next != null){
            head = head.next;
        }
        head.next = new Node(value, null);
    }

    public static Node Insert(Node head, int value, int position){
        System.out.println("Вставляем новый узел со значением " + value + " на позицию " + position);
        if (position == 1){
            head = new Node(value, head);
            return head;
        }
        Node ref = head;
        for (int i = 0; i < position - 1; i++){//А если вставляется первый элемент???
            if (i == position - 2){
                ref.next = new Node(value, ref.next);
                return head;
            }
            ref = ref.next;
        }
        return head;
    }

    public static Node RemoveFirst(Node head){
        System.out.println("Удаляем первый элемент списка");
        head = head.next;
        return head;
    }

    public static void RemoveLast(Node head){
        System.out.println("Удаляем последний элемент списка");
        while (head.next.next != null){
            head = head.next;
        }
        head.next = null;
    }

    public static Node RemovePosition(Node head, int position){
        System.out.println("Удаляем элемент под номером " + position);
        Node ref = head;
        for (int i = 0; i <= position - 1; i++){
            if (i >= position - 2){
                ref.next = ref.next.next;
                return head;
            } else {
                ref = ref.next;
            }
        }
        return head;
    }
}
