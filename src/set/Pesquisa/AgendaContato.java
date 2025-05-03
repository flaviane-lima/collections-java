package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    //atributos
    private Set<Contato> contatoSet;

    //construtor
    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    //metodo adicionar contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //metodo exibir contato
    public void exibirContato() {
        System.out.println(contatoSet);
    }

    //metodo pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //atualiza contato
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    //testando os métodos
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        //exibindo contato
        System.out.println("Pesquisa vazia pois está sem contato");
        agendaContato.exibirContato();

        //testar adicionando contato
        System.out.println("Adicionando Contato");
        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 0);
        agendaContato.adicionarContato("Camila Cavalcante", 32916101);
        agendaContato.adicionarContato("Camila DIO", 2456893);
        agendaContato.adicionarContato("Maria Silva", 32916101);

        System.out.println("Exibindo contato adicionados");
        agendaContato.exibirContato();

        //testanto pesquisando por nome
        System.out.println(agendaContato.pesquisarPorNome("Camila"));

        //atualizando um novo contato
        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Maria Silva", 999244006));
    }

}
