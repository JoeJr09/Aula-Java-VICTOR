package Aula2;

public class Main {
    public static void main(String[] args) {

        //aula2
        Autor autor1 = new Autor();
        autor1.setNomeAutor("J.R.R Tolkien");
        autor1.setEmailAutor("jrrtolkien@gmail.com");
        autor1.setCPFAutor("123.456.789-00");

        Autor autor2 = new Autor();
        autor2.setNomeAutor("J.K Rowling");
        autor2.setEmailAutor("jkrowling@gmail.com");
        autor2.setCPFAutor("123.456.799-00");

        //aula3
        Ebook ebook1 = new Ebook(autor1);
        ebook1.setNome("Herança em Java");
        ebook1.setWaterMark("watermark");
        ebook1.setDescricao("Teste de herança");
        ebook1.setValor(50);
        ebook1.setIsbn("468-487-963-1");

        ebook1.mostrarDetalhes();
        ebook1.aplicarDescontoDe(15);

        System.out.println("Valor do Ebook: " + ebook1.getValor());

        //aula2 de novo
        Livro livro1 = new Livro(autor1);
        livro1.setNome("O Senhor dos Anéis.");
        livro1.setDescricao("Uma história de fantasia medieval.");
        livro1.setValor(200);
        livro1.setIsbn("123-456-78-9");

        Livro livro2 = new Livro(autor2);
        livro2.setNome("Harry Potter e a Pedra Filosofal");
        livro2.setDescricao("Uma historia de magia e mistério");
        livro2.setValor(300);
        livro2.setIsbn("123-456-56-9");

        livro1.setAutor(autor1);
        livro2.setAutor(autor2);

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();

        livro1.aplicarDescontoDe(20);
        livro2.aplicarDescontoDe(15);

        System.out.println("O livro agora custa: " + livro1.getValor());
        System.out.println("O livro agora custa: " + livro2.getValor());
        System.out.println(livro1.temAutor());
        System.out.println(livro2.temAutor());
    }
}
