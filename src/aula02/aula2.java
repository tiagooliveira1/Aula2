package aula02;
import java.util.Scanner;


public class aula2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        while (true) {
            System.out.print("Digite um n�mero:");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();

            System.out.print(numero+" � ");
            if (numero > 0)  {
                System.out.println("maior que 0");
            } else if (numero < 0) {
                System.out.println("menor que 0");
            } else {
                System.out.println("� zero!");
            }

            System.out.println("");
            System.out.println("=== Comparando 2 n�meros ===");
            System.out.println("");

            System.out.print("Digite o primeiro n�mero:");
            int primeiroNumero = sc.nextInt();
            System.out.print("Digite o segundo n�mero:");
            int segundoNumero = sc.nextInt();
            if(primeiroNumero > segundoNumero) {
                System.out.println("O n�mero "+primeiroNumero+" � maior que "+segundoNumero);
            } else if(primeiroNumero < segundoNumero) {
                System.out.println("O n�mero "+primeiroNumero+" � menor que "+segundoNumero);
            } else {
                System.out.println("O n�mero "+primeiroNumero+" � igual ao n�mero "+segundoNumero);
            }
        }



    }

}
