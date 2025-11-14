package Trabalho2;

// Classe principal - executa o programa
public class BancoApp {
    public static void main(String[] args) {
        
        // Instanciação de objetos - cria contas para testar o sistema
        ContaCorrente cc = new ContaCorrente("001", "Joel");
        ContaPoupanca cp = new ContaPoupanca("002", "Maria");
        
        // Bloco try-catch - tratamento de exceções
        // Tenta executar operações que podem gerar erros
        try {
            // Depósitos iniciais nas contas
            cc.depositar(1000); // Adiciona R$ 1000 na conta corrente
            cp.depositar(500);  // Adiciona R$ 500 na poupança
            
            // Saque da conta corrente (cobra taxa de 0,5%)
            cc.sacar(200); // Saca R$ 200 + taxa = R$ 201
            
            // Transferência entre contas (de corrente para poupança)
            cc.transferir(cp, 100); // Transfere R$ 100 + taxa
            
            // Atualiza saldo da poupança aplicando rendimento mensal
            cp.atualizarSaldo(); // Aplica 0,3% de rendimento
            
        } catch (SaldoInsuficienteException e) {
            // Captura exceção customizada de saldo insuficiente
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Captura exceção de valores inválidos (negativos/zero)
            System.out.println("Entrada inválida: " + e.getMessage());
        }
        
        // Exibe extratos finais de ambas as contas
        cc.imprimirExtrato(); // Mostra saldo final da conta corrente
        cp.imprimirExtrato(); // Mostra saldo final da poupança
    }
}
