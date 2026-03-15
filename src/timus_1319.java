import java.util.Scanner;

public class timus_1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[][] table = new int[n][n];
        int number = 1;

        for (int d = -(n - 1); d <= n - 1; d++) {
            for (int i = 0; i < n; i++) {
                int j = i - d;
                if (j >= 0 && j < n) {
                    table[i][j] = number++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}