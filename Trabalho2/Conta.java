package Trabalho2;

// Classe abstrata base para diferentes tipos de conta bancária
// Não pode ser instanciada diretamente, serve como modelo para subclasses
public abstract class Conta {
    // Atributos privados - encapsulamento protege os dados
    private String numero;
    private String titular;
    protected double saldo; // Protected permite acesso nas subclasses
    
    // Construtor - inicializa a conta com saldo zero
    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Método para adicionar dinheiro na conta
    public void depositar(double valor) {
        // Validação: não permite depósito de valor negativo ou zero
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        this.saldo += valor;
    }
    
    // Método para retirar dinheiro da conta
    // throws indica que pode lançar uma exceção customizada
    public void sacar(double valor) throws SaldoInsuficienteException {
        // Validação: não permite saque de valor negativo ou zero
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
        // Verifica se há saldo suficiente antes de sacar
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        this.saldo -= valor;
    }
    
    // Métodos getters - permitem acesso controlado aos atributos privados
    public double getSaldo() {
        return saldo;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    // Método abstrato - obriga subclasses a implementarem sua versão
    // Cada tipo de conta terá sua regra de atualização de saldo
    public abstract void atualizarSaldo();
}
