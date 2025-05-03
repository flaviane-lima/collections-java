package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutoMap;

    //construtor

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    //metodo adicionar
    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    //exibindo produto
    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    //método calcular o valor total do estoque
    public double calcularValorEstoque() {
        //inicializando uma variável
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuatidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //metodo para obter o produto mais caro
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p: estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    //testando os métodos
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        //adicionando
        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2l, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3l, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorEstoque());

        System.out.println("Produto mais caro:" + estoque.obterProdutoMaisCaro());
    }
}


