package list.OperacoesBasicas;

public class Main {
    //testando os métodos
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O NÚMERO TOTAL DE ELEMENTOS DA LISTA É? " + listaTarefa.obterNumeroTotalTarefas());

        //adicionando tarefa
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O NÚMERO TOTAL DE ELEMENTOS DA LISTA É? " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O NÚMERO TOTAL DE ELEMENTOS DA LISTA É? " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
