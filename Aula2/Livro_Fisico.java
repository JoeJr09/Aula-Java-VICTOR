package Aula2;

public class Livro_Fisico extends Livro {
    private double taxadeImpressao;

    public Livro_Fisico(Autor autor) {
        super(autor);
    }

    public double getTaxadeImpressao() {
        return getValor() * 5 / 100;
    }

    public void setTaxadeImpressao(double taxadeImpressao) {
        this.taxadeImpressao = taxadeImpressao;
    }

    @Override
    public void mostrarDetalhes() {
        String mensagem = "Detalhes do livro físico: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Taxa de Impressão: " + getTaxadeImpressao());
        System.out.println("------------");

        if (temAutor()) {
            getAutor().mostrarDetalhesAutor();
        }

        System.out.println("-----------");
    }
}
