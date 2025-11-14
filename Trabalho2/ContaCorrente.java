package Trabalho2;

public class ContaCorrente extends Conta implements OperacoesBancarias {
    
    // Taxa cobrada por operação de saque (0,5%)
    private double taxaOperacao = 0.005;
    
    // Construtor - chama o construtor da classe pai
    public ContaCorrente(String numero, String titular) {
        super(numero, titular);
    }
    
    // Polimorfismo - mesmo método com comportamento diferente
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorComTaxa = valor + (valor * taxaOperacao);

        // Chama o método sacar da classe pai com o valor total
        super.sacar(valorComTaxa);
    }
    
    // Transfere dinheiro desta conta para outra
    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor); 
        destino.depositar(valor); 
    }
    
    // Implementação do método da interface
    // Exibe informações da conta no console
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número : " + getNumero());
        System.out.println("Saldo  : R$ " + getSaldo());
        System.out.println();
    }
    
    // Implementação do método abstrato da classe Conta
    @Override
    public void atualizarSaldo() {
        // Método vazio - conta corrente não possui atualização mensal
    }
}
