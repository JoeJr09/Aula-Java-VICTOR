package Aula;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nomeAutor = "J.R.R Tolkien";
        autor.emailAutor = "jrrtolkien@gmail.com";
        autor.cpfAutor = "123.456.789-00";


        Livro livro = new Livro();
        livro.nome = "O senhor dos Anéis";
        livro.descricao = "Livro de Fantasia medieval";
        livro.valor = 100.0;
        livro.isbn = "123-456-78-9";

        livro.autor = autor;
        livro.mostrarDetalhes();


        Autor outroAutor = new Autor();
        outroAutor.nomeAutor = "Antonie de Saint";
        outroAutor.emailAutor = "antonine@gmail.com";
        outroAutor.cpfAutor = "123.456.789-00";


        Livro outroLivro = new Livro();

        outroLivro.nome = "O Pequeno Príncipe";
        outroLivro.descricao = "Uma historia de fantasia";
        outroLivro.valor = 100.0;
        outroLivro.isbn = "321-654-87-8";

        outroLivro.autor = outroAutor;
        outroLivro.mostrarDetalhes();

    }
}