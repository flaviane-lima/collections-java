package set.Pesquisa;

import java.util.Objects;

public class Produto {
    //atributos
    private long codigo;

    private String nome;

    private double preco;

    private int quantidade;

    //construtor
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Adiciona getter para acessar variável privada
    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Implementa equals e hashCode para comparação de Produto
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo && Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    //Sobrescreve toString para exibir detalhes do Produto
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
