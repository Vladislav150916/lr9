

public class Example5_2 {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node tail;
        Node ref = head;

        for (int i = 1; i <= 9; i++){
            tail = new Node(i, null);
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
