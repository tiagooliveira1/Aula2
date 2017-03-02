package aula02;
import java.util.Scanner;


public class aula2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        while (true) {
            System.out.print("Digite um número:");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();

            System.out.print(numero+" é ");
            if (numero > 0)  {
                System.out.println("maior que 0");
            } else if (numero < 0) {
                System.out.println("menor que 0");
            } else {
                System.out.println("é zero!");
            }

            System.out.println("");
            System.out.println("=== Comparando 2 números ===");
            System.out.println("");

            System.out.print("Digite o primeiro número:");
            int primeiroNumero = sc.nextInt();
            System.out.print("Digite o segundo número:");
            int segundoNumero = sc.nextInt();
            if(primeiroNumero > segundoNumero) {
                System.out.println("O número "+primeiroNumero+" é maior que "+segundoNumero);
            } else if(primeiroNumero < segundoNumero) {
                System.out.println("O número "+primeiroNumero+" é menor que "+segundoNumero);
            } else {
                System.out.println("O número "+primeiroNumero+" é igual ao número "+segundoNumero);
            }
        }



    }

}
