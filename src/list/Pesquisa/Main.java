package list.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("livro 2", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("livro 4", "Autor 4", 1994);

        //chamando o método pesquisarPorAutor
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
