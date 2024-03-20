package Application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Informe um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = sc.nextInt();
        
        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
        }
        
        sc.close();
	}

	private static boolean verificarFibonacci(int numero) {
		int a = 0;
        int b = 1;

        do {
            if (a == numero) {
                return true; // Se o numero atual for igual ao numero fornecido, retorna verdadeiro
            }
            int proximo = a + b; // calcula o proximo numero na sequencia de Fibonacci
            a = b;
            b = proximo; 
        } while (a <= numero);

		return false;
	}
	
}

