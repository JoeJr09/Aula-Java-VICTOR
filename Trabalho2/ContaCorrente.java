package Trabalho2;

// Classe que representa conta corrente
// extends Conta = herança (herda atributos e métodos da classe Conta)
// implements OperacoesBancarias = interface (contrato de métodos obrigatórios)
public class ContaCorrente extends Conta implements OperacoesBancarias {
    
    // Taxa cobrada por operação de saque (0,5%)
    private double taxaOperacao = 0.005;
    
    // Construtor - chama o construtor da classe pai com super()
    public ContaCorrente(String numero, String titular) {
        super(numero, titular);
    }
    
    // @Override indica que estamos sobrescrevendo o método da classe pai
    // Polimorfismo - mesmo método com comportamento diferente
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        // Calcula o valor total incluindo a taxa de operação
        double valorComTaxa = valor + (valor * taxaOperacao);
        // Chama o método sacar da classe pai com o valor total
        super.sacar(valorComTaxa);
    }
    
    // Implementação do método da interface OperacoesBancarias
    // Transfere dinheiro desta conta para outra
    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor); // Retira da conta origem (com taxa)
        destino.depositar(valor); // Adiciona na conta destino
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
    // Conta corrente não tem rendimento mensal
    @Override
    public void atualizarSaldo() {
        // Método vazio - conta corrente não possui atualização mensal
    }
}
