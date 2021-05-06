import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main(String[] args){
        /* criar mensagem que solicite ao usuario o nome e idade

         */
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
         System.out.println("digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("digite o seu peso");
        double peso = scanner.nextDouble();

        //processamento
        String valoresConcatenados = " Oi, meu nome é " + nome + " , tenho " + idade +
                " anos, minha altura é " + altura +  " e estou pensando " + peso + "Kg";


        // SAIDA DE DADOS
        System.out.println(valoresConcatenados);

        scanner.close();

    }

}
