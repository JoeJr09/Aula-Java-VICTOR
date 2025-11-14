package Trabalho2;

// Classe que representa conta poupança
// Herda de Conta e implementa interface OperacoesBancarias
public class ContaPoupanca extends Conta implements OperacoesBancarias {
    
    // Percentual de rendimento mensal (0,3%)
    private double rendimentoMensal = 0.003;
    
    // Construtor - inicializa conta poupança
    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }
    
    // Implementação do método abstrato da classe Conta
    // Aplica o rendimento mensal ao saldo
    @Override
    public void atualizarSaldo() {
        // Calcula e adiciona o rendimento ao saldo atual
        saldo += (saldo * rendimentoMensal);
    }
    
    // Implementação da interface - transfere entre contas
    // Poupança não tem taxa de saque
    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor); // Retira da conta origem (sem taxa)
        destino.depositar(valor); // Adiciona na conta destino
    }
    
    // Exibe extrato da conta poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número : " + getNumero());
        System.out.println("Saldo  : R$ " + getSaldo());
        System.out.println();
    }
}
