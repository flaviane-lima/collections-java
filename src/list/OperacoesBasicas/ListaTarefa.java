package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //tem um atributo ListaTarefa
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //metodo adicionar
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //metodo remover
    public void removerTarefa(String descrição) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descrição)) {
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //metodo obter numero total de tarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();

    }

    //metodo para obter descrição de uma tarefa
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }



}



