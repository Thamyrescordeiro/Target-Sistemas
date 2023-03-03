

 /*Escreva um programa que inverta os caracteres de um string.

         IMPORTANTE:
         a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
         b) Evite usar funções prontas, como, por exemplo, reverse;*/


 import java.util.Scanner;
public class Quinto {
        public static void main(String[] args) {
            // lê a string do usuário
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String str = sc.nextLine();

            // converte a string em um array de caracteres
            char[] array = str.toCharArray();

            // inverte os caracteres no array
            int n = array.length;
            for (int i = 0; i < n / 2; i++) {
                char temp = array[i];
                array[i] = array[n - i - 1];
                array[n - i - 1] = temp;
            }

            // cria uma nova string a partir do array de caracteres invertido
            String resultado = new String(array);

            // exibe o resultado
            System.out.println("A string invertida é: " + resultado);
        }
    }


