import java.util.Scanner;

/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.IMPORTANTE
        Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */
public class Segundo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();
        sc.close();

        int a = 0, b = 1, c;

        while (b <= num) {
            if (num == b) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
                return;
            }
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(num + " não pertence à sequência de Fibonacci.");
    }

}
