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
            /* Parte 1 do exerc�cio */
            System.out.print("Digite um n�mero inteiro:");
            int numero = Reader.readInt();

            if ( (numero % 2) == 0)  {
                System.out.println(numero+" � par");
            } else {
                System.out.println(numero+" � �mpar");
            }

            /* Parte 2 do exerc�cio */
            System.out.println("=== Ret�ngulo ===");

            System.out.print("Informe a altura:");
            int retAltura = Reader.readInt();
            System.out.print("Informe a largura:");
            int retLargura = Reader.readInt();
            System.out.println("A �rea do ret�ngulo � "+(retAltura*retLargura) );
            System.out.println("");

            /* Parte 3 do exerc�cio */
            System.out.print("Informe um n�mero double:");
            double numDouble = Reader.readDouble();
            System.out.print("Informe um n�mero inteiro:");
            int numInteiro = Reader.readInt();
            int numDoubleInt = (int) numDouble;
            System.out.print("O resultado de "+numInteiro+"^2 +"+numDouble+"-30 � " +((Math.pow(numInteiro, 2)+numDouble-30) ) );
            System.out.println("");
            System.out.println("");

        }




    }

}
