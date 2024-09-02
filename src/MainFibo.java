import java.util.Scanner;

class MainFibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Long lg1 = sc.nextLong();

        System.out.println(Fibonacci.fibo(lg1));
    }
}
