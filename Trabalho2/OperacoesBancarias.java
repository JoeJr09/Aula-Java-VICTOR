package Trabalho2;

// Interface - contrato que define operações obrigatórias
// Classes que implementam esta interface DEVEM ter esses métodos
// Interface permite polimorfismo - diferentes classes, mesma estrutura
public interface OperacoesBancarias {
    // Método para transferir dinheiro entre contas
    // Pode lançar exceção se não houver saldo
    void transferir(Conta destino, double valor) throws SaldoInsuficienteException;
    
    // Método para exibir extrato da conta
    void imprimirExtrato();
}
