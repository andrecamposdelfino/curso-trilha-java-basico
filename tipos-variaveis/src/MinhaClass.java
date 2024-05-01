import java.util.Scanner;
public class MinhaClass {
    
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome : ");
        String nome = scanner.next();

        System.out.println("Digite a sua Idade : ");
        int idade = scanner.nextInt();

        System.err.println("Digite a sua altura : ");
        Double altura = scanner.nextDouble();

        System.out.println("Nome :" + nome);
        System.out.println("Idade :" + idade);
        System.out.println("Altura :" + altura);

    }
}
