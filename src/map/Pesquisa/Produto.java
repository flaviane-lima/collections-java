package map.Pesquisa;

public class Produto {
    //atributos
    private String nome;

    private  double preco;

    private int quatidade;

    //construtores
    public Produto(String nome, double preco, int quatidade) {
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuatidade() {
        return quatidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quatidade=" + quatidade +
                '}';
    }
}
