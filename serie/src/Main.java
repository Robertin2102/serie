public class Main {
    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        int hasta = 8;
        for (int k = 0; k <= hasta; k++) {
            System.out.println(fib(k));
        }
    }
}