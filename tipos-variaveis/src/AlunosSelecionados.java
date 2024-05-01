import java.util.concurrent.ThreadLocalRandom;

public class AlunosSelecionados {
    public static void main(String[] args) {
        selecionaAlunos();  
    }

    public static int geraNota(){
        return ThreadLocalRandom.current().nextInt(2,5);
    }

    public static void selecionaAlunos(){
        String [] candidatos ={"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JOSE"};
        int alunoAtual = 0;
        int contador = 0;
        while(alunoAtual < 5 && alunoAtual < candidatos.length){
            int nota = geraNota();
            System.out.println("O aluno atual é : " + candidatos[alunoAtual] + " Sua nota é :" + nota);
            if(nota > 3){
                System.out.println("O Aluno que tirou nota maior que 3 : " + candidatos[alunoAtual]);
            }
            alunoAtual++;
        }
        contador++;
    }

   

}
