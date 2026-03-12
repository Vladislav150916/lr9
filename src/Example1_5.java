

public class Example1_5 {
    public static void main(String[] args) {
        System.out.println("Ответ: " + fib(5));
    }

    static int i = 1;
    public static int fib(int n){
        System.out.println(i++ + ". Вычисляем число Фибоначчи для позиции " + n);
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
