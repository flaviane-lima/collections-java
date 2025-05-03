package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;

    private int codigoConvinte;

    // construtores
    public Convidado(String nome, int codigoConvinte) {
        this.nome = nome;
        this.codigoConvinte = codigoConvinte;
    }

    //os getters
    public String getNome() {
        return nome;
    }

    public int getCodigoConvinte() {
        return codigoConvinte;
    }

    // para não contar o convinte de código duplicado
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvinte == convidado.codigoConvinte;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvinte);
    }

    //para imprimir
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvinte=" + codigoConvinte +
                '}';
    }
}
