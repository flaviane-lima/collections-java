package list.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // metodo adicionando pessoa
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        // Lista original
        System.out.println("Lista original:");
        System.out.println(ordenacaoPessoa.getPessoaList());

        //metodo ordenar por idade
        System.out.println("\nOrdenada por idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        //metodo por ordenar por altura
        System.out.println("\nOrdenada por altura:");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
