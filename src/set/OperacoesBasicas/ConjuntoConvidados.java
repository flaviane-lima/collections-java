package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //método adicionar convidado
    public void adicionarConvidado(String nome, int codigoConvinte) {
        convidadoSet.add(new Convidado(nome, codigoConvinte));
    }

    //método remover convidado
    public void removerConvidadoPorConvinte(int codigoConvinte) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvinte() == codigoConvinte) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //metodo contarConvidados
    public int contarConvidados() {
        return convidadoSet.size();
    }

    //método exibirConvidados
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    //testando os métodos
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorConvinte(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
