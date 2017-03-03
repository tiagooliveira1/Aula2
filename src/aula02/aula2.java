package aula02;
//import java.util.Scanner;

//import java.util.Scanner;
import com.opet.util.Reader;



public class aula2
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        while (true) {
            /* Parte 1 do exercício */
            System.out.print("Digite um número inteiro:");
            int numero = Reader.readInt();

            if ( (numero % 2) == 0)  {
                System.out.println(numero+" é par");
            } else {
                System.out.println(numero+" é ímpar");
            }

            /* Parte 2 do exercício */
            System.out.println("=== Retângulo ===");

            System.out.print("Informe a altura:");
            int retAltura = Reader.readInt();
            System.out.print("Informe a largura:");
            int retLargura = Reader.readInt();
            System.out.println("A área do retângulo é "+(retAltura*retLargura) );
            System.out.println("");

            /* Parte 3 do exercício */
            System.out.print("Informe um número double:");
            double numDouble = Reader.readDouble();
            System.out.print("Informe um número inteiro:");
            int numInteiro = Reader.readInt();
            int numDoubleInt = (int) numDouble;
            System.out.print("O resultado de "+numInteiro+"^2 +"+numDouble+"-30 é " +((Math.pow(numInteiro, 2)+numDouble-30) ) );
            System.out.println("");
            System.out.println("");

        }




    }

}
