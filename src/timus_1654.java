import java.util.Scanner;

public class timus_1654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int length = sb.length();
            if (length > 0 && sb.charAt(length - 1) == ch) {
                sb.deleteCharAt(length - 1);
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        in.close();
    }
}
