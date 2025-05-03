package map.OperacoesBasica;


import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    //constutor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //metodo adicionando contato
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);

    }

    //metodo removendo contato
    public void removerContato(String nome) {
        //se a agendamap não estiver vazia, remove contato
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    //método exibir contato
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    //método pesquisar por nome
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    //testando os métodos
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //exibindo contato
        System.out.println("Pesquisa vazia pois está sem contato");
        agendaContatos.exibirContatos();

        //testar adicionando contato
        System.out.println("Adicionando Contato");
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 32916101);
        agendaContatos.adicionarContato("Camila DIO", 2456893);
        agendaContatos.adicionarContato("Maria Silva", 32916101);

        System.out.println("Exibindo contato adicionados");
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila Dio"));


    }

}
