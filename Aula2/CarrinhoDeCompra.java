package Aula2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Livro> livros;
    private double valorTotal;

    public CarrinhoDeCompra() {
        this.livros = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        valorTotal += livro.getValor();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
