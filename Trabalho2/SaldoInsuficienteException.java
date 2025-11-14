package Trabalho2;

// Classe de exceção customizada - tratamento de erros específicos
// extends Exception = herda comportamento de exceções do Java
// Usada quando tentamos sacar mais dinheiro do que temos na conta
public class SaldoInsuficienteException extends Exception {
    // Construtor recebe mensagem de erro personalizada
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); // Passa mensagem para classe Exception
    }
}
