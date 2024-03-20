package Application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a String a ser invertida: ");
        String nameString = sc.nextLine();

        String inverter = inverterString(nameString);
        System.out.println("String invertida: " + inverter);
    }

    public static String inverterString(String nameString) {
        char[] caracteres = nameString.toCharArray();
        int comeco = 0;
        int fim = caracteres.length - 1;

        while (comeco < fim) { // Troca os caracteres de posição
            char temp = caracteres[comeco]; 
            caracteres[comeco] = caracteres[fim];
            caracteres[fim] = temp;

            comeco++;
            fim--;
        }
        
        return new String(caracteres);
    }
}
