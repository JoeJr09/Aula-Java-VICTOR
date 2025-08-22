//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "O senhor dos Anéis";
        livro.descricao = "Livro de Fantasia medieval";
        livro.valor = 100.0;
        livro.isbn = "123-456-78-9";

        System.out.println("Livro 1");
        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();

        outroLivro.nome = "O Pequeno Príncipe";
        outroLivro.descricao = "Uma historia de fantasia";
        outroLivro.valor = 100.0;
        outroLivro.isbn = "321-654-87-8";

        System.out.println("Livro 2");
        outroLivro.mostrarDetalhes();

    }
}