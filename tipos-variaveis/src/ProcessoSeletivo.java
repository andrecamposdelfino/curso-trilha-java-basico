import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();        
    }

    public static void selecaoCandidatos(){
        String [] candidatos ={"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOSE"};
        
        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionado < 5 && candidatoAtual < candidatos.length){
             String candidato = candidatos[candidatoAtual];
             double salarioPretendido = valorPretendido();
             System.out.println("O Candidato " + candidato + " solicitou este salario : " + salarioPretendido);

             if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato " + candidato + " foi selecionado");
                candidatosSelecionado++;
             }
             candidatoAtual++;
        }
            
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisaCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS");
        }
    }
}