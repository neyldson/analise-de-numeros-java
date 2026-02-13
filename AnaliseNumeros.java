import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite números positivos (0 encerra):");

        do {
            numero = sc.nextInt();

            if (numero > 0) {
                quantidade++;

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

        } while (numero != 0);

        if (quantidade > 0) {
            System.out.println("Quantidade de números digitados: " + quantidade);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        sc.close();
    }
}