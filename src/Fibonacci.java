public class Fibonacci {
    static long fibo(Long n){
       if(n < 2){
           return n;
       }else {
           return fibo(n - 1 ) + fibo(n - 2);
       }
    }
}
