import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long lg1 = sc.nextLong();

        System.out.println(Fibonacci.fibo(lg1));
    }
}
