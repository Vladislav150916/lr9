

public class Example5_2 {
    public static void main(String[] args) {
        Node head = null;
        Node tail;
        Node ref;

        for (int i = 0; i <= 9; i++){
            tail = new Node(i, null);
            if (i == 0){
                head = tail;
                continue;
            }
            ref = head;
            while (ref.next != null){
               ref = ref.next;
            }
            ref.next = tail;
        }

        while (head != null){
            System.out.print(" " + head.value);
            head = head.next;
        }
    }
}
