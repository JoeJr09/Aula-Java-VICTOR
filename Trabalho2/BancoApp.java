package Trabalho2;


public class BancoApp {
    public static void main(String[] args) {
        
        // Instanciação de objetos - cria contas para testar o sistema
        ContaCorrente cc = new ContaCorrente("001", "Joel");
        ContaPoupanca cp = new ContaPoupanca("002", "Maria");
        
        // Bloco try-catch - tratamento de exceções
        // Tenta executar operações que podem gerar erros
        try {
            // Depósitos iniciais nas contas
            cc.depositar(1000); 
            cp.depositar(500);  
            
            // Saque da conta corrente (cobra taxa de 0,5%)
            cc.sacar(200); 
            
            // Transferência entre contas (de corrente para poupança)
            cc.transferir(cp, 100); 
            
            // Atualiza saldo da poupança aplicando rendimento mensal
            cp.atualizarSaldo(); 
            
        } catch (SaldoInsuficienteException e) {
            // Captura exceção customizada de saldo insuficiente
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Captura exceção de valores inválidos (negativos/zero)
            System.out.println("Entrada inválida: " + e.getMessage());
        }
        
        // Exibe extratos finais de ambas as contas
        cc.imprimirExtrato(); 
        cp.imprimirExtrato(); 
    }
}
