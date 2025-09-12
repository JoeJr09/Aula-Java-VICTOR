package Aula2;


public class Livro_Fisico extends Livro {

    public Livro_Fisico(Autor autor) {
        super(autor);
    }
    private double taxadeImpressao;

    public double getTaxadeImpressao() {
        return taxadeImpressao;
    }

    public void setTaxadeImpressao(double taxadeImpressao) {
        this.taxadeImpressao = taxadeImpressao;
    }
}
