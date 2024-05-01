import java.util.concurrent.ThreadLocalRandom;

public class SelecaoRh {
    // a empresa tem um salario base de 2000 para oferecer
    // e preciso selecionar ate 5 candidatos que esteja dentro dessa faixa salarial

    // String [] candidatos ={"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOSE"};

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    public static double gerarSalarioAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    public static void ligarParaCandidato(String nome){
        System.out.println(nome + " : Parabens voce foi selecionado");
    }
    

    public static void selecaoCandidatos(){
        String [] candidatos ={"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOSE"};
        
        double salarioBase = 1800;
        int candidatoAtual = 0;
        int candidatosSelecionado = 0;
        
        while(candidatosSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioDesejado = gerarSalarioAleatorio();
            System.out.println("Nome do candidato : " + candidato + " Salario desejado : " + salarioDesejado);
            
            if(salarioDesejado > salarioBase){
                System.out.println(candidato + " : Infelizmente não podemos dá esse salario ");
                candidatosSelecionado++;
            }else{
                ligarParaCandidato(candidato);
            }
            candidatoAtual++;
            System.out.println("===========================================================================");
        }
    }



}
