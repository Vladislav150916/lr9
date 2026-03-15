import java.util.Scanner;

public class timus_1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine().trim();

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        int remainder = sum % 3;

        if (remainder == 0) {
            System.out.println(2);
        } else {
            System.out.println(1);
            System.out.println(remainder);
        }
    }
}
