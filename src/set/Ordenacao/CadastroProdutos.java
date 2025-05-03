package set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    //construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //método adicionar produto
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    //exibir por nome os produtos
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    //exibindo produto por preço
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPoPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPoPreco.addAll(produtoSet);
        return produtosPoPreco;
    }

    //testando os métodos
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //adicionar produtos
        cadastroProdutos.adicionarProduto(1l, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2l, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1l, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9l, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
