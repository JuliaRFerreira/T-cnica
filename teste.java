package estagio;
import java.util.Scanner;

public class teste {

    public static long fibo(int numero) {
    	if (numero <= 0) return 0;
        if (numero == 1) return 1;

        long fib1 = 0, fib2 = 1, sum = fib1 + fib2;

        for (int i = 2; i < numero; i++) {
            long fib = fib1 + fib2;
            sum += fib;
            fib1 = fib2;
            fib2 = fib;
        }

        return sum;
    }

    public static void main(String[] args) {
    	int numero ;
    	
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Digite um número: ");
        	numero = scanner.nextInt();
        	scanner.close();
        
        long sum = fibo(numero);
        
        System.out.println("A soma dos " + numero + " primeiros números da sequência de Fibonacci é: " + sum);
        
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        		} else {
        			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        		}
    }
    
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        	int a = 0;
        	int b = 1;
        	
        	while (b < n) {
        		int temp = b;
        		b = a + b;
        		a = temp;
        	}
        return b == n || n == 0;
    }
    
}