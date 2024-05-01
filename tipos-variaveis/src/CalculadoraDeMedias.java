import java.util.Scanner;

public class CalculadoraDeMedias {
   
    public static void main(String[] args) {
        String [] alunos = {"Andre", "Janne", "Wesley", "Arthur"};
        Scanner scan = new Scanner(System.in);
        double media = calculaMediaTurma(alunos, scan);
        System.out.println("A média da turma é : " + media);
    }

    public static double calculaMediaTurma(String [] alunos, Scanner scan){
        double soma = 0;
        for(String aluno : alunos){
            System.out.println("Digite a noa do aluno : " + aluno);
            double nota = scan.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
