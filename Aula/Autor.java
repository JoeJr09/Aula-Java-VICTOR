package Aula;
public class Autor {
    String nomeAutor;
    String emailAutor;
    String cpfAutor;

    void mostrarDetalhesAutor(){
        String mensagem = "Detalhes do autor";
        System.out.println(mensagem);
        System.out.println("Nome: " + nomeAutor);
        System.out.println("Email: " + emailAutor);
        System.out.println("CPF: " + cpfAutor);

    }
}
