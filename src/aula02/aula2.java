package aula02;
import java.util.Scanner;


public class aula2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
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


    }

}
