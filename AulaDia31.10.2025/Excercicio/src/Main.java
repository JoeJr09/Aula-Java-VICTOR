class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: " + saldo);
        }
        if (valor <= 0) {
            throw new SaldoInsuficienteException("Valor de saque deve ser positivo.");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de " + valor + " realizado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        System.out.println("Saldo inicial: " + conta.getSaldo());

        try {
            conta.sacar(300);
            System.out.println("Saldo apos saque: " + conta.getSaldo());

            conta.sacar(800);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Saldo final: " + conta.getSaldo());
        }
    }
}